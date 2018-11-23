package com.viol3t.tmall_springboot.dao;

import com.viol3t.tmall_springboot.pojo.Order;
import com.viol3t.tmall_springboot.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDAO extends JpaRepository<Order,Integer> {
    public List<Order> findByUserAndStatusNotOrderByIdDesc(User user, String status);
}
