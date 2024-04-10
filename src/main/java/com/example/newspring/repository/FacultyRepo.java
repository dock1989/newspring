package com.example.newspring.repository;

import com.example.newspring.modal.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepo extends JpaRepository<Faculty,Integer> {
}
