package tech.darcilio.unittests;

import tech.darcilio.calculadora.Desconto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DescontoCalculatorTest {

    @Test
    void testCalculaDesconto() {
        Desconto desconto = new Desconto();

        // Teste com valores normais
        assertEquals(90.0, desconto.calculaDesconto(100.0, 10.0), 0.001);
        assertEquals(75.0, desconto.calculaDesconto(100.0, 25.0), 0.001);
        assertEquals(0.0, desconto.calculaDesconto(100.0, 100.0), 0.001);

        // Teste com valor zero
        assertEquals(0.0, desconto.calculaDesconto(0.0, 50.0), 0.001);

        // Teste com desconto zero
        assertEquals(100.0, desconto.calculaDesconto(100.0, 0.0), 0.001);
    }

    @Test
    void testCalculaDescontoValoresInvalidos() {
        Desconto desconto = new Desconto();

        // Teste com preço negativo
        assertThrows(IllegalArgumentException.class, () -> desconto.calculaDesconto(-100.0, 10.0));

        // Teste com percentual negativo
        assertThrows(IllegalArgumentException.class, () -> desconto.calculaDesconto(100.0, -10.0));

        // Teste com percentual acima de 100
        assertThrows(IllegalArgumentException.class, () -> desconto.calculaDesconto(100.0, 110.0));
    }
}
