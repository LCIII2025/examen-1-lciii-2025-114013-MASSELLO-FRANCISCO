package org.example.parking;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vehiculo {
    public enum Tipo {
        AUTO, SUV, PICKUP
    }

    private final String patente;
    private final String modelo;
    private final Tipo tipo;

}
