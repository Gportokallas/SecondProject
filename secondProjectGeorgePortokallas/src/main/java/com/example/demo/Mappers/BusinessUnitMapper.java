package com.example.demo.Mappers;

import com.example.demo.Model.Entity.BusinessUnit;
import com.example.demo.Responses.BusinessUnitResponse;
import org.springframework.stereotype.Component;

@Component
public class BusinessUnitMapper {

    public BusinessUnitResponse mapBusinessUnitsResponsefromBusinessUnits(BusinessUnit businessUnit){

      return new BusinessUnitResponse(
        businessUnit.getId(),
        businessUnit.getDesc()
      );
    }
}
