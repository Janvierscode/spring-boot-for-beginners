package com.janvierscode.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    private final StudentService studentService ;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping
    public  Student save (
        @RequestBody Student student
    ) {
        return studentService.save(student);
    }

    @GetMapping(path = "{email}")
    public Student findByEmail(
      @PathVariable ("email")     String email
    ){
        return studentService.findByEmail(email);
    }


    @GetMapping
    public List<Student> findAllStudents() {
       return studentService.findAllStudents();
    }

    @PutMapping
    public Student updateStudent(
        @RequestBody Student student
    ) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping(path = "{email}")
    public void deleteStudent(
        @PathVariable("email") String email
    ) {
        studentService.deleteStudent(email);
    }
}
