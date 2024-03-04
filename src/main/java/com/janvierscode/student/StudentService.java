package com.janvierscode.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {


    public List<Student> findAllStudents() {
        return List.of(new Student("Janvier",
                        "Iyakaremye",
                        "iyakaremye@student.com",
                        24,
                        LocalDate.of(1900, Month.JANUARY, 5)

                ),
                new Student("Phil",
                        "Foden",
                        "bob@marley.rasta",
                        47,
                        LocalDate.now()

                )

        );
    }

}
