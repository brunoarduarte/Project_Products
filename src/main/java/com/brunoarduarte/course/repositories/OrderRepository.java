package com.brunoarduarte.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoarduarte.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
