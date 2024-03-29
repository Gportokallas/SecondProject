package com.example.demo.Repository;

import com.example.demo.Model.Entity.BusinessUnit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

public interface BusinessUnitRepository extends CrudRepository<BusinessUnit, Long> {

    @Override
    @RestResource(exported = false)
    void delete(BusinessUnit entity);

    @Override
    @RestResource(exported = false)
    void deleteAll();
}
