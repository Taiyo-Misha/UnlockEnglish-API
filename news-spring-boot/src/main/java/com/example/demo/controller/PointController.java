package com.example.demo.controller;

import com.example.demo.model.dto.PointDto;
import com.example.demo.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/point")
public class PointController {
    @Autowired
    private PointService pointService;

    @GetMapping("")
    public ResponseEntity<?> getListPoint(){
        List<PointDto> pointDtos = pointService.getListPoint();
        return ResponseEntity.ok(pointDtos);
    }

    @PostMapping("/{id}")
    public ResponseEntity<?> getPointById(@PathVariable int id){
        System.out.println(id);
        return null;
    }

    @PostMapping("")
    public ResponseEntity<?> createPoint(){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updatePoint(){
        return null;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePoint(){
        return null;
    }
}
