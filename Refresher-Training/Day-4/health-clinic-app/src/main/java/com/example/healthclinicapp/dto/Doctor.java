package com.example.healthclinicapp.dto;

import com.example.healthclinicapp.enums.Specialization;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Doctor {

    private int doctorId;
    private String name ;
    private Specialization specialization;
    private String phone ;
    private String email;
}
