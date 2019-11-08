package com.example.demo.controllers;


import com.example.demo.Responses.AllBusinessUnitResponse;
import com.example.demo.Responses.AllCompanyResponse;
import com.example.demo.Services.BusinessUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class BusinessUnitController {

    @Autowired
    private BusinessUnitService service;

    @GetMapping("/allBuisinessUinits")
    public AllBusinessUnitResponse allBusinessUnitResponse(){
        return new AllBusinessUnitResponse(service.getAllBusinessUnit());
    }


}
