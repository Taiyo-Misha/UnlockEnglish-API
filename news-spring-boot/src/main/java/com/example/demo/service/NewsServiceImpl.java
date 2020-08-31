package com.example.demo.service;

import com.example.demo.entity.News;
import com.example.demo.model.dto.NewsDto;
import com.example.demo.model.mapper.NewsMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NewsServiceImpl implements NewsService{
    private static ArrayList<News> news = new ArrayList<News>();

    static {
        news.add(new News(1, "Diem thi tang cao", "Cac thi sinh nam nay cho thay de thi de hon", "https://image.shutterstock.com/image-photo/butterfly-grass-on-meadow-night-260nw-1111729556.jpg"));
    }

    @Override
    public List<NewsDto> getListNews() {
        List<NewsDto> result = new ArrayList<NewsDto>();
        for(News neww : news){
            result.add(NewsMapper.toNewsDto(neww));
        }
        return result;
    }

    @Override
    public NewsDto getNewsById(int id) {
        for(News neww : news){
            if(neww.getId() == id){
                return NewsMapper.toNewsDto(neww);
            }
        }
        return null;
    }

    @Override
    public void createNews() {
        news.add(new News(1, "Diem thi tang cao", "Cac thi sinh nam nay cho thay de thi de hon", "https://image.shutterstock.com/image-photo/butterfly-grass-on-meadow-night-260nw-1111729556.jpg"));
    }
}
