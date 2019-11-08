package com.example.demo.Mappers;


import com.example.demo.Model.Entity.Company;
import com.example.demo.Responses.CompanyResponse;
import org.springframework.stereotype.Component;

@Component
public class CompanyMapper {

    public CompanyResponse mapCompanyResponseFromCompany(Company company){

        return new CompanyResponse(
                company.getId(),
                company.getDesc()
        );
    }
}
