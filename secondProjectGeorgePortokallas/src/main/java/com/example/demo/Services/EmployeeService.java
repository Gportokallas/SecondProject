package com.example.demo.Services;

import com.example.demo.Mappers.EmployeeMapper;
import com.example.demo.Model.Entity.Company;
import com.example.demo.Model.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Responses.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;
    @Autowired
    private EmployeeMapper mapper;


    public List<EmployeeResponse>
    getAllEmployees() {
        Iterable<Employee> retrievedEmployees = repository.findAll();
        List<EmployeeResponse> employees = new ArrayList<>();

        for (Employee employee : retrievedEmployees) {
            employees.add(mapper.mapEmployeeResponseFromEmployee(employee));
        }
        return employees;
    }


    public List<EmployeeResponse> getEmployeesByCriteriaAndId(String uCriteria, Long id) {
        Iterable<Employee> retrievedEmployees = repository.findAll();
        List<EmployeeResponse> employees = new ArrayList<>();
        switch (uCriteria) {
            case "Company":
                for (Employee employee : retrievedEmployees) {
                    if (employee.getUnit().getDepartment().getBusinessUnit().getCompany().getId() == id) {
                        EmployeeResponse employeesToAdd = mapper.mapEmployeeResponseFromEmployee(employee);
                        employees.add((employeesToAdd));
                    }
                }
                break;
            case "BusinessUnit":
                for (Employee employee : retrievedEmployees) {
                    if (employee.getUnit().getDepartment().getBusinessUnit().getId() == id) {
                        EmployeeResponse employeesToAdd = mapper.mapEmployeeResponseFromEmployee(employee);
                        employees.add((employeesToAdd));
                    }
                }
                break;
            case "Department":
                for (Employee employee : retrievedEmployees) {
                    if (employee.getUnit().getDepartment().getId() == id) {
                        EmployeeResponse employeesToAdd = mapper.mapEmployeeResponseFromEmployee(employee);
                        employees.add((employeesToAdd));
                    }
                }
                break;
            case "Unit":
                for (Employee employee : retrievedEmployees) {
                    if (employee.getUnit().getId() == id) {
                        EmployeeResponse employeesToAdd = mapper.mapEmployeeResponseFromEmployee(employee);
                        employees.add((employeesToAdd));
                    }
                }
                break;
        }
        return employees;
    }


}
