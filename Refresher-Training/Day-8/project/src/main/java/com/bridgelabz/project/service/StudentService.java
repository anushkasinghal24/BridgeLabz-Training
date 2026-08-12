package com.bridgelabz.project.service;

import com.bridgelabz.project.dto.StudentDTO;
import com.bridgelabz.project.entity.Student;
import com.bridgelabz.project.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get student by ID
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id)
                .orElse(null);
    }

    // Add student
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    // Update student
    public Student updateStudent(Integer id, Student student) {

        Student existingStudent = studentRepository.findById(id)
                .orElse(null);

        if (existingStudent != null) {

            existingStudent.setRollNumber(student.getRollNumber());
            existingStudent.setFirstName(student.getFirstName());
            existingStudent.setLastName(student.getLastName());
            existingStudent.setGender(student.getGender());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setAddress(student.getAddress());
            existingStudent.setCity(student.getCity());
            existingStudent.setState(student.getState());
            existingStudent.setCourse(student.getCourse());
            existingStudent.setDepartment(student.getDepartment());
            existingStudent.setAdmissionYear(student.getAdmissionYear());

            return studentRepository.save(existingStudent);
        }

        return null;
    }

    // Delete student
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }


    public Student addStudent(StudentDTO dto){
        Student student = new Student();
        student.setRollNumber(dto.getRollNumber());
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        student.setGender(dto.getGender());
        student.setEmail(dto.getEmail());
        student.setAddress(dto.getAddress());
        student.setCity(dto.getCity());
        student.setState(dto.getState());
        student.setCourse(dto.getCourse());
        student.setDepartment(dto.getDepartment());
        student.setAdmissionYear(dto.getAdmissionYear());

        return studentRepository.save(student);

    }
}