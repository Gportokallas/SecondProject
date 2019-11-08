package com.example.demo.controllers;


import com.example.demo.Responses.AllEmployeesResponse;
import com.example.demo.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/getAllEmployees")
    public AllEmployeesResponse allEmployeesResponse(){
        return new AllEmployeesResponse(service.getAllEmployees());
    }

    @GetMapping("/{uCriteria}/{id}")
    public AllEmployeesResponse getEmployesbyCriteriaAndId(@PathVariable String uCriteria,@PathVariable Long id) {
        return new AllEmployeesResponse(service.getEmployeesByCriteriaAndId(uCriteria,id));

    }




}
