package org.example.parking;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cliente {
    private final String dni;
    private final String nombre;
    private final List<Vehiculo> vehiculos;

    public Cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        // TODO HECHO implementar la carga de vehiculos en el cliente
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehiculo no puede ser nulo");
        }
        if (buscarVehiculoPorPatente(vehiculo.getPatente()) != null) {
            throw new IllegalArgumentException("Ya existe un vehiculo con esta patente");
        }
        vehiculos.add(vehiculo);
    }

    public Vehiculo buscarVehiculoPorPatente(String patente) {
        // TODO HECHO implementar la busqueda de un vehiculo segun su patente
        if (patente == null || patente.trim().isEmpty()) {
            return null;
        }
        for (Vehiculo vehiculo : vehiculos) {
            String patenteActual = vehiculo.getPatente();
            if (patenteActual != null && patenteActual.equalsIgnoreCase(patente)) {
                return vehiculo;
            }
        }
        return null;

    }
}