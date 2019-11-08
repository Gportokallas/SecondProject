package com.example.demo.Mappers;

import com.example.demo.Model.Entity.Unit;
import com.example.demo.Responses.UnitResponse;
import org.springframework.stereotype.Component;

@Component
public class UnitMapper {
    public UnitResponse mapUnitResponseFromUnit(Unit unit){
        return new UnitResponse(
                unit.getId(),
                unit.getDesc()
        );
    }

}
