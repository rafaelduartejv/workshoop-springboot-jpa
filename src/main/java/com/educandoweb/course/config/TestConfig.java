package com.educandoweb.course.config;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.Array;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        User u3 = new User(null, "Rafael", "rafael@gmail.com", "548451144", "123456");
        User u4 = new User(null, "Ione", "Ione@gmail.com", "212215884", "123456");

        userRepository.saveAll(Arrays.asList(u1,u2,u3,u4));
    }
}
