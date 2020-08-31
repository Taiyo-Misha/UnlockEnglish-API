package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TimetableDto {
    private int id;

    private String timeStart;

    private String timeEnd;

    private String teacherName;

    private String className;

    private String classDescription;
}
