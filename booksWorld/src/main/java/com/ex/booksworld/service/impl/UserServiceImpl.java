package com.ex.booksworld.service.impl;

import com.ex.booksworld.model.entity.UserEntity;
import com.ex.booksworld.model.entity.UserRoleEntity;
import com.ex.booksworld.model.entity.enums.UserRoleEnum;
import com.ex.booksworld.model.service.UserServiceModel;
import com.ex.booksworld.repository.UserRepository;
import com.ex.booksworld.repository.UserRoleRepository;
import com.ex.booksworld.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserRoleRepository userRoleRepository;
    private final ModelMapper modelMapper;
    public UserServiceImpl(UserRepository userRepository, UserRoleRepository userRoleRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public boolean register(UserServiceModel userServiceModel) {
        try {
            Optional<UserEntity>userr = userRepository.findByUsername(userServiceModel.getUsername());
            if (userr.isPresent()){
                return false;
            }


            String generatedSecuredPasswordHash = BCrypt.hashpw(userServiceModel.getPassword(), BCrypt.gensalt(12));
            userServiceModel.setPassword(generatedSecuredPasswordHash);

            if (userRepository.count()==0){
                UserRoleEntity userRoleEntity = userRoleRepository.getUserRoleEntityByRole(UserRoleEnum.Admin);
                userServiceModel.setUserRole(userRoleEntity);
            }
                UserRoleEntity userRoleEntity = userRoleRepository.getUserRoleEntityByRole(UserRoleEnum.User);
                userServiceModel.setUserRole(userRoleEntity);


            userRepository
                    .save(modelMapper.map(userServiceModel , UserEntity.class));

        }catch (Exception e){
            return false;
        }

        return true;
    }

    @Override
    public UserServiceModel findByUsernameAndPassword(String username, String password) {

        boolean isFound = false;

        Optional<UserEntity>userr = userRepository.findByUsername(username);
        if (userr.isPresent()) {
            if (BCrypt.checkpw(password,userr.get().getPassword() )){
                isFound = true;
            }

        }

        if (isFound) {

            return userr
                    .map(user -> modelMapper.map(user, UserServiceModel.class))
                    .orElse(null);
        }
        return null;

    }

}
