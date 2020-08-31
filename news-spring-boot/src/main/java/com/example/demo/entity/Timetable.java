package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Timetable {
    private int id;

    private String timeStart;

    private String timeEnd;

    private String teacherName;

    private String className;

    private String classDescription;
}
