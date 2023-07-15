package com.geekster.Mapping.repository;

import com.geekster.Mapping.model.Address;
import com.geekster.Mapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddress extends JpaRepository<Address,Long> {
}
