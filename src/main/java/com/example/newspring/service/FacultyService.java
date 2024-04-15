package com.example.newspring.service;

import com.example.newspring.modal.Faculty;

import java.util.List;

public interface FacultyService {

    public String saveFaculty(Faculty faculty);

    public Faculty fetchFacultyById(int id);
    public List<Faculty> getFacultyByName(String name);

    String deleteById(int id);
}
