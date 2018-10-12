package com.github.ivandzf.springbootangularexample.service;

import com.github.ivandzf.springbootangularexample.entity.User;
import com.github.ivandzf.springbootangularexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * springboot-angular-example
 *
 * @author Divananda Zikry Fadilla (12 October 2018)
 * Email: divanandazf@gmail.com
 * <p>
 * Documentation here !!
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

}
