WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package com.example.reward.controller;

import com.example.reward.pojo.entity.Order;
import com.example.reward.pojo.entity.RewardsDetail;
import com.example.reward.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Reward")
public class RewardController {

    private final OrderService orderService;

    @Autowired
    public RewardController(OrderService service) {
        orderService = service;
    }

    private long calculatePoint(long amount) {
        long res = 0;
        res += 2 * (amount - 100);
        // ??? 1 point per dollar over $50
        res += amount - 50;
        return res;
    }

    @GetMapping("/total/{id}")
    public ResponseEntity<RewardsDetail> getByCustomerId(@PathVariable long id) {
        List<Order> ls = orderService.getOrdersByCustomerId(id);
        long sum = 0;
        for (Order l : ls) {
            sum += calculatePoint(l.getAmount());
        }
        RewardsDetail detail = new RewardsDetail();
        detail.setCustomerID(id);
        detail.setPoints(sum);
        return new ResponseEntity<>(detail, HttpStatus.OK);
    }

    @GetMapping("/byTime/")
    public ResponseEntity<RewardsDetail> getByCustomerIdAndTime(@RequestParam long id, @RequestParam Date begin, @RequestParam Date end) {
        List<Order> ls = orderService.getOrdersByCustomerIdAndTime(id, begin, end);
        long sum = 0;
        for (Order l : ls) {
            sum += calculatePoint(l.getAmount());
        }
        RewardsDetail detail = new RewardsDetail(id, begin, end, sum);
        return new ResponseEntity<>(detail, HttpStatus.OK);
    }


}
