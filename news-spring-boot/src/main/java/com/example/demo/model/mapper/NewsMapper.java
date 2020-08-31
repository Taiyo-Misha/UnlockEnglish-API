package com.example.demo.model.mapper;

import com.example.demo.entity.News;
import com.example.demo.model.dto.NewsDto;

public class NewsMapper {
    public static NewsDto toNewsDto(News news){
        NewsDto tmp = new NewsDto();
        tmp.setId(news.getId());
        tmp.setTitle(news.getTitle());
        tmp.setInfo(news.getInfo());
        tmp.setImage(news.getImage());

        return tmp;

    }
}
