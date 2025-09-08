package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void deveRetornarSaldoReal() {
        Conta conta = new Conta();
        conta.setSaldo(50);

        assertEquals(50, conta.getSaldo());
    }

    @Test
    void deveRetornarSaldoDollar() {
        Conta conta = new Conta();
        conta.setSaldo(10F);

        assertEquals(54.8F, conta.getValor());
    }
}