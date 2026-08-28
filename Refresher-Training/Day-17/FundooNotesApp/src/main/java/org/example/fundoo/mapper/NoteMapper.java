package org.example.fundoo.mapper;

import lombok.Builder;
import lombok.Data;
import org.example.fundoo.dto.request.NoteRequestDTO;
import org.example.fundoo.dto.response.NoteResponseDTO;
import org.example.fundoo.entity.Note;
import org.springframework.stereotype.Component;

@Component
@Builder
public class NoteMapper {
    public Note fromDTO(NoteRequestDTO noteRequestDTO){
        return Note.builder().
                description(noteRequestDTO.getDescription())
                .color(noteRequestDTO.getColor())
                .typeOfNote(noteRequestDTO.getTypeOfNote())
                .title(noteRequestDTO.getTitle())
                .build();
    }

    public NoteResponseDTO toDTO(Note note){
        return NoteResponseDTO.builder()
                .color(note.getColor())
                .description(note.getDescription())
                .typeOfNote(note.getTypeOfNote())
                .title(note.getTitle())
                .build();
    }
}
