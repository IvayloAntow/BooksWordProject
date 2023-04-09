package com.ex.booksworld.repository;

import com.ex.booksworld.model.entity.UserRoleEntity;
import com.ex.booksworld.model.entity.enums.UserRoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRoleEntity , String> {

    UserRoleEntity getUserRoleEntityByRole(UserRoleEnum role);
}
