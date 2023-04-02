package com.ex.booksworld.repository;

import com.ex.booksworld.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity , String> {

    Optional<UserEntity> findByUsernameAndPassword(String username , String password);

}
