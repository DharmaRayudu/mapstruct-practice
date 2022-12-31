package com.example.demostruct.changerequest.entity;

import java.util.ArrayList;
import java.util.List;

public class ChangeRequestOrder {

    private int id;
    private String requsetName;
    private String requestOrder;
    private CurrencyCode currencyCode;
    private List<SalesOrder> salesOrders= new ArrayList<SalesOrder>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    public List<SalesOrder> getSalesOrders() {
        return salesOrders;
    }

    public void setSalesOrders(List<SalesOrder> salesOrders) {
        this.salesOrders = salesOrders;
    }
}
