package com.refactorizando.hexagonalarchitecture.application.repository;

import com.refactorizando.hexagonalarchitecture.domain.User;

public interface UserRepository {

   User findById(Long id);

   User save(User user);

}
