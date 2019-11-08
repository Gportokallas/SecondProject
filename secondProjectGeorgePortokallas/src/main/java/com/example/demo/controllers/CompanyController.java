package com.example.demo.controllers;

import com.example.demo.Responses.AllCompanyResponse;
import com.example.demo.Services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CompanyController {

    @Autowired
    private CompanyService service;


    @GetMapping("/allCompanies")
    public AllCompanyResponse allCompanyResponse() {
        return new AllCompanyResponse(service.getAllCompany());
    }

//    @GetMapping("/getUsersByStatus/{userStatus}")
//    public AllUserResponse getUsersByStatus(@PathVariable String userStatus) {
//        return new AllUserResponse(service.getUserByStatus(userStatus));
//
//    }





}
