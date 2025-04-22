package com.webflux.demo.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Mono<UserDTO> getUserNickName(String id) {
        return userRepository.findById(id).map(m -> new UserDTO(m.getNickname()));
    }

    public Mono<UserDTO> getUserDetail(String id) {

        return userRepository.findById(id).map(m -> new UserDTO(m));
    }

}
