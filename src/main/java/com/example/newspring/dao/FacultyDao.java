package com.example.newspring.dao;

import com.example.newspring.modal.Faculty;

import java.util.List;

public interface FacultyDao {

    public String saveFaculty(Faculty faculty);

    public Faculty fetchFacultyById(int id);

    public List<Faculty> fetchFacultyByName(String name);

    String deleteById(int id);
}
