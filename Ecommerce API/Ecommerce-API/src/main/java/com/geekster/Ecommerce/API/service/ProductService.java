package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.model.Category;
import com.geekster.Ecommerce.API.model.Product;
import com.geekster.Ecommerce.API.repository.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProduct iProduct;

    public void addProducts(List<Product> products) {
        iProduct.saveAll(products);
    }

//    public List<Product> getProducts(Category category) {
//        return iProduct.products(category);
//    }

    public void dProduct(Long id) {
        iProduct.deleteById(id);
    }
}
