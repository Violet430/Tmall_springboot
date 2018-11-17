package com.viol3t.tmall_springboot.dao;

import com.viol3t.tmall_springboot.pojo.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDAO extends JpaRepository<Order,Integer> {
}
