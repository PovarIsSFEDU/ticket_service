package com.axenix.ticket_service.services.impl;

import com.axenix.ticket_service.repositories.OrderRepository;
import com.axenix.ticket_service.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
}
