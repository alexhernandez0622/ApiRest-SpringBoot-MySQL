package com.example.Reto4SpringBootMongoDB.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "gadgets")
public class Gadget {
    @Id
    private String id;
    private String brand;
    private String category;
    private String name;
    private String description;
    private double price;
    private boolean availability;
    private int quantity;
    private String photography;


    // Constructors, getters, and setters
}
