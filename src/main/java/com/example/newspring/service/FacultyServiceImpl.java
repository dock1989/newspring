package com.example.newspring.service;

import com.example.newspring.dao.FacultyDaoImpl;
import com.example.newspring.modal.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService{

    @Autowired
    FacultyDaoImpl facultyDao;
    @Override
    public String saveFaculty(Faculty faculty) {
        return facultyDao.saveFaculty(faculty);
    }

    @Override
    public Faculty fetchFacultyById(int id) {
        return facultyDao.fetchFacultyById(id);
    }

    @Override
    public List<Faculty> getFacultyByName(String name) {
        return facultyDao.fetchFacultyByName(name);
    }

    @Override
    public String deleteById(int id) {
        return facultyDao.deleteById(id);
    }
}
