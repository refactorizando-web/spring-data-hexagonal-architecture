package com.refactorizando.hexagonalarchitecture.infrastructure.db.springdata.dbo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserEntity {

  @Id
  private Long id;

  private String name;

  private String address;

}
