package com.refactorizando.hexagonalarchitecture.infrastructure.rest.spring.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.refactorizando.hexagonalarchitecture.application.service.UserService;
import com.refactorizando.hexagonalarchitecture.infrastructure.rest.spring.dto.UserDto;
import com.refactorizando.hexagonalarchitecture.infrastructure.rest.spring.mapper.UserMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class Resources {

  private final UserService userService;

  private final UserMapper userMapper;

  @GetMapping("users/user/{id}")
  public ResponseEntity<UserDto> getUserById(@PathVariable Long id) {

    return new ResponseEntity<>(userMapper.toDto(userService.getUser(id)), HttpStatus.OK);

  }

  @PostMapping("users")
  public ResponseEntity<UserDto> saveUser(@RequestBody UserDto userDto) {

    return new ResponseEntity<>(userMapper.toDto(userService.saveUser(userMapper.toDomain(userDto))),
        HttpStatus.CREATED);

  }

}
