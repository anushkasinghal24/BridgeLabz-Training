package com.example.healthclinicapp.dao;

import com.example.healthclinicapp.dto.Doctor;

import java.util.List;

public interface DoctorDao {
    public void saveDoctor(Doctor doctor);
    public void updateDoctorPhone(int id,String phone);
    public void updateDoctorEmail(int id,String email);
    public void updateDoctorName(int id,String name);
    public void deleteDoctorById(int id);
    public Doctor findDoctorById(int id);
    public List<Doctor> viewAllDoctors();
}
