package com.example.demostruct.practice3.model;

import java.util.List;

public class EmployeeEntityTestModel {
    private int id;
    private String name;
    private double salary;

    List<MobileSime> mobileSimes;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<MobileSime> getMobileSimes() {
        return mobileSimes;
    }

    public void setMobileSimes(List<MobileSime> mobileSimes) {
        this.mobileSimes = mobileSimes;
    }
}
