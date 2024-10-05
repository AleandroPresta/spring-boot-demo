package com.example.demo.number;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NumberRepository extends JpaRepository<NumberEntity, Long> {
}