package com.ex.booksworld.repository;

import com.ex.booksworld.model.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookEntity , String> {


    List<BookEntity> findAll();

    @Query(value = "select distinct b from BookEntity b left join fetch b.author where b.id = :id")
    BookEntity findBookById(@Param("id") String id);
}
