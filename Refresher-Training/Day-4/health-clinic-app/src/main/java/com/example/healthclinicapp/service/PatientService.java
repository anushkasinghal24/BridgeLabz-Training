package com.example.healthclinicapp.service;

import com.example.healthclinicapp.dto.Patient;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

public interface PatientService {
    public void savePatient(Patient patient);
    public List<Patient> viewAllPatient();
    public Patient findPatientById(int id);
    public void deletePatientById(int id);
    public void updatePatientName(int id,String name);
    public void updatePatientDOB(int id,String dob);
    public void updatePatientAddress(int id,String add);
    public void updatePatientPhone(int id,String phone);
}
