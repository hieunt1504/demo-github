package com.hieunt.fruit.entity;

public class Fruit {

    private String id;
    private String name;
    private String desc;
    private double price;

    public Fruit(String id, String name, String desc, double price) {
        this.id = id;
        this.price = price;
        this.desc = desc;
        this.name = name;
    }

    public Fruit() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + desc + " | " + price;
    }
}
