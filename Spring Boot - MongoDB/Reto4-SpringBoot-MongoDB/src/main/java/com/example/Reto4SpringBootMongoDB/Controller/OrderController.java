package com.example.Reto4SpringBootMongoDB.Controller;

import com.example.Reto4SpringBootMongoDB.Entity.Order;
import com.example.Reto4SpringBootMongoDB.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/new")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        Order createdOrder = orderService.createOrder(order);
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders = orderService.getAllOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("/salesman/{salesmanId}")
    public ResponseEntity<List<Order>> getOrdersBySalesman(@PathVariable int salesmanId) {
        List<Order> orders = orderService.getOrdersBySalesman(salesmanId);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("/state/{status}/{salesmanId}")
    public ResponseEntity<List<Order>> getOrdersByStatusAndSalesman(@PathVariable String status,
                                                                    @PathVariable int salesmanId) {
        List<Order> orders = orderService.getOrdersByStatusAndSalesman(status, salesmanId);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("/date/{date}/{salesmanId}")
    public ResponseEntity<List<Order>> getOrdersByDateAndSalesman(@PathVariable String date,
                                                                  @PathVariable int salesmanId) {
        List<Order> orders = orderService.getOrdersByDateAndSalesman(date, salesmanId);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
}
