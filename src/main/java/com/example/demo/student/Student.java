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

    public Student() {
    }

    public Student(
                    Long id,
                    String name,
                    String email,
                    LocalDate dov,
                    Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dov = dov;
        this.age = age;
    }

    public Student(String name,
                   String email,
                   LocalDate dov,
                   Integer age) {
        this.name = name;
        this.email = email;
        this.dov = dov;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDov() {
        return dov;
    }

    public void setDov(LocalDate dov) {
        this.dov = dov;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dov=" + dov +
                ", age=" + age +
                '}';
    }
}
