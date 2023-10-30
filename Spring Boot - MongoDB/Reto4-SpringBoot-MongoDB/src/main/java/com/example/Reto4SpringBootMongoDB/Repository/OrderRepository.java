package com.example.Reto4SpringBootMongoDB.Repository;

import com.example.Reto4SpringBootMongoDB.Entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order, String>{
    List<Order> findAll();

    List<Order> findAllBySalesMan_Id(int salesmanId);

    List<Order> findAllByStatusAndSalesMan_Id(String status, int salesmanId);

    List<Order> findAllByRegisterDayAndSalesMan_Id(String date, int salesmanId);
}

