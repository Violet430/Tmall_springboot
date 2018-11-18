package com.viol3t.tmall_springboot.dao;

import com.viol3t.tmall_springboot.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Integer> {
    User findByName(String name);
    User getByNameAndPassword(String name,String password);
}
