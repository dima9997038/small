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
        for (User user : userRepository.findAll()) {
            result += user.toString();
        }
        return result;
    }
}
