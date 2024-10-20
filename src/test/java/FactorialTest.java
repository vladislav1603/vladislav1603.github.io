import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    void testFactorial() {
        assertEquals(1, Factorial.calculate(0));
        assertEquals(1, Factorial.calculate(1));
        assertEquals(2, Factorial.calculate(2));
        assertEquals(6, Factorial.calculate(3));
        assertEquals(24, Factorial.calculate(4));
        assertEquals(120, Factorial.calculate(5));
    }

    @Test
    void testFactorialNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.calculate(-1);
        });
        assertEquals("Число не должно быть негативным", exception.getMessage());
    }
}
