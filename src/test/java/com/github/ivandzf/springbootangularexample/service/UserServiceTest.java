package com.github.ivandzf.springbootangularexample.service;

import com.github.ivandzf.springbootangularexample.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * springboot-angular-example
 *
 * @author Divananda Zikry Fadilla (12 October 2018)
 * Email: divanandazf@gmail.com
 * <p>
 * Documentation here !!
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void saveUserTest() {
        User user = new User();
        user.setName("ivan");
        user.setAge(23);

        userService.saveUser(user);
    }

    @Test
    public void findUserTest() {
        List<User> users = userService.findAll();
        Assert.assertFalse(users.isEmpty());
    }

}
