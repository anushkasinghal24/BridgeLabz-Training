package org.example.fundoo.controller;

import lombok.Data;
import org.example.fundoo.dto.request.ChecklistRequestDTO;
import org.example.fundoo.dto.response.ChecklistResponseDTO;
import org.example.fundoo.entity.Checklist;
import org.example.fundoo.mapper.ChecklistMapper;
import org.example.fundoo.service.ChecklistService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/checklist")
@Data
public class ChecklistController {

    private final ChecklistMapper checklistMapper;
    private final ChecklistService checklistService;

    @PostMapping("note/{id}/add")
    public ResponseEntity<ChecklistResponseDTO> createChecklist(
            @PathVariable(name = "id") long noteId,
            @RequestBody ChecklistRequestDTO checklistRequestDTO
    ){
        Checklist checklist = checklistMapper.fromDTO(checklistRequestDTO);
        return checklistService.createChecklist(checklist,noteId);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCheckList(@PathVariable(name = "id") long id){
        return checklistService.deleteChecklist(id);
    }

    @PutMapping("/id/{id}/name/{name}")
    public ResponseEntity<ChecklistResponseDTO> updateItemName(
            @PathVariable(name = "id") long id,
            @PathVariable(name = "name") String name
    ){
        return checklistService.updateChecklistName(id,name);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> toggleStatus(@PathVariable(name = "id") long id){
        return checklistService.toggleStatus(id);
    }
}
