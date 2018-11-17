package com.viol3t.tmall_springboot.service;

import com.viol3t.tmall_springboot.dao.OrderItemDAO;
import com.viol3t.tmall_springboot.pojo.Order;
import com.viol3t.tmall_springboot.pojo.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {
    @Autowired
    OrderItemDAO orderItemDAO;
    @Autowired
    ProductImageService productImageService;
    public void fill(List<Order> orders){
        for(Order order:orders){
            fill(order);
        }
    }

    public void fill(Order order){
        List<OrderItem> orderItems = listByOrder(order);
        float total = 0;
        int totalNubmer = 0;
        for(OrderItem orderItem:orderItems){
            total+=orderItem.getNumber()*orderItem.getProduct().getPromotePrice();
            totalNubmer+=orderItem.getNumber();
            productImageService.setFirstProductImage(orderItem.getProduct());
        }
        order.setTotal(total);
        order.setTotalNumber(totalNubmer);
        order.setOrderItems(orderItems);

    }

    public List<OrderItem> listByOrder(Order order){
        return orderItemDAO.findByOrderOrderByIdDesc(order);
    }
}