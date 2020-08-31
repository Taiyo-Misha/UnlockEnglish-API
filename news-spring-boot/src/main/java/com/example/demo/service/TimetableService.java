package com.example.demo.service;

import com.example.demo.model.dto.NotificationDto;
import com.example.demo.model.dto.TimetableDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TimetableService {
    public List<TimetableDto> getListTimetable();
}
