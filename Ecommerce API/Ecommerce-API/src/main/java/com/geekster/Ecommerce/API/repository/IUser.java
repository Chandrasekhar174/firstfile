package com.geekster.Ecommerce.API.repository;

import com.geekster.Ecommerce.API.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUser extends CrudRepository<User,Long> {
}
