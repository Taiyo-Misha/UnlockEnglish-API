package com.example.demo.controller;

import com.example.demo.model.dto.NewsDto;
import com.example.demo.model.dto.NotificationDto;
import com.example.demo.service.NewsService;
import com.example.demo.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notification")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @GetMapping("")
    public ResponseEntity<?> getListNotification(){
        List<NotificationDto> notis = notificationService.getListNotification();
        return ResponseEntity.ok(notis);
    }

    @PostMapping("")
    public ResponseEntity<?> createNotification(){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateNotification(){
        return null;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteNotification(){
        return null;
    }

}
