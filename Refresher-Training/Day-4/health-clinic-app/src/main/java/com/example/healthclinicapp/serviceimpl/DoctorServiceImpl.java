package com.example.healthclinicapp.serviceimpl;

import com.example.healthclinicapp.daoimpl.DoctorDaoImpl;
import com.example.healthclinicapp.dto.Doctor;
import com.example.healthclinicapp.service.DoctorService;

import java.util.List;

public class DoctorServiceImpl implements DoctorService {
    DoctorDaoImpl doctorDao = new DoctorDaoImpl();

    @Override
    public void saveDoctor(Doctor doctor){
        doctorDao.saveDoctor(doctor);
    }
    @Override
    public List<Doctor> viewAllDoctors(){
        return doctorDao.viewAllDoctors();
    }
    @Override
    public Doctor findDoctorById(int id){
        return doctorDao.findDoctorById(id);
    }
    @Override
    public void deleteDoctorById(int id){
        doctorDao.deleteDoctorById(id);
    }
    @Override
    public void updateDoctorName(int id,String name){
        doctorDao.updateDoctorName(id,name);
    }
    @Override
    public void updateDoctorEmail(int id,String email){
        doctorDao.updateDoctorEmail(id,email);
    }
    @Override
    public void updateDoctorPhone(int id,String phone){
        doctorDao.updateDoctorPhone(id,phone);
    }
}
