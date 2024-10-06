package com.axenix.ticket_service.entities.system.types;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum BookingStatus {
    CLOSED("Бронирование закрыто"),
    FREE("Свободно"),
    BOOKED("Забронировано");
    private final String name;
}
