package com.example.demo.Services;


import com.example.demo.Mappers.BusinessUnitMapper;
import com.example.demo.Model.Entity.BusinessUnit;
import com.example.demo.Repository.BusinessUnitRepository;
import com.example.demo.Responses.BusinessUnitResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusinessUnitService {

    @Autowired
    private BusinessUnitMapper mapper;

    @Autowired
    private BusinessUnitRepository repository;

    public List<BusinessUnitResponse>
            getAllBusinessUnit(){
        Iterable<BusinessUnit> retrievedBusinesUnits = repository.findAll();
        List<BusinessUnitResponse> businessUnits = new ArrayList<>();

        for (BusinessUnit businessUnit : retrievedBusinesUnits){
            businessUnits.add(mapper.mapBusinessUnitsResponsefromBusinessUnits(businessUnit));
        }
        return businessUnits;

    }


}
