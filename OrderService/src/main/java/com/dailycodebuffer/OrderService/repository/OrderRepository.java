package com.dailycodebuffer.OrderService.repository;

import com.dailycodebuffer.OrderService.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
