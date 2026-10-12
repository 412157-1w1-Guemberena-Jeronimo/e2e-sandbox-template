import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SumaParesTest {

    @Test
    @DisplayName("caso: suma de los pares")
    void sumaDePares() {
        assertEquals(12, Main.sumaPares(new int[] {2, 3, 4, 5, 6}));
    }
}