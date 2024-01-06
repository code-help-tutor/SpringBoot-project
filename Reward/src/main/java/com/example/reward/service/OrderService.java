WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package com.example.reward.service;

import com.example.reward.pojo.entity.Order;

import java.util.Date;
import java.util.List;

public interface OrderService {
    Order insertOrder(Order order);

    Order getByOrderId(long id);

    List<Order> getOrdersByCustomerId(long id);

    List<Order> getOrdersByCustomerIdAndTime(long id, Date begin, Date end);
}
