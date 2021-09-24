package MiTest;

import Taller3.Funciones;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class FactorialTest {
    @Test
    public void testfactorial() {
        // Arrange
        Funciones factorial = new Funciones();
        // Act
        int res = Funciones.factorial(1);
        // Assert
        assertEquals(1, res);
    }

}
