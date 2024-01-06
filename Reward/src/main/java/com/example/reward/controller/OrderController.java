WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package com.example.reward.controller;


import com.example.reward.pojo.dto.OrderDto;
import com.example.reward.pojo.entity.Order;
import com.example.reward.service.OrderService;
import com.example.reward.service.impl.OrderServiceImpl;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService service;

    @Autowired
    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<OrderDto> insertOrder(Order newOrder) {
        Order res = service.insertOrder(newOrder);
        return new ResponseEntity<>(new OrderDto(res), HttpStatus.OK);
    }

    @GetMapping("/byOrderId")
    public ResponseEntity<OrderDto> getByOrderId(@RequestParam long orderId) {
        Order order = service.getByOrderId(orderId);
        return new ResponseEntity<>(new OrderDto(order), HttpStatus.OK);
    }

    @GetMapping("/byCustomerId")
    public ResponseEntity<List<OrderDto>> getByCustomerId(@RequestParam long customerId) {
        List<OrderDto> ls=new ArrayList<>();
        List<Order> orders=service.getOrdersByCustomerId(customerId);
        // todo

        return new ResponseEntity<>(ls,HttpStatus.OK);
    }
}
