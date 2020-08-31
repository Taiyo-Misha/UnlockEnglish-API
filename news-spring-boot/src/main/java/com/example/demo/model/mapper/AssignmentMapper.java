package com.example.demo.model.mapper;

import com.example.demo.entity.Assignment;
import com.example.demo.model.dto.AssignmentDto;

public class AssignmentMapper {
    public static AssignmentDto toAssignmentDto(Assignment assignment){
        AssignmentDto tmp = new AssignmentDto();
        tmp.setId(assignment.getId());
        tmp.setName(assignment.getName());
        tmp.setDescription(assignment.getDescription());
        tmp.setYear(assignment.getYear());
        tmp.setKihoc(assignment.getKihoc());

        return tmp;

    }
}
