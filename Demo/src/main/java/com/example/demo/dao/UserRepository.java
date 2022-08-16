package com.example.demo.dao;


import com.example.demo.entities.Department;
import com.example.demo.entities.Student;
import com.example.demo.entities.User;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, ID> {

    @Override
    List<User> findAll();

    @Query("select u from User u where u.user_name=:user_name")
    public User getUserByUserName(@Param("user_name") String user_name);

    @Override
    <S extends User> S save(S entity);


}
