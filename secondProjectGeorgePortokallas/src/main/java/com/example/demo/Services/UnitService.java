package com.example.demo.Services;

import com.example.demo.Mappers.UnitMapper;
import com.example.demo.Model.Entity.Unit;
import com.example.demo.Repository.UnitRepository;
import com.example.demo.Responses.UnitResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UnitService {

    @Autowired
    private UnitMapper mapper;

    @Autowired
    private UnitRepository repository;

    public List<UnitResponse>
    getAllUnits(){
        Iterable<Unit> retrievedUnits = repository.findAll();
        List<UnitResponse> units = new ArrayList<>();

        for (Unit unit : retrievedUnits){
            units.add(mapper.mapUnitResponseFromUnit(unit));
        }
        return units;
    }
}