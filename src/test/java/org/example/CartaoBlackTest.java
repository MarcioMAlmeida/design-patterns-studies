package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartaoBlackTest {

    @Test
    void deveRetornarPontuacaoTriplicado() {
        CartaoBlack cb = new CartaoBlack();
        cb.setGastos(100.0);
        assertEquals(300.0, cb.calcularPontos());
    }

    @Test
    void deveRetornarInformacoes() {
        CartaoBlack cb = new CartaoBlack();
        cb.setGastos(100.0);
        cb.setNome("Marcio");
        cb.setNumero("5502000012340000");
        assertEquals("Cartao{numero=5502000012340000, nome=Marcio', pontos=300.0}", cb.getInfo());
    }
}