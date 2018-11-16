package com.viol3t.tmall_springboot.dao;

import com.viol3t.tmall_springboot.pojo.Product;
import com.viol3t.tmall_springboot.pojo.Property;
import com.viol3t.tmall_springboot.pojo.PropertyValue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropertyValueDAO extends JpaRepository<PropertyValue,Integer> {
    List<PropertyValue> findByProductOrderByIdDesc(Product product);
    PropertyValue getByPropertyAndProduct(Property property,Product product);
}
