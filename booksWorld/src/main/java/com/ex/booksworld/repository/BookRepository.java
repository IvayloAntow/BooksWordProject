package com.ex.booksworld.repository;

import com.ex.booksworld.model.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookEntity , String> {


    List<BookEntity> findAll();
}
