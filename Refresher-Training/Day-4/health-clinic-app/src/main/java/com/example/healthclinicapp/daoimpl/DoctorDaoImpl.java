package com.example.healthclinicapp.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.healthclinicapp.config.DatabaseConfig ;
import com.example.healthclinicapp.dao.DoctorDao;
import com.example.healthclinicapp.dto.Doctor;
import com.example.healthclinicapp.enums.Specialization;

public class DoctorDaoImpl implements DoctorDao {

    DatabaseConfig databaseConfig = new DatabaseConfig();

    @Override
    public void saveDoctor(Doctor doctor){
        String sql = "Insert into doctor(name,specialization,phone,email) Values(?,?,?,?)";
        try(
                Connection con =databaseConfig.getConnection() ;
                PreparedStatement ps = con.prepareStatement(sql);
        ){

            ps.setString(1,doctor.getName());
            ps.setString(2,doctor.getSpecialization().name());
            ps.setString(3,doctor.getPhone());
            ps.setString(4,doctor.getEmail());

            ps.executeUpdate();

        }
        catch (SQLException e){
            System.out.println( "Database communication failed");
        }
    }

    @Override
    public List<Doctor> viewAllDoctors(){
        String sql = "select * from doctor";
        List<Doctor> doctors = new ArrayList<>();
        try(Connection connection = databaseConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Doctor d = Doctor.builder().doctorId(resultSet.getInt("doctor_id"))
                        .name(resultSet.getString("name"))
                        .phone(resultSet.getString("phone"))
                        .email(resultSet.getString("email"))
                        .specialization(Specialization.valueOf(resultSet.getString("specialization")))
                        .build();
                doctors.add(d);
            }

        } catch (SQLException e){
            System.out.println(" Database communication failed");

        }
        return doctors;
    }

    @Override
    public Doctor findDoctorById(int id){
        String sql = "select * from doctor where doctor_id = ?" ;
        Doctor d = null;
        try(Connection connection = databaseConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            d = Doctor.builder().doctorId(resultSet.getInt("doctor_id"))
                    .name(resultSet.getString("name"))
                    .phone(resultSet.getString("phone"))
                    .email(resultSet.getString("email"))
                    .specialization(Specialization.valueOf(resultSet.getString("specialization")))
                    .build();
        }
        catch(SQLException e){
            System.out.println(" Database communication failed");
        }
        return d;
    }

    @Override
    public void deleteDoctorById(int id){
        String sql = "delete from Doctor where doctor_id = ?";
        try(Connection connection = databaseConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(" Database communication failed");
        }
    }

    @Override
    public void updateDoctorName(int id,String name){
        String sql = " Update Doctor set name = ? where doctor_id = ?";
        try(Connection connection = databaseConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ){
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,id);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            System.out.println(" Database connection failed");
        }
    }

    @Override
    public void updateDoctorEmail(int id,String email){
        String sql = "update doctor set email = ? where doctor_id = ?";
        try(Connection connection = databaseConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ){
            preparedStatement.setString(1,email);
            preparedStatement.setInt(2,id);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            System.out.println(" Database connection failed");
        }
    }

    @Override
    public void updateDoctorPhone(int id,String phone){
        String sql = "update Doctor set phone = ? where doctor_id = ?";
        try(Connection connection = databaseConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ){
            preparedStatement.setString(1,phone);
            preparedStatement.setInt(2,id);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            System.out.println(" Database connection failed");
        }
    }

}
