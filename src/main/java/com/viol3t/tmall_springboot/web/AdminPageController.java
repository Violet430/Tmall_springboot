package com.viol3t.tmall_springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPageController {
    //访问admin，跳转到admin_category_list
    @GetMapping(value = "/admin")
    public String admin(){
        return "redirect:admin_category_list";
    }
    //访问 admin_category_list 访问 admin/listCategory.html 文件
    @GetMapping(value = "/admin_category_list")
    public String listCategory(){
        return "admin/listCategory";
    }
    @GetMapping(value = "/admin_category_edit")
    public String editCategory(){
        return "admin/editCategory";
    }
}
