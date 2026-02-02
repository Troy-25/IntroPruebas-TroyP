package service;

import org.junit.jupiter.api.Test;
import org.sergiolozanoprofe.CalculatorService;
import org.sergiolozanoprofe.model.OperationType;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test
    void sumaFunciona() {
        assertEquals(5.0, service.add(2, 3));
    }

    @Test
    void restaFunciona() {
        assertEquals(1.0, service.subtract(3, 2));
    }

    @Test
    void multiplicacionFunciona() {
        assertEquals(6.0, service.multiply(2, 3));
    }

    @Test
    void divisionFunciona() {
        assertEquals(2.0, service.divide(6, 3));
    }

    @Test
    void dividirEntreCeroLanzaExcepcion() {
        assertThrows(ArithmeticException.class,
                () -> service.divide(5, 0));
    }

    @Test
    void computeSuma() {
        assertEquals(7.0,
                service.compute(3, OperationType.ADD, 4));
    }
}
