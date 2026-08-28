package org.example.fundoo.service;

import jakarta.transaction.Transactional;
import lombok.Data;
import org.example.fundoo.Status;
import org.example.fundoo.dto.response.ChecklistResponseDTO;
import org.example.fundoo.entity.Checklist;
import org.example.fundoo.entity.Note;
import org.example.fundoo.mapper.ChecklistMapper;
import org.example.fundoo.repository.ChecklistRepository;
import org.example.fundoo.repository.NoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Data
public class ChecklistService {

    private final ChecklistRepository checklistRepository;
    private final ChecklistMapper checklistMapper;
    private final NoteRepository noteRepository;

    @Transactional
    public ResponseEntity<ChecklistResponseDTO> createChecklist(Checklist checklist,long id){
        Note note = noteRepository.findById(id).orElseThrow();
        checklist.setNote(note);
        note.getChecklists().add(checklist);

        return ResponseEntity.status(HttpStatus.OK).body(
                checklistMapper.toDTO(checklist)
        );
    }

    @Transactional
    public ResponseEntity<Void> deleteChecklist(long id){
        Checklist checklist = checklistRepository.findById(id).orElseThrow();
        checklist.getNote().getChecklists().remove(checklist);
        checklist.setDeleted(true);
        checklist.setNote(null);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    @Transactional
    public ResponseEntity<ChecklistResponseDTO> updateChecklistName(long id,String name){
        Checklist checklist = checklistRepository.findById(id).orElseThrow();
        checklist.setItemName(name);

        return ResponseEntity.status(HttpStatus.OK).body(
                checklistMapper.toDTO(checklist)
        );
    }

    @Transactional
    public ResponseEntity<Void> toggleStatus(long id){
        Checklist checklist = checklistRepository.findById(id).orElseThrow();
        if(checklist.getStatus().name().equals("CHECKED"))
            checklist.setStatus(Status.UNCHECKED);
        else
            checklist.setStatus(Status.CHECKED);

        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
