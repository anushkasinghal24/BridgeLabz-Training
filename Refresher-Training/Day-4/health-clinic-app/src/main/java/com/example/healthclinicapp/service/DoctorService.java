package com.example.healthclinicapp.service;

import com.example.healthclinicapp.dto.Doctor;

import java.util.List;

public interface DoctorService {
    public void saveDoctor(Doctor doctor);
    public List<Doctor> viewAllDoctors();
    public Doctor findDoctorById(int id);
    public void deleteDoctorById(int id);
    public void updateDoctorName(int id,String name);
    public void updateDoctorEmail(int id,String email);
    public void updateDoctorPhone(int id,String phone);
}
