package com.example.msbookscatalogue.msbookscatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.msbookscatalogue.msbookscatalogue.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
