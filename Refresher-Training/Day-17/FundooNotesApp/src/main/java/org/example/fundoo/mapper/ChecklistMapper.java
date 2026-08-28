package org.example.fundoo.mapper;

import lombok.Data;
import org.example.fundoo.dto.request.ChecklistRequestDTO;
import org.example.fundoo.dto.response.ChecklistResponseDTO;
import org.example.fundoo.entity.Checklist;
import org.springframework.stereotype.Component;

@Data
@Component
public class ChecklistMapper {

    public Checklist fromDTO(ChecklistRequestDTO checklistRequestDTO){
        return Checklist.builder()
                .itemName(checklistRequestDTO.getItemName())
                .build();
    }

    public ChecklistResponseDTO toDTO(Checklist checklist){
        return ChecklistResponseDTO.builder()
                .checklistId(checklist.getChecklistId())
                .itemName(checklist.getItemName())
                .status(checklist.getStatus())
                .build();
    }
}
