package com.brunoarduarte.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoarduarte.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
