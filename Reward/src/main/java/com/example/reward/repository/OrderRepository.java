WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package com.example.reward.repository;

import com.example.reward.pojo.entity.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findOrderByCustomerID(long id);

    List<Order> findOrderByCustomerIdAndDateAfterAndDateBefore(long id, Date after, Date before);

}
