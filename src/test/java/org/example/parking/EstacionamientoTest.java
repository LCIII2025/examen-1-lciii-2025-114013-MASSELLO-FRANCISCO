package org.example.parking;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

public class EstacionamientoTest {

    @Test
    public void testRetirarVehiculo() throws Exception {
        //TODO HECHO test

        Estacionamiento est = new Estacionamiento();
        Cliente c = new Cliente("123", "Ana");
        Vehiculo v = new Vehiculo("ABC123", "Toyota", Vehiculo.Tipo.AUTO);

        est.ingresarVehiculo(c.getDni(), c.getNombre(), v);
        Ticket t = est.retirarVehiculo(v.getPatente());

        assertNotNull(t);
        assertEquals(v.getPatente(), t.getVehiculo().getPatente());
    }

    @Test
    public void testCalcularPrecio() throws Exception {
        // TODO HECHO test
        Cliente c = new Cliente("1312858","JuanCar");
        Vehiculo v = new Vehiculo("123154", "VW Golf", Vehiculo.Tipo.AUTO);

        Ticket t = new Ticket(c, v);
        t.setHoraSalida(t.getHoraEntrada().plusMinutes(90));

        double p = t.calcularPrecio();
        assertEquals(200.0, p);
    }

}