package org.example.fundoo.controller;

import lombok.Data;
import org.example.fundoo.dto.request.ChecklistRequestDTO;
import org.example.fundoo.dto.request.NoteRequestDTO;
import org.example.fundoo.dto.response.ChecklistResponseDTO;
import org.example.fundoo.dto.response.NoteResponseDTO;
import org.example.fundoo.entity.Checklist;
import org.example.fundoo.entity.Note;
import org.example.fundoo.mapper.ChecklistMapper;
import org.example.fundoo.mapper.NoteMapper;
import org.example.fundoo.service.NoteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/note")
@Data
public class NoteController {

    private final NoteService noteService;
    private final NoteMapper noteMapper;
    private final ChecklistMapper checklistMapper;

    @PostMapping()
    public ResponseEntity<NoteResponseDTO> addNote(@RequestBody NoteRequestDTO noteRequestDTO){
        Note note = noteMapper.fromDTO(noteRequestDTO);
        return noteService.saveNote(note);
    }















//    @PutMapping("/pin/{id}")
//    public ResponseEntity<Void> pinNote(@PathVariable long id){
//        return noteService.pinNote(id);
//    }
//    @PutMapping("/unpin/{id}")
//    public ResponseEntity<Void> unpinNote(@PathVariable long id){
//        return noteService.unpinNote(id);
//    }
//    @PutMapping("/archive/{id}")
//    public ResponseEntity<Void> archiveNote(@PathVariable long id){
//        return noteService.archiveNote(id);
//    }
//    @PutMapping("/unarchive/{id}")
//    public ResponseEntity<Void> unarchiveNote(@PathVariable long id){
//        return noteService.unarchiveNote(id);
//    }
//    @PutMapping("/delete/{id}")
//    public ResponseEntity<Void> deleteNote(@PathVariable long id){
//        return noteService.deleteNote(id);
//    }
//    @PutMapping("/undelete/{id}")
//    public ResponseEntity<Void> undeleteNote(@PathVariable long id){
//        return noteService.undeleteNote(id);
//    }
}
