package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void deveRetornarLimiteTotalCredito() {
        Conta conta = new ContaCorrente(0.0f);

        assertEquals(0.0f, conta.getLimiteTotalCredito());
    }

    @Test
    void deveRetornarLimiteTotalCreditoComCartaoCredito() {
        Conta conta = new CartaoCredito(new ContaCorrente(0.0f));

        assertEquals(1000.0f, conta.getLimiteTotalCredito());
    }

    @Test
    void deveRetornarLimiteTotalCreditoComPixCredito() {
        Conta conta = new PixCredito(new ContaCorrente(0.0f));

        assertEquals(1000.0f, conta.getLimiteTotalCredito());
    }

    @Test
    void deveRetornarLimiteTotalCreditoComCreditoEspecial() {
        Conta conta = new CreditoEspecial(new ContaCorrente(0.0f));

        assertEquals(1000.0f, conta.getLimiteTotalCredito());
    }

    @Test
    void deveRetornarLimiteTotalCreditoComCartaoCreditoMaisPixCredito() {
        Conta conta = new CartaoCredito(new PixCredito(new ContaCorrente(0.0f)));

        assertEquals(2000.0f, conta.getLimiteTotalCredito());
    }

    @Test
    void deveRetornarLimiteTotalCreditoComCartaoCreditoMaisCreditoEspecial() {
        Conta conta = new CartaoCredito(new CreditoEspecial(new ContaCorrente(0.0f)));

        assertEquals(2000.0f, conta.getLimiteTotalCredito());
    }

    @Test
    void deveRetornarLimiteTotalCreditoComPixCreditoMaisCreditoEspecial() {
        Conta conta = new PixCredito(new CreditoEspecial(new ContaCorrente(0.0f)));

        assertEquals(2000.0f, conta.getLimiteTotalCredito());
    }

    @Test
    void deveRetornarLimiteTotalCreditoComCartaoCreditoMaisPixCreditoMaisCreditoEspecial() {
        Conta conta = new CartaoCredito(new PixCredito(new CreditoEspecial(new ContaCorrente(0.0f))));

        assertEquals(3000.0f, conta.getLimiteTotalCredito());
    }

    @Test
    void deveRetornarEstruturaConta() {
        Conta conta = new ContaCorrente();

        assertEquals("ContaCorrente", conta.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaContaComCartaoCredito() {
        Conta conta = new CartaoCredito(new ContaCorrente());

        assertEquals("ContaCorrente/CartaoCrédito", conta.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaContaComPixCredito() {
        Conta conta = new PixCredito(new ContaCorrente());

        assertEquals("ContaCorrente/PixCrédito", conta.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaContaComCreditoEspecial() {
        Conta conta = new CreditoEspecial(new ContaCorrente());

        assertEquals("ContaCorrente/CréditoEspecial", conta.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaContaComCartaoCreditoMaisPixCredito() {
        Conta conta = new CartaoCredito(new PixCredito (new ContaCorrente()));

        assertEquals("ContaCorrente/PixCrédito/CartaoCrédito", conta.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaContaComCartaoCreditoMaisCreditoEspecial() {
        Conta conta = new CartaoCredito(new CreditoEspecial (new ContaCorrente()));

        assertEquals("ContaCorrente/CréditoEspecial/CartaoCrédito", conta.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaContaComPixCreditoMaisCreditoEspecial() {
        Conta conta = new PixCredito(new CreditoEspecial (new ContaCorrente()));

        assertEquals("ContaCorrente/CréditoEspecial/PixCrédito", conta.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaContaComCartaoCreditoMaisPixCreditoMaisCreditoEspecial() {
        Conta conta = new CartaoCredito (new PixCredito(new CreditoEspecial (new ContaCorrente())));

        assertEquals("ContaCorrente/CréditoEspecial/PixCrédito/CartaoCrédito", conta.getEstrutura());
    }


}