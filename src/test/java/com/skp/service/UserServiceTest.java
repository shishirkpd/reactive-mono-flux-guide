package com.skp.service;

import com.skp.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void testGetUsersByName() {
        User user1 = new User("1", "John");
        User user2 = new User("2", "John");

        Mockito.when(userRepository.findByName("John")).thenReturn(Flux.just(user1, user2));

        StepVerifier.create(userService.getUsersByName("John"))
                    .expectNext(user1)
                    .expectNext(user2)
                    .verifyComplete();

        Mockito.verify(userRepository).findByName("John");
    }
}