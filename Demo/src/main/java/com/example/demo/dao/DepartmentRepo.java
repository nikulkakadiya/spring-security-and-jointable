package com.example.demo.dao;

import com.example.demo.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {

    @Query("select d,s from Department d inner join Student s on d.id=s.id where d.dptName=:name")
    public List<Department> getData(@Param("name") String name);
}
