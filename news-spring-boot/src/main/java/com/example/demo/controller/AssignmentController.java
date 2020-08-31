package com.example.demo.controller;

import com.example.demo.entity.Assignment;
import com.example.demo.model.dto.AssignmentDto;
import com.example.demo.model.dto.NotificationDto;
import com.example.demo.service.AssignmentService;
import com.example.demo.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignment")
public class AssignmentController {
    @Autowired
    private AssignmentService assignmentService;

    @GetMapping("")
    public ResponseEntity<?> getListAssignment(){
        List<AssignmentDto> assignmentDtos = assignmentService.getListAssignment();
        return ResponseEntity.ok(assignmentDtos);
    }

    @PostMapping("")
    public ResponseEntity<?> createAssignment(){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateAssignment(){
        return null;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAssignment(){
        return null;
    }

}
