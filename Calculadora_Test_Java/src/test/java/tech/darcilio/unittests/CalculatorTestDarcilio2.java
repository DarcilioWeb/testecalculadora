package tech.darcilio.unittests;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import tech.darcilio.calculadora.Calculator;

public class CalculatorTestDarcilio2 {
    
        private Calculator calculator;
    private int NumeroPositivo1, NumeroPositivo2, Zero, NumeroNegativo;

    @BeforeEach
    void Configuração() {
        calculator = new Calculator();
        NumeroPositivo1 = 5;
        NumeroPositivo2 = 2;
        Zero = 0;
        NumeroNegativo = -1;
    }

    @Test
    void Fatorial() {
        calculator = new Calculator();
        assertEquals(120, calculator.factorial(NumeroPositivo1));
    }

    @Test
    void FatorialZero() {
        assertEquals(1, calculator.factorial(Zero));
    }

    @Test
    void FatorialNumeroNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(NumeroNegativo);
        }, "Fatorial não definido para números negativos");
    }

    @Test
    void Potencia() {
        assertEquals(25, calculator.potencia(NumeroPositivo1, NumeroPositivo2));
    }

    void PotenciaZero() {
        assertEquals(0, calculator.potencia(Zero, NumeroPositivo1));
        assertEquals(1, calculator.potencia(Zero, Zero));
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.potencia(Zero, NumeroNegativo);
        }, "Colocar Expoente com Zero");
    }
}
