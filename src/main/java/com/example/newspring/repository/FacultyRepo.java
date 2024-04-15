package com.example.newspring.repository;

import com.example.newspring.modal.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FacultyRepo extends JpaRepository<Faculty,Integer> {

    @Query("select s from Faculty s where s.facName = ?1")
    public List<Faculty> getFacultyByName(String name);
}
