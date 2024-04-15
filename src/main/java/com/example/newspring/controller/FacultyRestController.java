package com.example.newspring.controller;

import com.example.newspring.modal.Faculty;
import com.example.newspring.service.FacultyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FacultyRestController {

    @Autowired
    FacultyServiceImpl facultyService;
    @PostMapping(path = "/saveFaculty")
    public String saveFaculty(@RequestBody Faculty faculty){
        return facultyService.saveFaculty(faculty);

    }

    @GetMapping(path = "/getFacultyById/{id}", produces = { "application/json"})
    public Faculty fetchFacultyById(@PathVariable int id){
        return facultyService.fetchFacultyById(id);
    }

    @GetMapping(path = "/getFacultyByName")
    public List<Faculty> fetchFacultyByName(@RequestParam String name){
        return facultyService.getFacultyByName(name);
    }

    @PostMapping(path = "{id}/deleteById")
    public String deleteFaculty(@PathVariable int id){
        return facultyService.deleteById(id);
    }
}
