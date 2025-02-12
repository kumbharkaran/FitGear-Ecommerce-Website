package com.fitgear.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fitgear.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
