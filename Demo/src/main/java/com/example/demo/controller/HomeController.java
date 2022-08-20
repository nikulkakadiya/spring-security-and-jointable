package com.example.demo.controller;

import com.example.demo.dao.DepartmentRepo;
import com.example.demo.dao.StudentRepo;
import com.example.demo.dao.UserRepository;

import com.example.demo.entities.Department;
import com.example.demo.entities.Student;
import com.example.demo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class HomeController {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    UserRepository userRepository;

    @Autowired
    DepartmentRepo departmentRepo;

    @RequestMapping("/")
    public String home(){
        return "<h1>home page</h1>";
    }

    @RequestMapping("/show")
    public String show(){
        List<User> list=userRepository.findAll();
        System.out.println(list);
        return "<h1>show page</h1>";
    }

    @RequestMapping("/add")
    public String addUser(){
        User user = new User();
        user.setId(6);
        user.setUserName("parthu");
        user.setPassword(passwordEncoder.encode("abc"));
        user.setRoles("ROLE_USER");
        user.setActive(true);

        User r=this.userRepository.save(user);
        return "<h1>add data page</h1>";
    }
    @RequestMapping("/two")
    public String joinFind(){

//        departmentRepo.findAll();
        List<Department> st=departmentRepo.getData("MCA");
        System.out.println(st.get(0).getStudents().get(0).getName());
        System.out.println(st);
        return "<h1>join data page</h1>";
    }
}
