package com.example.newspring.dao;

import com.example.newspring.modal.Faculty;
import com.example.newspring.repository.FacultyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FacultyDaoImpl implements FacultyDao{

    @Autowired
    FacultyRepo facultyRepo;

    @Override
    public String saveFaculty(Faculty faculty) {
        facultyRepo.save(faculty);
        return "Record Saved";
    }

    @Override
    public Faculty fetchFacultyById(int id) {
         return facultyRepo.findById(id).orElse(null);
    }

    @Override
    public List<Faculty> fetchFacultyByName(String name) {
        return facultyRepo.getFacultyByName(name);
    }

    @Override
    public String deleteById(int id) {
          facultyRepo.deleteById(id);
        return "record Deleted successfully";
    }
}
