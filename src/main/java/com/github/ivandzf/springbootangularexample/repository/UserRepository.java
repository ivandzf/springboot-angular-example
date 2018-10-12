package com.github.ivandzf.springbootangularexample.repository;

import com.github.ivandzf.springbootangularexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * springboot-angular-example
 *
 * @author Divananda Zikry Fadilla (12 October 2018)
 * Email: divanandazf@gmail.com
 * <p>
 * Documentation here !!
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
