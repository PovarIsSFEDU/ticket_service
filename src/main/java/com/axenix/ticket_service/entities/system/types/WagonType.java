package com.axenix.ticket_service.entities.system.types;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum WagonType {
    LOCAL ("Электричка"),
    PLATZCART("Плацкарт"),
    COUPE("Купе"),
    SV("СВ"),
    LUX("Люкс");
    private final String name;
}
