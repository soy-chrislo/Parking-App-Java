package com.soychristian.entities;

public class Car {
    private String plate;
    private String color;
    private String brand;
    private String model;

    public Car(String plate, String color, String brand, String model) {
        this.plate = plate;
        this.color = color;
        this.brand = brand;
        this.model = model;
    }

    public String getPlate() {
        return this.plate;
    }

    public String getColor() {
        return this.color;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    
}
