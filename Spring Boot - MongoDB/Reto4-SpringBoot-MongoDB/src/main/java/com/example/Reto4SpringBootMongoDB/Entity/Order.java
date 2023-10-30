package com.example.Reto4SpringBootMongoDB.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection = "orders")
public class Order {
    @Id
    private String id;
    private String registerDay;
    private String status;
    private SalesMan salesMan;
    private Map<String, Product> products;
    private Map<String, Integer> quantities;

    public Order() {
    }

    public Order(String id, String registerDay, String status, SalesMan salesMan,
                 Map<String, Product> products, Map<String, Integer> quantities) {
        this.id = id;
        this.registerDay = registerDay;
        this.status = status;
        this.salesMan = salesMan;
        this.products = products;
        this.quantities = quantities;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegisterDay() {
        return registerDay;
    }

    public void setRegisterDay(String registerDay) {
        this.registerDay = registerDay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SalesMan getSalesMan() {
        return salesMan;
    }

    public void setSalesMan(SalesMan salesMan) {
        this.salesMan = salesMan;
    }

    public Map<String, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Product> products) {
        this.products = products;
    }

    public Map<String, Integer> getQuantities() {
        return quantities;
    }

    public void setQuantities(Map<String, Integer> quantities) {
        this.quantities = quantities;
    }
}