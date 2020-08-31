package com.example.demo.controller;

import com.example.demo.entity.News;
import com.example.demo.model.dto.NewsDto;
import com.example.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping("")
    public ResponseEntity<?> getListNews(){
        List<NewsDto> news = newsService.getListNews();
        return ResponseEntity.ok(news);
    }

    @PostMapping("/{id}")
    public ResponseEntity<?> getNewsById(@PathVariable int id){
        System.out.println(id);
        //NewsDto result = newsService.getNewsById(id);
        return null;
    }

    @PostMapping("")
    public ResponseEntity<?> createNews(){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateNews(){
        return null;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteNews(){
        return null;
    }

}
