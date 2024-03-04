package com.janvierscode.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


@Repository
public class InMemoryStudentDao {


    private final List<Student> STUDENTS = new ArrayList<>();


    public Student save(Student student) {
        STUDENTS.add(student);
        return student;
    }


    public List<Student> findAllStudents() {


        return STUDENTS;

    }


    public Student findByEmail(String email) {
        return STUDENTS.stream()
                .filter(student -> student.getEmail().equals(email))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student " + email + " does not exist"));
    }


    public Student updateStudent(Student student) {
        var studentIndex = IntStream.range(0, STUDENTS.size())
                .filter(i -> student.getEmail().equals(STUDENTS.get(i).getEmail()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student " + student.getEmail() + " does not exist"));

        if(studentIndex != -1) {
            STUDENTS.set(studentIndex, student);
            return student;
        }
        return null;
    }


    public void deleteStudent(String email) {

        var student = findByEmail(email);
        if (student != null) {
            STUDENTS.remove(student);
        }

    }
}
