package cl.skaberen.junit.juniit_example.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cl.skaberen.junit.juniit_example.models.Cuenta;

public class CuentaTest {

    @DisplayName(value = "Test nombre cuenta")
    @Test
    void testNombreCuenta() {
        Cuenta cuenta = Cuenta.builder().persona("Andres").build();

        String nombreEsperado = "Andres";
        String nombreReal = cuenta.getPersona();
        assertEquals(nombreEsperado, nombreReal);
    }
}
