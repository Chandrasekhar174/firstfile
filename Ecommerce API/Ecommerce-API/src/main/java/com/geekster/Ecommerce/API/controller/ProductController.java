package com.geekster.Ecommerce.API.controller;

import com.geekster.Ecommerce.API.model.Category;
import com.geekster.Ecommerce.API.model.Product;
import com.geekster.Ecommerce.API.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("products")
    public void addProducts(@RequestBody List<Product> products)
    {
        productService.addProducts(products);
    }
//    @GetMapping("products/{category}")
//    public List<Product> getProducts(@PathVariable Category category)
//    {
//        return productService.getProducts(category);
//    }
    @DeleteMapping("product/{id}")
    public void DProduct(@PathVariable Long id)
    {
        productService.dProduct(id);
    }
}
