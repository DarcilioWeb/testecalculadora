package tech.darcilio.unittests;

import org.junit.jupiter.api.Test;

import tech.darcilio.calculadora.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testFactorialPositiveNumber() {
        Calculator calculator = new Calculator();
        assertEquals(120, calculator.factorial(5));
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void testFactorialNegativeNumber() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-1);
        });
        assertEquals("Negative number", exception.getMessage());
    }

    @Test
    void testAdicao() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.adicao(3, 3));
        assertEquals(5, calculator.adicao(5, 0));
    }
    
    @Test
    void testSubtracao() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtracao(4, 3));
        assertEquals(5, calculator.subtracao(10, 5));
    }

    @Test
    void testMultiplicacao() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.multiplicacao(4, 3));
        assertEquals(24, calculator.multiplicacao(6, 4));
    }

    @Test
    void testDivisao() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.divisao(0, 999));
        assertEquals(12, calculator.divisao(24, 2));
    }

    @Test
    void testDivisaoZero() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divisao(999, 0);
        });
        assertEquals("Numero Negativo", exception.getMessage());
    }

    @Test
    void testPotencia() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.potencia(999, 0));
        assertEquals(25, calculator.potencia(5, 2));
        assertEquals(0, calculator.potencia(0, 999));
    }

    @Test
    void testPotenciaAbaixoDe0() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class , () -> {
            calculator.potencia(0, 0.5);
        });
        assertEquals("Numero Negativo", exception.getMessage());
    }
}

