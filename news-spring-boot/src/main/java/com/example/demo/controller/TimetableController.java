package com.example.demo.controller;

import com.example.demo.model.dto.NewsDto;
import com.example.demo.model.dto.TimetableDto;
import com.example.demo.service.NewsService;
import com.example.demo.service.TimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/timetable")
public class TimetableController {
    @Autowired
    private TimetableService timetableService;

    @GetMapping("")
    public ResponseEntity<?> getListTimetable(){
        List<TimetableDto> timetableDtos = timetableService.getListTimetable();
        return ResponseEntity.ok(timetableDtos);
    }

    @PostMapping("/{id}")
    public ResponseEntity<?> getTimetableById(@PathVariable int id){
        System.out.println(id);
        //NewsDto result = newsService.getNewsById(id);
        return null;
    }

    @PostMapping("")
    public ResponseEntity<?> createTimetable(){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateTimetable(){
        return null;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTimetable(){
        return null;
    }

}
