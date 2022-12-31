package com.example.demostruct.practice3.entity;

import java.util.List;

public class EmployeeEntityTest {
    private int id;
    private String name;
    private double salary;

    List<MobileSimeEntity> mobileSimes;

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

    public List<MobileSimeEntity> getMobileSimes() {
        return mobileSimes;
    }

    public void setMobileSimes(List<MobileSimeEntity> mobileSimes) {
        this.mobileSimes = mobileSimes;
    }
}
