package com.cedlearn.springbootlibrary.dao;

import com.cedlearn.springbootlibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
