package com.skp.controller;

import com.skp.model.User;
import com.skp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Mono<User> getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @GetMapping("/name/{name}")
    public Flux<User> getUsersByName(@PathVariable String name) {
        return userService.getUsersByName(name);
    }

    /*@GetMapping("/{id}")
    public Mono<String> getSingleDataWithError(@PathVariable String id) {
        return Mono.just(id)
                .map(data -> {
                    if (data.equals("error")) {
                        throw new RuntimeException("Error occurred");
                    }
                    return "Data for ID: " + id;
                })
                .onErrorResume(e -> Mono.just("Fallback Data"));
    }*/
}