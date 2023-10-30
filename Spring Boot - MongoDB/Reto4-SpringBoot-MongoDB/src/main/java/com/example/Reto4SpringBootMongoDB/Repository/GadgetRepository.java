package com.example.Reto4SpringBootMongoDB.Repository;

import com.example.Reto4SpringBootMongoDB.Entity.Gadget;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GadgetRepository extends MongoRepository<Gadget, String> {
}
