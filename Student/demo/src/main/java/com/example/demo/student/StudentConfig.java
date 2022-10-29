package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.MARCH;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student saba = new Student("saba",
                    LocalDate.of(1999, JANUARY, 10),
                    "sabasoghrati@gmail.com");

            Student sadaf = new Student("sadaf",
                    LocalDate.of(1989,
                    MARCH, 10),
                    "sdf.iteng@gmail.com");

            studentRepository.saveAll(
                    List.of(saba, sadaf)
            );
        };
    }
}
