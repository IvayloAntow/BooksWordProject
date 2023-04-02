package com.ex.booksworld.service;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class BooksWorldUserDetailsService implements UserDetailsService {
//    private final AuthService authService;
//
//    public PathfinderUserDetailsService(AuthService authService) {
//        this.authService = authService;
//    }
//
//    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        var user = authService.getUserByUsername(username);

//        return new User(
//                user.getUsername(),
//                user.getPassword(),
//                user.getRoles().stream()
//                        .map(role -> new SimpleGrantedAuthority("ROLE_" + role.getName()))
//                        .collect(Collectors.toList())
//        );
        return new User(
                "user",
                "ssss",
                new ArrayList<>()
        );
    }
}