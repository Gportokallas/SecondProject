package com.example.demo.Mappers;


import com.example.demo.Model.Entity.Employee;
import com.example.demo.Responses.EmployeeResponse;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {
    public EmployeeResponse mapEmployeeResponseFromEmployee(Employee employee) {
        return new EmployeeResponse(
                employee.getRecordNumber(),
                employee.getId(),
                mapFullname(employee),
                employee.getAddress(),
                employee.getPhoneNumber(),
                mapWorkingPeriod(employee),
                employee.isActive(),
                employee.getContractType(),
                employee.getPosition(),
                mapTitleFromUnit(employee)


        );

    }

    private String mapWorkingPeriod(Employee employee) {
        if (employee.isActive()) {
            return employee.getHireDate() + " - present";
        } else {
            return employee.getHireDate() + " - " + employee.getDepartureDate();

        }
    }

    private String mapFullname(Employee employee) {
        return employee.getName() + " " + employee.getLastName();
    }

    private String mapTitleFromUnit(Employee employee) {
        return employee.getUnit().getDesc();
    }

}
