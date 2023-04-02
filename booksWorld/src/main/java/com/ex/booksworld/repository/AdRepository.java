package com.ex.booksworld.repository;

import com.ex.booksworld.model.entity.AdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdRepository extends JpaRepository<AdEntity , String> {
}
