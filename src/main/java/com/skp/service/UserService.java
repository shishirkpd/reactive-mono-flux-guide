package com.skp.service;

import com.skp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public Mono<User> getUserById(String id) {
        return userRepository.findById(id);
    }
    public Flux<User> getUsersByName(String name) {
        return userRepository.findByName(name);
    }
}