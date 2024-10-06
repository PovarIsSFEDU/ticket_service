package com.axenix.ticket_service.entities.system;

import com.axenix.ticket_service.entities.system.types.WagonType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.LinkedHashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "wagons")
@Getter
@Setter
public class Wagon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long num;

    @Enumerated(EnumType.STRING)
    private WagonType type;

    @OneToMany(mappedBy = "wagon", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Seat> seats = new LinkedHashSet<>();

    @ManyToOne
    @JoinColumn(name = "train_id")
    private Train train;

    public void addSeat(Seat seat) {
        this.seats.add(seat);
    }
}
