package com.geekster.Mapping.service;

import com.geekster.Mapping.repository.IBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    IBook book;

}
