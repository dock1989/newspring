package com.example.newspring.controller;

import com.example.newspring.modal.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FirstRestController {

    @GetMapping(path = "/check")
    public String check(){
        return "Working fine!";
    }

    @PostMapping(path = "/student")
    public Student addStudent(){
        Student student = new Student();
        student.setId(2);
        student.setName("Ajay");
        student.setAddress("India");
        return student;
    }

    @PostMapping(path = "/studentlist")
    public List<Student> studentList(){
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student();
        student1.setId(2);
        student1.setName("Ajay");
        student1.setAddress("India");

        Student student2 = new Student();
        student2.setId(3);
        student2.setName("Ajay");
        student2.setAddress("India");

        studentList.add(student1);
        studentList.add(student2);

        return studentList;

    }

}
