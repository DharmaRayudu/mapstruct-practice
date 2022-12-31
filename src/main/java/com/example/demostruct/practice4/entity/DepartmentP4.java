package com.example.demostruct.practice4.entity;

import java.util.List;

public class DepartmentP4 {
    private int id;
    private String name;
    //OneToMany
    List<EmployeeP4> employeeP4s;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EmployeeP4> getEmployeeP4s() {
        return employeeP4s;
    }

    public void setEmployeeP4s(List<EmployeeP4> employeeP4s) {
        this.employeeP4s = employeeP4s;
    }
}
