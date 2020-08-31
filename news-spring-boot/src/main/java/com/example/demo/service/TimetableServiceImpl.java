package com.example.demo.service;

import com.example.demo.entity.Timetable;
import com.example.demo.model.dto.TimetableDto;
import com.example.demo.model.mapper.TimetableMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TimetableServiceImpl implements TimetableService{
    private static ArrayList<Timetable> timetables = new ArrayList<Timetable>();

    static {
        timetables.add(new Timetable(1,
                "12:00",
                "14:00",
                "Nguyen Van A",
                "Toan 1",
                "Toan cao cap"));
    }

    @Override
    public List<TimetableDto> getListTimetable() {
        List<TimetableDto> result = new ArrayList<TimetableDto>();
        for(Timetable timetable : timetables){
            result.add(TimetableMapper.toTimetableDto(timetable));
        }
        return result;
    }
}
