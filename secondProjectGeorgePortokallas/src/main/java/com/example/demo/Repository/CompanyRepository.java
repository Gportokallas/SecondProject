package com.example.demo.Repository;

import com.example.demo.Model.Entity.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

public interface CompanyRepository extends CrudRepository<Company, Long> {

    @Override
    @RestResource(exported = false)
    void delete(Company entity);

    @Override
    @RestResource(exported = false)
    void deleteAll();
}
