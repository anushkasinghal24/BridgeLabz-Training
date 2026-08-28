package org.example.fundoo.service;

import lombok.Data;
import org.example.fundoo.dto.request.UpdateNoteRequestDTO;
import org.example.fundoo.dto.response.NoteResponseDTO;
import org.example.fundoo.entity.Note;
import org.example.fundoo.mapper.NoteMapper;
import org.example.fundoo.repository.NoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class NoteService {
    private final NoteMapper noteMapper;

    private final NoteRepository noteRepository;

    public ResponseEntity<List<NoteResponseDTO>> getAllNotes(String username){
        List<Note> notes = noteRepository.findAllByIsDeletedAndIsArchivedAndUser_Username(false,false,username);
        List<NoteResponseDTO> noteResponseDTOS = new ArrayList<>();

        for(Note key : notes){
            noteResponseDTOS.add(noteMapper.toDTO(key));
        }

        return ResponseEntity.status(HttpStatus.OK).body(noteResponseDTOS);
    }

    public ResponseEntity<List<NoteResponseDTO>> getAllArchivedNotes(String username){
        List<Note> notes = noteRepository.findAllByIsArchivedAndUser_Username(true,username);
        List<NoteResponseDTO> noteResponseDTOS = new ArrayList<>();

        for(Note key : notes){
            noteResponseDTOS.add(noteMapper.toDTO(key));
        }

        return ResponseEntity.status(HttpStatus.OK).body(noteResponseDTOS);
    }

    public ResponseEntity<NoteResponseDTO> saveNote(Note note){
        Note note1 = noteRepository.save(note);

        return ResponseEntity.status(HttpStatus.OK).body(noteMapper.toDTO(note1));
    }

    @Transactional
    public ResponseEntity<NoteResponseDTO> updateNote(String username, long noteId, UpdateNoteRequestDTO updateNoteRequestDTO){
        Note note = noteRepository.findByUser_UsernameAndNoteId(username,noteId);
        if(updateNoteRequestDTO.getTitle()!=null){
            note.setTitle(updateNoteRequestDTO.getTitle());
        }
        if(updateNoteRequestDTO.getDescription()!=null){
            note.setDescription(updateNoteRequestDTO.getDescription());
        }
        if(updateNoteRequestDTO.getColor()!=null){
            note.setColor(updateNoteRequestDTO.getColor());
        }
        if(updateNoteRequestDTO.getTypeOfNote()!=null){
            note.setTypeOfNote(updateNoteRequestDTO.getTypeOfNote());
        }

        return ResponseEntity.status(HttpStatus.OK).body(noteMapper.toDTO(note));
    }

    @Transactional
    public ResponseEntity<Void> pinNote(String username,long noteId){
        Note note = noteRepository.findByNoteIdAndUser_Username(noteId,username);
        note.setPinned(true);

        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    @Transactional
    public ResponseEntity<Void> unpinNote(String username,long noteId){
        Note note = noteRepository.findByNoteIdAndUser_Username(noteId,username);
        note.setPinned(false);

        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    @Transactional
    public ResponseEntity<Void> archiveNote(String username,long noteId){
        Note note = noteRepository.findByNoteIdAndUser_Username(noteId,username);;
        note.setArchived(true);

        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    @Transactional
    public ResponseEntity<Void> unarchiveNote(String username,long noteId){
        Note note = noteRepository.findByNoteIdAndUser_Username(noteId,username);
        note.setArchived(false);

        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @Transactional
    public ResponseEntity<Void> deleteNote(String username, long noteId){
        Note note = noteRepository.findByNoteIdAndUser_Username(noteId,username);
        note.getUser().getNotes().remove(note);
        note.setUser(null);
        note.setDeleted(true);

        return ResponseEntity.status(HttpStatus.OK).body(null);
    }


    public ResponseEntity<List<NoteResponseDTO>> findNotesByTitle(String username,String titleName) {

        List<Note> notes = noteRepository.findAllByUser_UsernameAndTitle(username,titleName);
        List<NoteResponseDTO> responseDTOS = new ArrayList<>();

        for(Note note : notes){
            responseDTOS.add(noteMapper.toDTO(note));
        }

        return ResponseEntity.status(HttpStatus.OK).body(responseDTOS);
    }


    public ResponseEntity<List<NoteResponseDTO>> findNotesByLabel(String username,String labelName) {

        List<Note> notes = noteRepository.findAllByLabel_LabelNameAndUser_Username(labelName,username);
        List<NoteResponseDTO> responseDTOS = new ArrayList<>();

        for(Note note : notes){
            responseDTOS.add(noteMapper.toDTO(note));
        }

        return ResponseEntity.status(HttpStatus.OK).body(responseDTOS);
    }
}
