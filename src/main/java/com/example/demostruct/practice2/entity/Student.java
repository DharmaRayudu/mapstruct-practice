package com.example.demostruct.practice2.entity;

public class Student {
    private int id;
    private String name;
    private Subject stubject;

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

    public Subject getStubject() {
        return stubject;
    }

    public void setStubject(Subject stubject) {
        this.stubject = stubject;
    }
}
