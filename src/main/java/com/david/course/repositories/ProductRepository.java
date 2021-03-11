package com.david.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
