package com.asjngroup.graphql.springbootgrapqlexample.repository;

import com.asjngroup.graphql.springbootgrapqlexample.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
