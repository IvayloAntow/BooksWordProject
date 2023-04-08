package com.ex.booksworld.init;

import com.ex.booksworld.service.GenreService;
import com.ex.booksworld.service.UserRoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInit implements CommandLineRunner {

    private final UserRoleService roleService;
    private final GenreService genreService;

    public DatabaseInit(UserRoleService roleService, GenreService genreService) {
        this.roleService = roleService;
        this.genreService = genreService;
    }


    @Override
    public void run(String... args) throws Exception {
        roleService.initRoles();
        genreService.initGenre();
    }

}
