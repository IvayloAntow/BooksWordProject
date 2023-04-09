package com.ex.booksworld.repository;

import com.ex.booksworld.model.entity.AuthorEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity , String> {
    AuthorEntity getAuthorEntityByFirstNameAndLastName(String firstName , String lastName);
}
