package com.example.demo.Responses;

import com.example.demo.Model.Entity.BusinessUnit;

import java.util.List;

public class AllBusinessUnitResponse {

    public List<BusinessUnitResponse> businessUnitResponses;

    public AllBusinessUnitResponse(List<BusinessUnitResponse> businessUnitResponses) {
        this.businessUnitResponses = businessUnitResponses;
    }

    public List<BusinessUnitResponse> getBusinessUnitResponses() {
        return businessUnitResponses;
    }

    public void setBusinessUnitResponses(List<BusinessUnitResponse> businessUnitResponses) {
        this.businessUnitResponses = businessUnitResponses;
    }
}