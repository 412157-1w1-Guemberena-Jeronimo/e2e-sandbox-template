package ar.edu.utn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReservadosTest {

    @Test
    @DisplayName("oculto: incluye el cero como par")
    void incluyeCero() {
        assertEquals(6, Main.sumaPares(new int[] {0, 1, 2, 3, 4}));
    }

    @Test
    @DisplayName("oculto: todos los elementos son pares")
    void todosPares() {
        assertEquals(20, Main.sumaPares(new int[] {2, 4, 6, 8}));
    }

    @Test
    @DisplayName("oculto: un solo elemento par")
    void unSoloPar() {
        assertEquals(10, Main.sumaPares(new int[] {10}));
    }

    @Test
    @DisplayName("oculto: un solo elemento impar")
    void unSoloImpar() {
        assertEquals(0, Main.sumaPares(new int[] {9}));
    }

    @Test
    @DisplayName("oculto: valores grandes")
    void valoresGrandes() {
        assertEquals(2000000000, Main.sumaPares(new int[] {1000000000, 1000000000, 3}));
    }
}
