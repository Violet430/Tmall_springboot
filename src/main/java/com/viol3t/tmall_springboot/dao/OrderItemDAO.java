package com.viol3t.tmall_springboot.dao;

import com.viol3t.tmall_springboot.pojo.Order;
import com.viol3t.tmall_springboot.pojo.OrderItem;
import com.viol3t.tmall_springboot.pojo.Product;
import com.viol3t.tmall_springboot.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemDAO extends JpaRepository<OrderItem, Integer> {
    List<OrderItem> findByOrderOrderByIdDesc(Order order);
    List<OrderItem> findByProduct(Product product);
    List<OrderItem> findByUserAndOrderIsNull(User user);
}
