package tech.darcilio.unittests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tech.darcilio.calculadora.Calculator;

class CalculatorTestDarcilio {

    private Calculator calculator;
    private int NumeroPositivo1, NumeroPositivo2, NumeroPositivo3, Zero, NumeroNegativo;

    @BeforeEach
    void Configuração() {
        calculator = new Calculator();
        NumeroPositivo1 = 5;
        NumeroPositivo2 = 2;
        NumeroPositivo3 = 10;
        Zero = 0;
        NumeroNegativo = -1;
    }

    @Test
    void adicao() {
        calculator = new Calculator();
        assertEquals(7, calculator.adicao(NumeroPositivo1, NumeroPositivo2));
    }

    @Test
    void adicaoZero() {
        calculator = new Calculator();
        assertEquals(5, calculator.adicao(NumeroPositivo1, Zero));
    }

    @Test
    void adicaoNumeroNegativo() {
        calculator = new Calculator();
        assertEquals(4, calculator.adicao(NumeroPositivo1, NumeroNegativo));
    }

    @Test
    void subtracao() {
        calculator = new Calculator();
        assertEquals(3, calculator.subtracao(NumeroPositivo1, NumeroPositivo2));
    }

    @Test
    void subtracaoZero() {
        calculator = new Calculator();
        assertEquals(5, calculator.subtracao(NumeroPositivo1, NumeroNegativo));
    }

    @Test
    void subtracaoNumeroNegativo() {
        calculator = new Calculator();
        assertEquals(6, calculator.subtracao(NumeroPositivo1, NumeroNegativo));
    }

    @Test
    void multiplicacao() {
        calculator = new Calculator();
        assertEquals(10, calculator.multiplicacao(NumeroPositivo1, NumeroPositivo2));
    }

    @Test
    void multiplicacaoZero() {
        calculator = new Calculator();
        assertEquals(0, calculator.multiplicacao(NumeroPositivo1, Zero));
    }

    @Test
    void multiplicacaoNumeroNegativo() {
        calculator = new Calculator();
        assertEquals(-5, calculator.multiplicacao(NumeroPositivo1, NumeroNegativo));
    }

    @Test
    void divisao() {
        calculator = new Calculator();
        assertEquals(5, calculator.divisao(NumeroPositivo3, NumeroPositivo2));
    }

    @Test
    void divisaoZero() {
        calculator = new Calculator();
        assertEquals(0, calculator.divisao(Zero, NumeroPositivo2));
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divisao(NumeroPositivo1, Zero);  // Exceção para número negativo
        }, "Divisor não é para 0");
    }
    
    @Test
    void divisaoNumeroNegativo() {
        calculator = new Calculator();
        assertEquals(0, calculator.divisao(NumeroNegativo, NumeroPositivo2));
    }
}