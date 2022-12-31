package com.example.demostruct.practice4.dto;

public class EmployeeP4DTO {
    private int id;
    private String name;
    private String email;
    private String salary;
    private DepartmentP4DTO departmentName;

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

    public DepartmentP4DTO getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(DepartmentP4DTO departmentName) {
        this.departmentName = departmentName;
    }
}
