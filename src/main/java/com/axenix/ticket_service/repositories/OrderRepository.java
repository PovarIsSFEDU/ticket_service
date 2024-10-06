package com.axenix.ticket_service.repositories;

import com.axenix.ticket_service.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
