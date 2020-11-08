package com.refactorizando.hexagonalarchitecture.infrastructure.config.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.refactorizando.hexagonalarchitecture.infrastructure")
@EntityScan(basePackages = "com.refactorizando.hexagonalarchitecture.domain")
public class SpringBootService {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootService.class, args);
  }

}