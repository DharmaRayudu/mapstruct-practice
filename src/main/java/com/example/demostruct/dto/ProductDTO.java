package com.example.demostruct.dto;

import com.example.demostruct.model.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductDTO {
    private int id;
    private String name;
    private String description;
    private int quantity;
    private long price;

    private String itemId;
    List<ItemDTO> itemsList;
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public List<ItemDTO> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<ItemDTO> itemsList) {
        this.itemsList = itemsList;
    }
}
