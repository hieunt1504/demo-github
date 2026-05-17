package com.hieunt.fruit.entity;

public class cho {
    private String ID;
    private String name;
    private String price;

    public cho(String ID, String name, String price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public cho() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
