WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package com.example.reward.pojo.dto;

import com.example.reward.pojo.entity.Order;
import lombok.*;

import javax.persistence.Column;
import java.util.Date;


@Data
public class OrderDto {

    long OrderID;
    long customerID;
    long amount;
    Date date;

    public OrderDto(Order order) {
        this.amount = order.getAmount();
        this.customerID = order.getCustomerId();
        this.date = order.getDate();
        this.OrderID = order.getOrderId();
    }

}
