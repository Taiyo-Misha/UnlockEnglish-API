package com.example.demo.service;

import com.example.demo.model.dto.PointDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PointService {
    public List<PointDto> getListPoint();
}
