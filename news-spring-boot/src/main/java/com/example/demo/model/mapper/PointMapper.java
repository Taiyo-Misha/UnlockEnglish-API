package com.example.demo.model.mapper;

import com.example.demo.entity.Point;
import com.example.demo.model.dto.PointDto;

public class PointMapper {
    public static PointDto toPointDto(Point point){
        PointDto tmp = new PointDto();
        tmp.setId(point.getId());
        tmp.setPoint(point.getPoint());
        tmp.setType(point.getType());
        tmp.setDate(point.getDate());

        return tmp;

    }
}
