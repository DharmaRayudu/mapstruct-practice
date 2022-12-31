package com.example.demostruct.practice4.entity;

import java.util.List;

public class EmployeeP4 {
    private int id;
    private String name;
    private String email;
    private String salary;
    //ManytoOne
    private DepartmentP4 departmentP4;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public DepartmentP4 getDepartmentP4() {
        return departmentP4;
    }

    public void setDepartmentP4(DepartmentP4 departmentP4) {
        this.departmentP4 = departmentP4;
    }
}
