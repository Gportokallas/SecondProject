package com.example.demo.Mappers;


import com.example.demo.Model.Entity.Department;
import com.example.demo.Responses.DepartmentResponse;
import org.springframework.stereotype.Component;

@Component
public class DepartmentMapper {

    public DepartmentResponse mapDepartmentResponseFromDepartment(Department department){

        return new DepartmentResponse(
                department.getId(),
                department.getDesc()
        );
    }
}
