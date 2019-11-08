package com.example.demo.Services;


import com.example.demo.Mappers.CompanyMapper;
import com.example.demo.Model.Entity.Company;
import com.example.demo.Repository.CompanyRepository;
import com.example.demo.Responses.CompanyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyMapper mapper;

    @Autowired
    private CompanyRepository repository;

    public List<CompanyResponse>
    getAllCompany(){
        Iterable<Company> retrievedCompanies = repository.findAll();
        List<CompanyResponse> companies = new ArrayList<>();

        for (Company company : retrievedCompanies){
            companies.add(mapper.mapCompanyResponseFromCompany(company));
        }
        return companies;
     }
}
