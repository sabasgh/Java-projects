package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        if (studentByEmail.isPresent()) {
            throw new IllegalStateException("Email is taken!!!");
        }
        studentRepository.save(student);
    }

    public void deleteStudentById(Long studentId) {
        Boolean exist = studentRepository.existsById(studentId);
        if (!exist) {
            throw new IllegalStateException("Student with id " + studentId + " does not exist!!!");
        }
        studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudentById(Long studentId, String name, String email) {
        Boolean exist = studentRepository.existsById(studentId);
        if (!exist){
            throw new IllegalStateException("student with id "+studentId+" does not exist!!");
        }
        Student student = studentRepository.findById(studentId).get();
        if (name != null && name.length() > 0 && !(name.equals(student.getName()))){
            student.setName(name);
        }
        if (email !=null && email.length()>0) {
            Boolean exist2 = studentRepository.findStudentByEmail(email).isPresent();
            if (!exist){
                throw new IllegalStateException("Email is taken!!!");
            }
            student.setEmail(email);
        }

    }
}
