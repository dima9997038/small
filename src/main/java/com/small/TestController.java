package com.small;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final UserRepository userRepository;

    public TestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public String test() {
        String result = "";
        userRepository.save(new User(null,"Tell"));
        for (User user : userRepository.findAll()) {
            System.out.println(user);
            result += user.toString();
        }
        return result;
    }
}
