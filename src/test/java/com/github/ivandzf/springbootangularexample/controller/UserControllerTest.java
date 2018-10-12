package com.github.ivandzf.springbootangularexample.controller;

import com.github.ivandzf.springbootangularexample.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

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
public class UserControllerTest {

    @LocalServerPort
    private int port;

    private String url;

    @Before
    public void init() {
        url = "http://localhost:" + port + "/";
    }

    @Test
    public void saveTest() {
        User user = new User();
        user.setName("ivan");
        user.setAge(23);

        ResponseEntity<User> response = new TestRestTemplate().postForEntity(url + "/save", user, User.class);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
    }

    @Test
    public void findAllTest() {
        ResponseEntity<List> response = new TestRestTemplate().getForEntity(url + "/findall", List.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

}
