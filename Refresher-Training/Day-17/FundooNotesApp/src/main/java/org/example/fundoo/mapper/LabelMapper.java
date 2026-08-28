package org.example.fundoo.mapper;

import lombok.Data;
import org.example.fundoo.dto.request.LabelRequestDTO;
import org.example.fundoo.dto.response.LabelResponseDTO;
import org.example.fundoo.entity.Label;
import org.springframework.stereotype.Component;

@Data
@Component
public class LabelMapper {

    public Label fromDTO(LabelRequestDTO labelRequestDTO){
        return Label.builder().labelName(labelRequestDTO.getLabelName())
                .build();
    }

    public LabelResponseDTO toDTO(Label label){
        return LabelResponseDTO.builder()
                .labelName(label.getLabelName())
                .id(label.getLabelId())
                .build();
    }

}
