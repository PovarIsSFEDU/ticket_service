package com.axenix.ticket_service.entities.system;

import com.axenix.ticket_service.entities.system.types.BookingStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "seats")
@Getter
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "seat_num")
    private String seatNum;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    @ManyToOne
    @JoinColumn(name = "wagon_id")
    private Wagon wagon;

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }
}
