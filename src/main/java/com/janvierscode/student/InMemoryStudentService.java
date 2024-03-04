package com.janvierscode.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class InMemoryStudentService implements StudentService {

    private final InMemoryStudentDao inMemoryStudentDao;

    public InMemoryStudentService(InMemoryStudentDao inMemoryStudentDao) {
        this.inMemoryStudentDao = inMemoryStudentDao;
    }

    @Override
    public Student save(Student student) {
        return this.inMemoryStudentDao.save(student);
    }

    @Override
    public List<Student> findAllStudents() {

            return inMemoryStudentDao.findAllStudents();

    }

    @Override
    public Student findByEmail(String email) {
        return inMemoryStudentDao.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return inMemoryStudentDao.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        inMemoryStudentDao.deleteStudent(email);

    }
}
