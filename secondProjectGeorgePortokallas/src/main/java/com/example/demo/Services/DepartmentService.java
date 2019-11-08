package com.example.demo.Services;

import com.example.demo.Mappers.CompanyMapper;
import com.example.demo.Mappers.DepartmentMapper;
import com.example.demo.Model.Entity.Department;
import com.example.demo.Repository.CompanyRepository;
import com.example.demo.Repository.DepartmentRepository;
import com.example.demo.Responses.DepartmentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper mapper;

    @Autowired
    private DepartmentRepository repository;


    public List<DepartmentResponse>
            getAllDepartments(){
        Iterable<Department> retrievedDepartments = repository.findAll();
        List<DepartmentResponse> departments = new ArrayList<>();

        for (Department department : retrievedDepartments){
            departments.add(mapper.mapDepartmentResponseFromDepartment(department));
        }
        return departments;
    }

}
