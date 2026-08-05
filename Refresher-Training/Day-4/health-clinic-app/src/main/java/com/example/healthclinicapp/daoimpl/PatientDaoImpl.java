package com.example.healthclinicapp.daoimpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.healthclinicapp.config.DatabaseConfig;
import com.example.healthclinicapp.dao.PatientDao;
import com.example.healthclinicapp.dto.Patient;
import com.example.healthclinicapp.enums.Gender;


public class PatientDaoImpl implements PatientDao {

    DatabaseConfig databaseConfig = new DatabaseConfig();

    public void savePatient(Patient patient){
        String sql = "Insert into patient(name,date_of_birth,gender,phone,address) Values(?,?,?,?,?)";
        try(
                Connection con =databaseConfig.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                ){

            ps.setString(1,patient.getName()) ;
            ps.setDate(2,patient.getDateOfBirth());
            ps.setString(3,patient.getGender().name());
            ps.setString(4,patient.getPhone()) ;
            ps.setString(5,patient.getAddress());

            ps.executeUpdate();

        }

        catch (SQLException e){
            System.out.println("Database communication failed");
        }
    }

    public List<Patient> viewAllPatients(){
        String sql = "select * from patient";
        List<Patient> patients = new ArrayList<>();
        try(Connection connection  = databaseConfig.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ){
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Patient p = Patient.builder().patientId(resultSet.getInt("patient_id"))
                        .name(resultSet.getString("name"))
                        .dateOfBirth(resultSet.getDate("date_of_birth"))
                        .gender( Gender.valueOf(resultSet.getString("gender")))
                        .phone(resultSet.getString("phone"))
                        .address(resultSet.getString("address"))
                        .build();
                patients.add(p);
            }

        } catch (SQLException e){
            System.out.println("Database communication failed");

        }
        return patients;
    }

    @Override
    public Patient findPatientById(int id){
        String sql = "select * from patient where patient_id = ?";
        Patient p = null;
        try(Connection connection = databaseConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            p = Patient.builder().patientId(resultSet.getInt("patient_id"))
                    .name(resultSet.getString("name"))
                    .dateOfBirth(resultSet.getDate("date_of_birth"))
                    .gender(Gender.valueOf(resultSet.getString("gender")))
                    .phone(resultSet.getString("phone"))
                    .address(resultSet.getString("address"))
                    .build();
        }
        catch(SQLException e){
            System.out.println("Database communication failed");
        }
        return p;
    }
    @Override
    public void deletePatientById(int id){
        String sql = "delete from patient where patient_id = ?";
        try(Connection connection = databaseConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Database communication failed");
        }
    }

    @Override
    public void updatePatientName(int id,String name){
        String sql = "update patient set name = ? where patient.patient_id = ?";
        try(Connection connection = databaseConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
            ){
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,id);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            System.out.println("Database connection failed");
        }
    }

    @Override
    public void updatePatientDOB(int id,String dob){
        String sql = "update patient set date_of_birth = ? where patient.patient_id = ?";
        try(Connection connection = databaseConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ){
            preparedStatement.setDate(1,Date.valueOf(dob));
            preparedStatement.setInt(2,id);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            System.out.println("Database connection failed");
        }
    }

    @Override
    public void updatePatientAddress(int id,String add){
        String sql = "update patient set address = ? where patient.patient_id = ?";
        try(Connection connection = databaseConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ){
            preparedStatement.setString(1,add);
            preparedStatement.setInt(2,id);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            System.out.println("Database connection failed");
        }
    }

    @Override
    public void updatePatientPhone(int id,String phone){
        String sql = "update patient set phone = ? where patient.patient_id = ?";
        try(Connection connection = databaseConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ){
            preparedStatement.setString(1,phone);
            preparedStatement.setInt(2,id);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            System.out.println("Database connection failed");
        }
    }


}
