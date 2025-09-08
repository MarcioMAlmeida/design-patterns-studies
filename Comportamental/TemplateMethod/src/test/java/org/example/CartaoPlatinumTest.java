package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartaoPlatinumTest {

    @Test
    void deveRetornarPontuacaoDobrada() {
        CartaoPlatinum cp = new CartaoPlatinum();
        cp.setGastos(100.0);
        assertEquals(200.0, cp.calcularPontos());
    }

    @Test
    void deveRetornarInformacoes() {
        CartaoPlatinum cp = new CartaoPlatinum();
        cp.setGastos(100.0);
        cp.setNome("Marcio");
        cp.setNumero("5502000012340000");
        assertEquals("Cartao{numero=5502000012340000, nome=Marcio', pontos=200.0}", cp.getInfo());
    }
}