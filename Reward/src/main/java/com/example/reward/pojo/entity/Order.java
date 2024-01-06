WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package com.example.reward.pojo.entity;


import lombok.*;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long orderId;

    @Column
    long customerId;

    @Column
    long amount;
    @Column
    Date date;
}
