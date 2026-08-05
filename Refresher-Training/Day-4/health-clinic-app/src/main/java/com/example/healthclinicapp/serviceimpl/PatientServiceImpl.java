package com.example.healthclinicapp.serviceimpl;

import com.example.healthclinicapp.daoimpl.PatientDaoImpl;
import com.example.healthclinicapp.dto.Patient;
import com.example.healthclinicapp.service.PatientService;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    PatientDaoImpl patientDaoImpl = new PatientDaoImpl();
    @Override
    public void savePatient(Patient patient){
        patientDaoImpl.savePatient(patient);
    }
    @Override
    public List<Patient> viewAllPatient()  {
        return patientDaoImpl.viewAllPatients();
    }
    @Override
    public Patient findPatientById(int id){
        return patientDaoImpl.findPatientById(id);
    }
    @Override
    public void deletePatientById(int id){
        patientDaoImpl.deletePatientById(id);
    }
    @Override
    public void updatePatientName(int id,String name){
        patientDaoImpl.updatePatientName(id,name);
    }
    @Override
    public void updatePatientDOB(int id,String dob){
        patientDaoImpl.updatePatientDOB(id,dob);
    }
    @Override
    public void updatePatientAddress(int id,String add){
        patientDaoImpl.updatePatientAddress(id,add);
    }
    @Override
    public void updatePatientPhone(int id,String phone){
        patientDaoImpl.updatePatientPhone(id,phone);
    }
}
