WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package com.example.reward.service.impl;

import com.example.reward.pojo.entity.Order;
import com.example.reward.repository.OrderRepository;
import com.example.reward.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository repository) {
        orderRepository = repository;
    }

    @Override
    public Order insertOrder(Order order) {
        Order res = orderRepository.save(order);
        return res;
    }

    @Override
    public Order getByOrderId(long id) {
        Optional<Order> order = orderRepository.findById(id);
        return order.orElse(null);
    }

    @Override
    public List<Order> getOrdersByCustomerId(long id) {
        List<Order> res = orderRepository.findOrderByCustomerID(id);
        return res;
    }

    @Override
    public List<Order> getOrdersByCustomerIdAndTime(long id, Date begin, Date end) {
        List<Order> res = orderRepository.findOrderByCustomerID(id);
        return res;
    }

}
