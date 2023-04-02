package com.ex.booksworld.repository;

import com.ex.booksworld.model.entity.MessagesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagesRepository extends JpaRepository<MessagesEntity , String> {
}
