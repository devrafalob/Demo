package com.example.demo.student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private LocalDate dov;
    @Transient //Deixa de ser uma columa/atributo na entidade
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
                    LocalDate dov
                    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dov = dov;
        ;
    }

    public Student(String name,
                   String email,
                   LocalDate dov) {
        this.name = name;
        this.email = email;
        this.dov = dov;

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
        return Period.between(this.dov, LocalDate.now()).getYears();
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
