package com.skp.service;

import com.skp.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@ExtendWith(MockitoExtension.class)
public class UserServiceMonoTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void testGetUserById() {
        User user = new User("1", "John");

        Mockito.when(userRepository.findById("1")).thenReturn(Mono.just(user));

        StepVerifier.create(userService.getUserById("1"))
                    .expectNext(user)
                    .verifyComplete();

        Mockito.verify(userRepository).findById("1");
    }
}
