package com.geekster.Mapping.repository;

import com.geekster.Mapping.model.Book;
import com.geekster.Mapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBook extends JpaRepository<Book,Long> {
}
