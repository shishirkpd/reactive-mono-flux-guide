package com.skp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/flux")
public class FluxController {
@GetMapping
    public Flux<String> getMultipleData() {
        return Flux.just("Data 1", "Data 2", "Data 3");
    }
}