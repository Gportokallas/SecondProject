package com.example.demo.controllers;


import com.example.demo.Responses.AllUnitsResponse;
import com.example.demo.Services.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UnitController {

    @Autowired
    private UnitService service;

    @GetMapping("/getAllUnits")
    public AllUnitsResponse allUnitsResponse(){
        return new AllUnitsResponse(service.getAllUnits());
    }


}
