package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercitoTest {

    @Test
    void deveRetornarExercito() {
        Capitao capitao1 = new Capitao("Capitao 1");

        Capitao capitao2 = new Capitao("Capitao 2");
        Soldado soldado1 = new Soldado("Soldado 1");
        capitao2.addMilitar(soldado1);

        Capitao capitao3 = new Capitao("Capitao 3");
        Soldado soldado2 = new Soldado("Soldado 2");
        Soldado soldado3 = new Soldado("Soldado 3");
        capitao3.addMilitar(soldado2);
        capitao3.addMilitar(soldado3);

        Capitao comandante = new Capitao("Comandante 1");
        comandante.addMilitar(capitao1);
        comandante.addMilitar(capitao2);
        comandante.addMilitar(capitao3);


        Exercito exercito = new Exercito();
        exercito.setTropa(comandante);

        assertEquals("Capitão: Comandante 1\n" +
                "Capitão: Capitao 1\n" +
                "Capitão: Capitao 2\n" +
                "Soldado: Soldado 1\n" +
                "Capitão: Capitao 3\n" +
                "Soldado: Soldado 2\n" +
                "Soldado: Soldado 3\n", exercito.getTropa());
    }

    @Test
    void deveRetornarExercitoSemTropas() {
        try {
            Exercito exercito = new Exercito();
            exercito.getTropa();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Exercito sem tropas", e.getMessage());
        }
    }
}