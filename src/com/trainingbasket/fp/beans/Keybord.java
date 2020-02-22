package com.trainingbasket.fp.beans;

public class Keybord {
    static  int tempId;
    private int id;
    private String brand;

    @Override
    public String toString() {
        return "Keybord{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    public Keybord(String brand, String type, float price) {
        this.id= ++tempId;

        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private String type;

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    private float price;




}


