package com.ex.booksworld.service.impl;

import com.ex.booksworld.model.entity.UserRoleEntity;
import com.ex.booksworld.model.entity.enums.UserRoleEnum;
import com.ex.booksworld.repository.UserRoleRepository;
import com.ex.booksworld.service.UserRoleService;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    private final UserRoleRepository userRoleRepository;

    public UserRoleServiceImpl(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Override
    public void initRoles() {

        if (userRoleRepository.count() == 0) {

            userRoleRepository.save(new UserRoleEntity().setRole(UserRoleEnum.User));
            userRoleRepository.save(new UserRoleEntity().setRole(UserRoleEnum.Admin));
        }
    }
}
