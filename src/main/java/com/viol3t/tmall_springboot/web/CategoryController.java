package com.viol3t.tmall_springboot.web;

import com.viol3t.tmall_springboot.pojo.Category;
import com.viol3t.tmall_springboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> list(){
        return categoryService.list();
    }
}
