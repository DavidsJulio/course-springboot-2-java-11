package com.david.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
