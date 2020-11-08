package com.refactorizando.hexagonalarchitecture.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;

import com.refactorizando.hexagonalarchitecture.domain.User;
import com.refactorizando.hexagonalarchitecture.infrastructure.db.springdata.dbo.UserEntity;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {

  User toDomain(UserEntity userEntity);

  UserEntity toDbo(User user);


}
