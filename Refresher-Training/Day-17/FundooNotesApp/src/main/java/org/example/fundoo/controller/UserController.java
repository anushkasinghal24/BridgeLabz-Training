package org.example.fundoo.controller;

import lombok.Data;
import org.example.fundoo.dto.request.LabelRequestDTO;
import org.example.fundoo.dto.request.NoteRequestDTO;
import org.example.fundoo.dto.request.UpdateNoteRequestDTO;
import org.example.fundoo.dto.response.LabelResponseDTO;
import org.example.fundoo.dto.response.NoteResponseDTO;
import org.example.fundoo.entity.Label;
import org.example.fundoo.entity.Note;
import org.example.fundoo.mapper.LabelMapper;
import org.example.fundoo.mapper.NoteMapper;
import org.example.fundoo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
@Data
public class UserController {
    private final NoteMapper noteMapper;
    private final UserService userService;
    private final LabelMapper labelMapper;

    @PostMapping("/note")
    public ResponseEntity<NoteResponseDTO> addNewNote(@RequestBody NoteRequestDTO noteRequestDTO){
        Note note = noteMapper.fromDTO(noteRequestDTO);
        return userService.addNewNote(note);
    }

    @GetMapping("/notes")
    public ResponseEntity<List<NoteResponseDTO>> getAllNotes(){
        return userService.findAllNotes();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<NoteResponseDTO> updateNote(
            @PathVariable(name = "id") long id,
            @RequestBody UpdateNoteRequestDTO updateNoteRequestDTO
            ){
        return userService.updateNote(id,updateNoteRequestDTO);
    }

    @PutMapping("/pin/{id}")
    public ResponseEntity<Void> pinNote(@PathVariable(name = "id") long id){
        return userService.pinNote(id);
    }

    @PutMapping("/unpin/{id}")
    public ResponseEntity<Void> unpinNote(@PathVariable(name = "id") long id){
        return userService.unpinNote(id);
    }

    @PutMapping("/archive/{id}")
    public ResponseEntity<Void> archiveNote(@PathVariable(name = "id") long id){
        return userService.archiveNote(id);
    }

    @PutMapping("/unarchive/{id}")
    public ResponseEntity<Void> unarchiveNote(@PathVariable(name = "id") long id){
        return userService.unarchiveNote(id);
    }

    @DeleteMapping("/delete/note/{id}")
    public ResponseEntity<Void> deleteNote(@PathVariable(name = "id") long id){
        return userService.deleteNote(id);
    }

    @PostMapping("/label")
    public ResponseEntity<LabelResponseDTO> createLabel(@RequestBody LabelRequestDTO labelRequestDTO){
        Label label = labelMapper.fromDTO(labelRequestDTO);
        return userService.createNewLabel(label);
    }
    @PutMapping("/mark/{labelid}/on/{noteid}")
    public ResponseEntity<Void> markLabelOnNote(
            @PathVariable(name = "labelid") long labelId,
            @PathVariable(name = "noteid") long noteId
    ){
        return userService.markLabelOnNote(labelId,noteId);
    }
    @DeleteMapping("/delete/label/{id}")
    public ResponseEntity<Void> deleteLabel(@PathVariable(name = "id") long id){
        return userService.deleteLabel(id);
    }

    @GetMapping("/archived")
    public ResponseEntity<List<NoteResponseDTO>> findArchivedNotes(){
        return userService.findAllArchivedNotes();
    }

    @GetMapping("/title/{titleName}")
    public ResponseEntity<List<NoteResponseDTO>> findNotesByTitle(@PathVariable(name = "titleName") String titleName){
        return userService.findNotesByTitle(titleName);
    }

    @GetMapping("/label/{labelName}")
    public ResponseEntity<List<NoteResponseDTO>> findNotesByLabelName(@PathVariable(name = "labelName") String labelName){
        return userService.findNotesByLabel(labelName);
    }

}
