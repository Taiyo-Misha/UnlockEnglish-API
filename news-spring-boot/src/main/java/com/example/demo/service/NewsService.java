package com.example.demo.service;

import com.example.demo.model.dto.NewsDto;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface NewsService {
    public List<NewsDto> getListNews();

    public NewsDto getNewsById(int id);

    public void createNews();
}
