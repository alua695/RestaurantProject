package com.example.restaurant;

public class IcedTea implements Drinks{
    private String name;
    private double price;

    public IcedTea(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
