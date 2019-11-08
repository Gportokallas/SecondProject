package com.example.demo.Responses;

import java.util.List;

public class AllCompanyResponse {

    public List<CompanyResponse> companyResponses;

    public List<CompanyResponse> getCompanyResponses() {
        return companyResponses;
    }

    public void setCompanyResponses(List<CompanyResponse> companyResponses) {
        this.companyResponses = companyResponses;
    }

    public AllCompanyResponse(List<CompanyResponse> companyResponses) {
        this.companyResponses = companyResponses;
    }
}
