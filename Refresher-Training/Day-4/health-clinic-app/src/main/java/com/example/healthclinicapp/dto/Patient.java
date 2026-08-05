package com.example.healthclinicapp.dto;

import com.example.healthclinicapp.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Patient {
    
    private int patientId;
    private String name;
    private Date dateOfBirth;
    private Gender gender;
    private String phone;
    private String address;
}
