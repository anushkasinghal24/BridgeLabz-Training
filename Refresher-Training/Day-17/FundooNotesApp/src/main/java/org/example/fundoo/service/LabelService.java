package org.example.fundoo.service;

import jakarta.transaction.Transactional;
import lombok.Data;
import org.aspectj.weaver.ast.Not;
import org.example.fundoo.dto.response.LabelResponseDTO;
import org.example.fundoo.entity.Label;
import org.example.fundoo.entity.Note;
import org.example.fundoo.entity.User;
import org.example.fundoo.mapper.LabelMapper;
import org.example.fundoo.repository.LabelRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Data
public class LabelService {

    private final LabelMapper labelMapper;
    private final LabelRepository labelRepository;

    @Transactional
    public ResponseEntity<LabelResponseDTO> createNewLabel(Label label,User user){

        label.setUser(user);
        user.getLabels().add(label);
        return ResponseEntity.status(HttpStatus.CREATED).body(labelMapper.toDTO(label));

    }

    @Transactional
    public ResponseEntity<Void> markLabelOnNote(Label label,Note note){
        note.setLabel(label);
        label.getNotes().add(note);

        return ResponseEntity.status(HttpStatus.OK).body(null);

    }

    @Transactional
    public ResponseEntity<Void> deleteLabel(long id){
        Label label = labelRepository.findById(id).orElseThrow();
        for(Note note : label.getNotes()){
            note.setLabel(null);
        }
        label.getUser().getLabels().remove(label);
        label.setUser(null);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

}
