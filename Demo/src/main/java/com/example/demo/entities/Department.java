package com.example.demo.entities;

import javax.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name = "dpt_name")
    String dptName;


//    @OneToMany(mappedBy = "department",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id",referencedColumnName = "id")
    List<Student> students;

    public Department() {
    }

    public Department(int id, String dptName, List<Student> students) {
        this.id = id;
        this.dptName = dptName;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDptName() {
        return dptName;
    }

    public void setDptName(String dptName) {
        this.dptName = dptName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", dptName='" + dptName + '\'' +
                ", students=" + students +
                '}';
    }
}
