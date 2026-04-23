package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private String email;
    private LocalDate dov;
    private Integer age;

    public Student(Long id) {
        this.id = id;
    }

}
