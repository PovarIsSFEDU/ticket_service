package com.axenix.ticket_service.repositories;

import com.axenix.ticket_service.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
