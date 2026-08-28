package org.example.fundoo.mapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.fundoo.dto.request.RegisterRequestDTO;
import org.example.fundoo.dto.response.RegisterResponseDTO;
import org.example.fundoo.entity.User;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Builder
@Component
public class UserMapper {
    public User fromDTO(RegisterRequestDTO registerRequestDTO){
        return User.builder()
                .firstName(registerRequestDTO.getFirstName())
                .lastName(registerRequestDTO.getLastName())
                .password(registerRequestDTO.getPassword())
                .username(registerRequestDTO.getUsername())
                .dateOfBirth(registerRequestDTO.getDateOfBirth())
                .build();
    }

    public RegisterResponseDTO toDTO(User user){
        return RegisterResponseDTO.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .dateOfBirth(user.getDateOfBirth())
                .userId(user.getUserId())
                .username(user.getUsername())
                .password(user.getPassword())
                .build();
    }
}
