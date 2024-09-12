package com.skp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
public class FluxControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void testGetMultipleData() {
        webTestClient.get()
                .uri("/flux")
                .exchange()
                .expectStatus().isOk()
                .expectBodyList(String.class)
                .hasSize(1)
                .contains("Data 1"+"Data 2"+"Data 3");
    }
}
