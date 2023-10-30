package com.example.Reto4SpringBootMongoDB.Entity;

public class Product {
    private int id;
    private String brand;
    private String category;
    private String name;
    private String description;
    private double price;
    private boolean availability;
    private int quantity;
    private String photography;

    public Product() {
    }

    public Product(int id, String brand, String category, String name, String description,
                   double price, boolean availability, int quantity, String photography) {
        this.id = id;
        this.brand = brand;
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
        this.availability = availability;
        this.quantity = quantity;
        this.photography = photography;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPhotography() {
        return photography;
    }

    public void setPhotography(String photography) {
        this.photography = photography;
    }
}
