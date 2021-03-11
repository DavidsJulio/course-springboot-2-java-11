package com.david.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
