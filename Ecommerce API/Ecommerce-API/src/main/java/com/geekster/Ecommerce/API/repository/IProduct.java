package com.geekster.Ecommerce.API.repository;

import com.geekster.Ecommerce.API.model.Category;
import com.geekster.Ecommerce.API.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProduct extends CrudRepository<Product,Long> {
//    @Query(value = "select * from Product where Category= :category")
//    List<Product> products(Category category);
}
