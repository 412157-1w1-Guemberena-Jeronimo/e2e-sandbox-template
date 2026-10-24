package ar.edu.utn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SumaParesTest {

    @Test
    @DisplayName("caso: suma de los pares")
    void sumaDePares() {
        assertEquals(12, Main.sumaPares(new int[] {2, 3, 4, 5, 6}));
    }

    @Test
    @DisplayName("caso: sin pares devuelve 0")
    void sinPares() {
        assertEquals(0, Main.sumaPares(new int[] {1, 3, 5, 7}));
    }

    @Test
    @DisplayName("caso: arreglo vacio devuelve 0")
    void arregloVacio() {
        assertEquals(0, Main.sumaPares(new int[] {}));
    }

    @Test
    @DisplayName("caso: pares negativos")
    void paresNegativos() {
        assertEquals(2, Main.sumaPares(new int[] {-2, 3, 4, -5}));
    }
}
