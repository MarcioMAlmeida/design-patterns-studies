package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterpretadorExpressoesLogicasTest {

    @Test
    void retornaVerdadeiroMaior() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesLogicas("1.90 > 1.80");
        assertTrue(interpretador.interpretar());
    }

    @Test
    void retornaVerdadeiroMenor() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesLogicas("1.80 < 1.90");
        assertTrue(interpretador.interpretar());
    }

    @Test
    void retornaVerdadeiroIgual() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesLogicas("1.90 = 1.90");
        assertTrue(interpretador.interpretar());
    }

    @Test
    void retornaFalsoMaior() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesLogicas("1.80 > 1.90");
        assertFalse(interpretador.interpretar());
    }

    @Test
    void retornaFalsoMenor() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesLogicas("1.90 < 1.80");
        assertFalse(interpretador.interpretar());
    }

    @Test
    void retornaFalsoIgual() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesLogicas("1.95 = 1.90");
        assertFalse(interpretador.interpretar());
    }

    @Test
    void deveRetonarExcecaoElementoInvalido() {
        try {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesLogicas("2 >= 2");
            assertEquals(4.0, interpretador.interpretar());
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão com elemento inválido", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoInvalida() {
        try {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesLogicas("2 =");
            assertEquals(4.0, interpretador.interpretar());
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão inválida", e.getMessage());
        }
    }
}