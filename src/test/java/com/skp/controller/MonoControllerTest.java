package com.skp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
public class MonoControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void testGetSingleData() {
        webTestClient.get()
                     .uri("/mono/1")
                     .exchange()
                     .expectStatus().isOk()
                     .expectBody(String.class)
                     .isEqualTo("Data for ID: 1");
    }
}
