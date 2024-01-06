WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package com.example.reward.pojo.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RewardsDetail {
    long customerID;
    Date beginDate;
    Date endDate;
    long points;
}
