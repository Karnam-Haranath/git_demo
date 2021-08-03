package com.springboot.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.mongodb.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
