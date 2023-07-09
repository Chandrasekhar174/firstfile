package com.geekster.Ecommerce.API.repository;

import com.geekster.Ecommerce.API.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface IAddress extends CrudRepository<Address,Long> {
}
