package com.example.demo.Repository;

import com.example.demo.Model.Entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

    @Override
    @RestResource(exported = false)
    void delete(Department entity);

    @Override
    @RestResource(exported = false)
    void deleteAll();
}
