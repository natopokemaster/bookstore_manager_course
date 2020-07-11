package com.natopokemaster.bookstoremanager.repository;

import com.natopokemaster.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
