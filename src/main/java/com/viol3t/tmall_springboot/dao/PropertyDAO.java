package com.viol3t.tmall_springboot.dao;

import com.viol3t.tmall_springboot.pojo.Category;
import com.viol3t.tmall_springboot.pojo.Property;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PropertyDAO extends JpaRepository<Property,Integer> {
    Page<Property> findByCategory(Category category, Pageable Property);
}
