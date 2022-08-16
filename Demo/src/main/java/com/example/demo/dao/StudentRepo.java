package com.example.demo.dao;

import com.example.demo.entities.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;


public interface StudentRepo extends JpaRepository<Student,Integer> {


}
