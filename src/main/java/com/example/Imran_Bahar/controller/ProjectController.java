package com.example.Imran_Bahar.controller; // Matches your 'controller' folder

import com.example.Imran_Bahar.model.ProjectEntity; // Correct import
import com.example.Imran_Bahar.repositories.ProjectRepository; // Correct import
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "*") // CRITICAL: This allows your React frontend to request data from this API
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    // GET Request to fetch all projects for the frontend
    @GetMapping
    public List<ProjectEntity> getAllProjects() {
        return projectRepository.findAll();
    }

    // POST Request if you want to add projects via Postman later
    @PostMapping
    public ProjectEntity createProject(@RequestBody ProjectEntity project) {
        return projectRepository.save(project);
    }
}