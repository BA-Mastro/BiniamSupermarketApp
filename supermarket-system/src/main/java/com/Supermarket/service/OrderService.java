package com.Supermarket.service;


import com.Supermarket.model.Order;

import com.Supermarket.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
    public Optional<Order> getOrderById(Long id){
        return orderRepository.findById(id);
    }

    public Order createOrder(Order order){
        return orderRepository.save(order);
    }
    public Order updateOrder (Long id, Order updateOrder){
        if(orderRepository.existsById(id)){
          return  orderRepository.save(updateOrder);
        }
        return null;
    }
public void deleteOrder(Long id){
        orderRepository.deleteById(id);
}
}
