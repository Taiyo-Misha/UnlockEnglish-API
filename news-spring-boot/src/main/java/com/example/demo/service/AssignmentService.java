package com.example.demo.service;

import com.example.demo.model.dto.AssignmentDto;
import com.example.demo.model.dto.NotificationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AssignmentService {
    public List<AssignmentDto> getListAssignment();
}
