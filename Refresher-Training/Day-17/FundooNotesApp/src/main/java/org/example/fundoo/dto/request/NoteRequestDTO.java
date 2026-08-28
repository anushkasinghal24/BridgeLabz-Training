package org.example.fundoo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NoteRequestDTO {
    private String title;

    private String description;

    private String color;

    private String typeOfNote;
}
