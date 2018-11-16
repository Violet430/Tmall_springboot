package com.viol3t.tmall_springboot.service;

import com.viol3t.tmall_springboot.dao.PropertyValueDAO;
import com.viol3t.tmall_springboot.pojo.Product;
import com.viol3t.tmall_springboot.pojo.Property;
import com.viol3t.tmall_springboot.pojo.PropertyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyValueService {
    @Autowired
    PropertyValueDAO propertyValueDAO;
    @Autowired
    PropertyService propertyService;

    public void update(PropertyValue propertyValue){
        propertyValueDAO.save(propertyValue);
    }
    public void init(Product product){
        List<Property> properties = propertyService.listByCategory(product.getCategory());
        for(Property property:properties){
            PropertyValue propertyValue = getByPropertyAndProduct(product,property);
            if(null==propertyValue){
                propertyValue = new PropertyValue();
                propertyValue.setProduct(product);
                propertyValue.setProperty(property);
                propertyValueDAO.save(propertyValue);
            }
        }
    }
    public PropertyValue getByPropertyAndProduct(Product product,Property property){
        return propertyValueDAO.getByPropertyAndProduct(property,product);
    }
    public List<PropertyValue> list(Product product){
        return propertyValueDAO.findByProductOrderByIdDesc(product);
    }
}
