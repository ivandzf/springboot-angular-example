package com.github.ivandzf.springbootangularexample.controller;

import com.github.ivandzf.springbootangularexample.entity.User;
import com.github.ivandzf.springbootangularexample.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * springboot-angular-example
 *
 * @author Divananda Zikry Fadilla (12 October 2018)
 * Email: divanandazf@gmail.com
 * <p>
 * Documentation here !!
 */
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/findall")
    private ResponseEntity<List<User>> findAllUser() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    private void saveUser(@Valid @RequestBody User user) {
        userService.saveUser(user);
    }

}
