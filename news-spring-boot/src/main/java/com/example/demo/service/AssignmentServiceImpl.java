package com.example.demo.service;

import com.example.demo.entity.Assignment;
import com.example.demo.model.dto.AssignmentDto;
import com.example.demo.model.mapper.AssignmentMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AssignmentServiceImpl implements AssignmentService{
    private static ArrayList<Assignment> assignments = new ArrayList<Assignment>();

    static {
        assignments.add(new Assignment(1,
                "Bai giua ki",
                "Bai kiem tra lay diem 20%",
                2020,
                "1"));
    }

    @Override
    public List<AssignmentDto> getListAssignment() {
        List<AssignmentDto> result = new ArrayList<AssignmentDto>();
        for(Assignment assignment : assignments){
            result.add(AssignmentMapper.toAssignmentDto(assignment));
        }
        return result;
    }
}
