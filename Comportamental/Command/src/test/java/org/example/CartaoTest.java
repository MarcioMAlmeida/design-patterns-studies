package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartaoTest {

    Conta conta;
    Cartao cartao;

    @BeforeEach
    void setUp() {
        cartao = new Cartao();
        conta = new Conta(1000.0);
    }

    @Test
    void deveSacar() {
        Operacao saque = new OperacaoSaque(conta);
        cartao.executarOperacao(saque,500.0);

        assertEquals(500.0, conta.getSaldo());
    }

    @Test
    void naoDeveSacar() {
        Operacao saque = new OperacaoSaque(conta);
        try{
            cartao.executarOperacao(saque,1500.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Saldo insuficiente");
        }
    }

    @Test
    void deveDepositar() {
        Operacao deposito = new OperacaoDeposito(conta);
        cartao.executarOperacao(deposito,500.0);

        assertEquals(1500.0, conta.getSaldo());
    }

    @Test
    void deveCancelarSaque() {
        Operacao deposito = new OperacaoDeposito(conta);
        Operacao saque = new OperacaoSaque(conta);

        cartao.executarOperacao(deposito,500.0);
        cartao.executarOperacao(saque,1500.0);

        cartao.cancelarUltimaOperacao(1500.0);
        
        assertEquals(1500.0, conta.getSaldo());
    }
}