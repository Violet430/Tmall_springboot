package com.viol3t.tmall_springboot.service;

import com.viol3t.tmall_springboot.dao.ProductImageDAO;
import com.viol3t.tmall_springboot.pojo.Product;
import com.viol3t.tmall_springboot.pojo.ProductImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImageService {
    public static final String type_single = "single";
    public static final String type_detail = "detail";
    @Autowired
    ProductImageDAO productImageDAO;
    @Autowired
    ProductService productService;
    public void add(ProductImage bean){
        productImageDAO.save(bean);
    }
    public void delete(int id){
        productImageDAO.deleteById(id);
    }
    public ProductImage get(int id){
        return productImageDAO.getOne(id);
    }
    public List<ProductImage> listSingleProductImages(Product product){
        return productImageDAO.findByProductAndTypeOrderByIdDesc(product,type_single);
    }
    public List<ProductImage> listDetailProductImages(Product product){
        return productImageDAO.findByProductAndTypeOrderByIdDesc(product,type_detail);
    }
    public void setFirstProductImage(Product product){
        List<ProductImage> singleImages = listSingleProductImages(product);
        if(!singleImages.isEmpty())
            product.setFirstProductImage(singleImages.get(0));
        else
            product.setFirstProductImage(new ProductImage());
    }
    public void setFirstProductImages(List<Product> products){
        for(Product product:products){
            setFirstProductImage(product);
        }
    }
}
