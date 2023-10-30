package com.example.Reto4SpringBootMongoDB.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Document(collection = "users")
public class User {
    @Id
    private Integer id;
    private String identification;
    private String name;
    private String birthDay;
    private String monthBirthDay;
    private String address;
    private String cellPhone;
    private String email;
    private String password;
    private String zone;
    private String type;

    // Constructor, getters, and setters
}
