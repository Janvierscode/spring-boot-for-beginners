package com.janvierscode.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


public interface StudentService {
    Student save(Student student);


     List<Student> findAllStudents() ;

     Student findByEmail(String email) ;

     Student updateStudent(Student student) ;

        void deleteStudent(String email) ;
}
