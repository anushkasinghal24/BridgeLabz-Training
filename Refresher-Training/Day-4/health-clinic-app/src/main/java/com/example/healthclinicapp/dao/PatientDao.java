package com.example.healthclinicapp.dao;

import com.example.healthclinicapp.dto.Patient;

import java.sql.ResultSet;

import java.util.List;

public interface PatientDao {
    public void savePatient(Patient patient);
    public List<Patient> viewAllPatients();
    public Patient findPatientById(int id);
    public void deletePatientById(int id);
    public void updatePatientName(int id,String name);
    public void updatePatientDOB(int id,String dob);
    public void updatePatientAddress(int id,String add);
    public void updatePatientPhone(int id,String phone);
}
