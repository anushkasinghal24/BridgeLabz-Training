package org.example.fundoo.service;

import lombok.Data;
import org.example.fundoo.dto.response.RegisterResponseDTO;
import org.example.fundoo.entity.User;
import org.example.fundoo.mapper.UserMapper;
import org.example.fundoo.producer.UserRegistrationProducer;
import org.example.fundoo.repository.UserRepository;
import org.example.fundoo.security.JwtService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Data
public class AuthService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final UserRegistrationProducer userRegistrationProducer;

    public ResponseEntity<RegisterResponseDTO> register(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User user1 = userRepository.save(user);
        userRegistrationProducer.sendRegistrationMessage("User Registered Successfully");
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userMapper.toDTO(user1));
    }

    public ResponseEntity<String> login(String username, String password){
        Authentication authentication = new UsernamePasswordAuthenticationToken(
                username,password
        );
        Authentication authentication1 = authenticationManager.authenticate(
                authentication
        );
        SecurityContextHolder.getContext().setAuthentication(authentication1);
        String token =  jwtService.generateToken(authentication1);
        return ResponseEntity.status(HttpStatus.OK).body(token);
    }
}
