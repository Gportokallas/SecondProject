package com.example.demo.controllers;


import com.example.demo.Model.Entity.Department;
import com.example.demo.Responses.AllDepartmentsResponse;
import com.example.demo.Services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping("/getAllDepartments")
    public AllDepartmentsResponse allDepartmentsResponse(){
        return new AllDepartmentsResponse(service.getAllDepartments());
    }




}
