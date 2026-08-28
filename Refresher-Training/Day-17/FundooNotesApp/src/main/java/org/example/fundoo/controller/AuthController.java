package org.example.fundoo.controller;

import lombok.Data;
import org.example.fundoo.dto.request.LoginRequestDTO;
import org.example.fundoo.dto.request.RegisterRequestDTO;
import org.example.fundoo.dto.response.RegisterResponseDTO;
import org.example.fundoo.entity.User;
import org.example.fundoo.mapper.UserMapper;
import org.example.fundoo.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/auth")
@Data
public class AuthController {

    private final AuthService authService;
    private final UserMapper userMapper;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponseDTO> register(@RequestBody RegisterRequestDTO registerRequestDTO){
        User user = userMapper.fromDTO(registerRequestDTO);
        return authService.register(user);
    }

    @GetMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequestDTO loginRequestDTO){
        String username = loginRequestDTO.getUsername();
        String password = loginRequestDTO.getPassword();
        return authService.login(username,password);
    }
}
