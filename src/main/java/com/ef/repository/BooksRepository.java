package com.ef.repository;

import org.springframework.data.repository.CrudRepository;
import com.ef.model.Books;


public interface BooksRepository extends CrudRepository<Books, Integer> {
}
