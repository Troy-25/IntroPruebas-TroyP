package util;

import org.junit.jupiter.api.Test;
import org.sergiolozanoprofe.util.InputParser;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {

    InputParser parser = new InputParser();

    @Test
    void parseEntradaValida() {
        var result = parser.parseInt("3 + 5");

        assertEquals(3, result);
        assertEquals(5, result);
        assertEquals("+", result);//cambio aqui
    }

    @Test
    void parseConEspacios() {
        var result = parser.parseInt(" 10   *  2 ");

        assertEquals(10, result);
        assertEquals(2, result);
        assertEquals("*", result);//cambio aqui
    }

    @Test
    void entradaIncorrectaLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class,
                () -> parser.wait());//cambio aqui
    }
}
