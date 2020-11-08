package com.refactorizando.hexagonalarchitecture.infrastructure.db.springdata.repository;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.refactorizando.hexagonalarchitecture.application.repository.UserRepository;
import com.refactorizando.hexagonalarchitecture.domain.User;
import com.refactorizando.hexagonalarchitecture.infrastructure.db.springdata.mapper.UserEntityMapper;
import com.refactorizando.hexagonalarchitecture.infrastructure.rest.spring.mapper.UserMapper;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class UserDboRepository implements UserRepository {

  private final SpringDataUserRepository userRepository;

  private final UserEntityMapper userMapper;

  @Override
  public User findById(Long id) {
    return userMapper.toDomain(userRepository.findById(id).orElseThrow());
  }

  @Override
  public User save(User user) {

    return userMapper.toDomain(userRepository.save(userMapper.toDbo(user)));

  }
}
