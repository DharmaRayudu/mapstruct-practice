package com.example.demostruct.employee.dto;

import com.example.demostruct.employee.entity.EmployeeEntity;

import java.util.List;

public class DepartmentDTO {
    private int id;
    private String deptName;
    //OneToMany
    private List<EmployeeEntity> employeeEntities;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<EmployeeEntity> getEmployeeEntities() {
        return employeeEntities;
    }

    public void setEmployeeEntities(List<EmployeeEntity> employeeEntities) {
        this.employeeEntities = employeeEntities;
    }
}
