package com.example.demo.model.mapper;

import com.example.demo.entity.Timetable;
import com.example.demo.model.dto.TimetableDto;

public class TimetableMapper {
    public static TimetableDto toTimetableDto(Timetable timetable){
        TimetableDto tmp = new TimetableDto();
        tmp.setId(timetable.getId());
        tmp.setTimeStart(timetable.getTimeStart());
        tmp.setTimeEnd(timetable.getTimeEnd());
        tmp.setTeacherName(timetable.getTeacherName());
        tmp.setClassName(timetable.getClassName());
        tmp.setClassDescription(timetable.getClassDescription());

        return tmp;

    }
}
