package com.axenix.ticket_service.services.impl;

import com.axenix.ticket_service.repositories.TicketRepository;
import com.axenix.ticket_service.services.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;
}
