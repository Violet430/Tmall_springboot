package com.viol3t.tmall_springboot.dao;

import com.viol3t.tmall_springboot.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 集成了 JpaRepository
 * 就提供了CRUD和分页 的各种常见功能。
 * 这是采用 JPA 方便的地方
 */
public interface CategoryDAO extends JpaRepository<Category,Integer>{

}
