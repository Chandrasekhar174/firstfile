package com.geekster.Mapping.repository;

import com.geekster.Mapping.model.Laptop;
import com.geekster.Mapping.model.Student;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptop extends JpaRepository<Laptop,Integer> {
}
