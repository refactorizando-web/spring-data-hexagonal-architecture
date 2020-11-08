package com.refactorizando.hexagonalarchitecture.infrastructure.rest.spring.mapper;

import org.mapstruct.Mapper;

import com.refactorizando.hexagonalarchitecture.domain.User;
import com.refactorizando.hexagonalarchitecture.infrastructure.rest.spring.dto.UserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {

  UserDto toDto (User user);

  User toDomain(UserDto userDto);
}
