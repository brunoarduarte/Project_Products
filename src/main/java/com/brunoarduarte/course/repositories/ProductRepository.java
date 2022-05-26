package com.brunoarduarte.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoarduarte.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
