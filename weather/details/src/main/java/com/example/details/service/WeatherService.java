WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package com.example.details.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface WeatherService {
    List<Integer> findCityIdByName(String city);
    Map<String, Map> findCityNameById(int id);
}
