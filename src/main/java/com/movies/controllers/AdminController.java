package com.movies.controllers;

import com.movies.dto.RegisterUserDto;
import com.movies.entities.User;
import com.movies.services.AuthenticationService;
import com.movies.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/admin")
@RestController
public class AdminController {

    private final UserService userService;
    private final AuthenticationService authenticationService;

    public AdminController(UserService userService, AuthenticationService authenticationService) {
        this.userService = userService;
        this.authenticationService = authenticationService;
    }

    @Secured({"ADMIN","SUPERADMIN"})
    @GetMapping("/users")
    public ResponseEntity<List<User>> allUsers() {

        List <User> users = userService.allUsers();

        return ResponseEntity.ok(users);
    }

    @Secured({"SUPERADMIN","ADMIN"})
    @GetMapping("/add-admin")
    public ResponseEntity<User> addAdmin(@RequestBody RegisterUserDto registerUserDto) {
        User registeredUser = authenticationService.addAdmin(registerUserDto);
        return ResponseEntity.ok(registeredUser);
    }
}
