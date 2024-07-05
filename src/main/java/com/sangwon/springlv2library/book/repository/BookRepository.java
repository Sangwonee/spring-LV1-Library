package com.sangwon.springlv2library.book.repository;

import com.sangwon.springlv2library.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
