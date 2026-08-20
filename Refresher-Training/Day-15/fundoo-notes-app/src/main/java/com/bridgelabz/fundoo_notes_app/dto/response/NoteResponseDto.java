package com.bridgelabz.fundoo_notes_app.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NoteResponseDto {

    private Long id;
    private String title;
    private String description;
    private String color;
    private boolean pinned;
    private boolean archived;
    private boolean trashed;
}
