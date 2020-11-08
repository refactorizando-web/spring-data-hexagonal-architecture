package com.refactorizando.hexagonalarchitecture.application.service;

import com.refactorizando.hexagonalarchitecture.application.repository.UserRepository;
import com.refactorizando.hexagonalarchitecture.domain.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class UserService {

  private final UserRepository userRepository;

  public User getUser(Long id) {

    return userRepository.findById(id);
  }

  public User saveUser(User user) {

    return userRepository.save(user);

  }
}
