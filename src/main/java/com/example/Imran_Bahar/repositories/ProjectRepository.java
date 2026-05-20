package com.example.Imran_Bahar.repositories; // Matches your 'repositories' folder

import com.example.Imran_Bahar.model.ProjectEntity; // Correct import
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
    // JpaRepository gives us built-in methods like findAll(), save(), etc.
}