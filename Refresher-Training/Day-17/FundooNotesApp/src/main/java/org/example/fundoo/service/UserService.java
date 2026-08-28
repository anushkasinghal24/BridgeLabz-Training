package org.example.fundoo.service;

import jakarta.transaction.Transactional;
import lombok.Data;
import org.example.fundoo.dto.request.UpdateNoteRequestDTO;
import org.example.fundoo.dto.response.LabelResponseDTO;
import org.example.fundoo.dto.response.NoteResponseDTO;
import org.example.fundoo.entity.Label;
import org.example.fundoo.entity.Note;
import org.example.fundoo.entity.User;
import org.example.fundoo.mapper.LabelMapper;
import org.example.fundoo.repository.LabelRepository;
import org.example.fundoo.repository.NoteRepository;
import org.example.fundoo.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class UserService {

    private final NoteService noteService;
    private final UserRepository userRepository;
    private final LabelRepository labelRepository;
    private final LabelMapper labelMapper;
    private final NoteRepository noteRepository;
    private final LabelService labelService;

    public ResponseEntity<NoteResponseDTO> addNewNote(Note note){
        String username = SecurityContextHolder.getContext()
                .getAuthentication().getName();
        User user = userRepository.findByUsername(username);
        note.setUser(user);
        user.getNotes().add(note);
        return noteService.saveNote(note);
    }

    public ResponseEntity<List<NoteResponseDTO>> findAllNotes(){
        String username = SecurityContextHolder.getContext()
                .getAuthentication().getName();
        return noteService.getAllNotes(username);
    }

    public ResponseEntity<NoteResponseDTO> updateNote(long noteId, UpdateNoteRequestDTO updateNoteRequestDTO){
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return noteService.updateNote(username,noteId,updateNoteRequestDTO);
    }

    public ResponseEntity<List<NoteResponseDTO>> findAllArchivedNotes(){
        String username = SecurityContextHolder.getContext()
                .getAuthentication().getName();
        return noteService.getAllArchivedNotes(username);
    }

    public ResponseEntity<List<NoteResponseDTO>> findNotesByTitle(String titleName){
        String username = SecurityContextHolder.getContext()
                .getAuthentication().getName();
        return noteService.findNotesByTitle(username,titleName);
    }

    public ResponseEntity<List<NoteResponseDTO>> findNotesByLabel(String labelName){
        String username = SecurityContextHolder.getContext()
                .getAuthentication().getName();
        return noteService.findNotesByLabel(username,labelName);
    }

    @Transactional
    public ResponseEntity<Void> pinNote(long noteId){
        String username = SecurityContextHolder.getContext()
                .getAuthentication().getName();

        return noteService.pinNote(username,noteId);
    }

    @Transactional
    public ResponseEntity<Void> unpinNote(long noteId){
        String username = SecurityContextHolder.getContext()
                .getAuthentication().getName();

        return noteService.unpinNote(username,noteId);
    }

    @Transactional
    public ResponseEntity<Void> archiveNote(long noteId){
        String username = SecurityContextHolder.getContext()
                .getAuthentication().getName();

        return noteService.archiveNote(username,noteId);
    }

    @Transactional
    public ResponseEntity<Void> unarchiveNote(long noteId){
        String username = SecurityContextHolder.getContext()
                .getAuthentication().getName();

        return noteService.unarchiveNote(username,noteId);
    }

    @Transactional
    public ResponseEntity<Void> deleteNote( long noteId){
        String username = SecurityContextHolder.getContext()
                .getAuthentication().getName();

        return noteService.deleteNote(username,noteId);
    }

    @Transactional
    public ResponseEntity<LabelResponseDTO> createNewLabel(Label label){

        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userRepository.findByUsername(username);
        return labelService.createNewLabel(label,user);
    }

    @Transactional
    public ResponseEntity<Void> markLabelOnNote(long labelId, long noteId){

        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        Label label = labelRepository.findByLabelIdAndUser_Username(labelId,username);
        Note note = noteRepository.findByNoteIdAndUser_Username(noteId,username);

        return labelService.markLabelOnNote(label,note);
    }

    @Transactional
    public ResponseEntity<Void> deleteLabel(long labelId){

        return labelService.deleteLabel(labelId);
    }

}
