package com.axenix.ticket_service.entities.system;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.LinkedHashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "trains")
@Getter
@Setter
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "start_location_id")
    private StopLocation startLocation;

    @OneToMany(mappedBy = "train", orphanRemoval = true)
    private Set<StopLocation> stopLocations = new LinkedHashSet<>();

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "end_location_id")
    private StopLocation endLocation;

    @OneToMany(mappedBy = "train", orphanRemoval = true)
    private Set<Wagon> wagons = new LinkedHashSet<>();
}
