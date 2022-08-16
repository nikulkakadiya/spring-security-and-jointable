package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "student")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;


//    @ManyToOne
//    @JoinTable(name = "department")
//    Department department;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
//        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Department getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +

                '}';
    }
}
