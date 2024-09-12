package com.skp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/mono")
public class MonoController {

    @GetMapping("/{id}")
    public Mono<String> getSingleData(@PathVariable String id) {
        return Mono.just("Data for ID: " + id);
    }
}
