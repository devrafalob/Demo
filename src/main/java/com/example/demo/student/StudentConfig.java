package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner
            (StudentRepository repository){
        return args -> {
            Student Maria = new Student(
                    "Maria",
                    "",
                    LocalDate.of(2009, Month.AUGUST, 5)
            );
            Student Pedro = new Student(
                    "Pedro",
                    "",
                    LocalDate.of(2004, Month.AUGUST, 5)
            );
            repository.saveAll(
                    List.of(Maria,  Pedro)
            );
        };
    }
}
