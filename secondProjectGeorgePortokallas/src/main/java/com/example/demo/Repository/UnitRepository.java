package com.example.demo.Repository;

import com.example.demo.Model.Entity.Unit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

public interface UnitRepository extends CrudRepository<Unit, Long> {


    @Override
    @RestResource(exported = false)
    void delete(Unit entity);

    @Override
    @RestResource(exported = false)
    void deleteAll();

}
