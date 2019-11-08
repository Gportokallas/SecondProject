package com.example.demo.Responses;

import java.util.List;

public class AllUnitsResponse {

    public List<UnitResponse> unitResponses;

    public AllUnitsResponse(List<UnitResponse> unitResponses) {
        this.unitResponses = unitResponses;
    }

    public List<UnitResponse> getUnitResponses() {
        return unitResponses;
    }

    public void setUnitResponses(List<UnitResponse> unitResponses) {
        this.unitResponses = unitResponses;
    }
}
