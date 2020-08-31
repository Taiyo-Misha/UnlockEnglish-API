package com.example.demo.service;

import com.example.demo.model.dto.NewsDto;
import com.example.demo.model.dto.NotificationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NotificationService {

    public List<NotificationDto> getListNotification();
}
