package com.viol3t.tmall_springboot.dao;

import com.viol3t.tmall_springboot.pojo.Category;
import com.viol3t.tmall_springboot.pojo.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDAO extends JpaRepository<Product,Integer> {
    Page<Product> findByCategory(Category category, Pageable pageable);

    //前台首页
    List<Product> findByCategoryOrderById(Category category);
    //search
    List<Product> findByNameLike(String keyword,Pageable pageable);
}
