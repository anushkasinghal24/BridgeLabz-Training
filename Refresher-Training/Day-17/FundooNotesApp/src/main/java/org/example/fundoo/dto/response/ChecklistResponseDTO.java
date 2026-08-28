package org.example.fundoo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.fundoo.Status;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChecklistResponseDTO {

    private long checklistId;

    private String itemName;

    private Status status;
}
