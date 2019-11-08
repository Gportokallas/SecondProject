package com.example.demo.Responses;

import com.example.demo.Model.Entity.Department;

import java.util.List;

public class AllDepartmentsResponse {
  public List<DepartmentResponse> departmentResponses;

    public List<DepartmentResponse> getDepartmentResponses() {
        return departmentResponses;
    }

    public void setDepartmentResponses(List<DepartmentResponse> departmentResponses) {
        this.departmentResponses = departmentResponses;
    }

    public AllDepartmentsResponse(List<DepartmentResponse> departmentResponses) {
        this.departmentResponses = departmentResponses;
    }
}
