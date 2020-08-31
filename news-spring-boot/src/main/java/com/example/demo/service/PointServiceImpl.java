package com.example.demo.service;

import com.example.demo.entity.Point;
import com.example.demo.model.dto.PointDto;
import com.example.demo.model.mapper.PointMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PointServiceImpl implements PointService{
    private static ArrayList<Point> points = new ArrayList<Point>();

    static {
        points.add(new Point(1,
                9.5f,
                "A+",
                "2/9/2020"));
    }

    @Override
    public List<PointDto> getListPoint() {
        List<PointDto> result = new ArrayList<PointDto>();
        for(Point point : points){
            result.add(PointMapper.toPointDto(point));
        }
        return result;
    }
}
