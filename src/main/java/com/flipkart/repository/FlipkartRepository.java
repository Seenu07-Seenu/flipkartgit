package com.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flipkart.entity.Flipkart;

public interface FlipkartRepository extends JpaRepository<Flipkart, Integer> {

}
