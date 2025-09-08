package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartaoTest {

    @Test
    void deveEmitirFaturaCartaoBlack () {
        AbstractFactory factory = new FactoryBlack();
        Cartao cartao = new Cartao(factory);
        assertEquals("Fatura Cartão Black",cartao.emitirFatura());
    }

    @Test
    void deveEmitirFaturaCartaoPlatinum () {
        AbstractFactory factory = new FactoryPlatinum();
        Cartao cartao = new Cartao(factory);
        assertEquals("Fatura Cartão Platinum",cartao.emitirFatura());
    }

}