package com.refactorizando.hexagonalarchitecture.infrastructure.db.springdata.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.refactorizando.hexagonalarchitecture.infrastructure.db.springdata.dbo.UserEntity;

@Repository
public interface SpringDataUserRepository extends JpaRepository<UserEntity, Long> {

}
