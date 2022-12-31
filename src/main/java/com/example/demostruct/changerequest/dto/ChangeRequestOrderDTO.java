package com.example.demostruct.changerequest.dto;

import java.util.ArrayList;
import java.util.List;

public class ChangeRequestOrderDTO {
    private int id;
    private String requsetName;
    private String requestOrder;
    private String name;
    private String code;
    List<SalesOrderDTO> salesOrders = new ArrayList<SalesOrderDTO>();

    public String getRequsetName() {
        return requsetName;
    }

    public void setRequsetName(String requsetName) {
        this.requsetName = requsetName;
    }

    public String getRequestOrder() {
        return requestOrder;
    }

    public void setRequestOrder(String requestOrder) {
        this.requestOrder = requestOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<SalesOrderDTO> getSalesOrders() {
        return salesOrders;
    }

    public void setSalesOrders(List<SalesOrderDTO> salesOrders) {
        this.salesOrders = salesOrders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
