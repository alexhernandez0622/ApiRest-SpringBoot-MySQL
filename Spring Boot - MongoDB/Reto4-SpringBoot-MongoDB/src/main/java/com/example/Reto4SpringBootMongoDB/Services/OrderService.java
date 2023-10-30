package com.example.Reto4SpringBootMongoDB.Services;

import com.example.Reto4SpringBootMongoDB.Entity.Order;
import com.example.Reto4SpringBootMongoDB.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public List<Order> getOrdersBySalesman(int salesmanId) {
        return orderRepository.findAllBySalesMan_Id(salesmanId);
    }

    public List<Order> getOrdersByStatusAndSalesman(String status, int salesmanId) {
        return orderRepository.findAllByStatusAndSalesMan_Id(status, salesmanId);
    }

    public List<Order> getOrdersByDateAndSalesman(String date, int salesmanId) {
        return orderRepository.findAllByRegisterDayAndSalesMan_Id(date, salesmanId);
    }
}
