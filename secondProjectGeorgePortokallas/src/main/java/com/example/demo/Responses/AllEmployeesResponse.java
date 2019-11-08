package com.example.demo.Responses;

import java.util.List;

public class AllEmployeesResponse {
   public List<EmployeeResponse> employeeResponses;

    public AllEmployeesResponse(List<EmployeeResponse> employeeResponses) {
        this.employeeResponses = employeeResponses;
    }

    public List<EmployeeResponse> getEmployeeResponses() {
        return employeeResponses;
    }

    public void setEmployeeResponses(List<EmployeeResponse> employeeResponses) {
        this.employeeResponses = employeeResponses;
    }
}
