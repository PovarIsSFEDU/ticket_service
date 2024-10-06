package com.axenix.ticket_service.entities.system.types;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TrainType {
    LOCAL_ELECTRO("Электричка"),
    LONG_RAIL("Дальнего следования");

    private final String name;
}
