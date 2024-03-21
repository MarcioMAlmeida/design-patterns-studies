package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void deveRetornarExcecaoParaContaInvalida() {
        try {
            ContaBuilder alunoBuilder = new ContaBuilder();
            Conta conta = alunoBuilder
                    .setAgencia(12345)
                    .setNome("Dono Conta")
                    .setCPF("132.456.789.00")
                    .setSaldo(0.0)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Conta inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaAgenciaInvalida() {
        try {
            ContaBuilder alunoBuilder = new ContaBuilder();
            Conta conta = alunoBuilder
                    .setConta(12345)
                    .setNome("Dono Conta")
                    .setCPF("132.456.789.00")
                    .setSaldo(0.0)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Agencia inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaNomeInvalido() {
        try {
            ContaBuilder alunoBuilder = new ContaBuilder();
            Conta conta = alunoBuilder
                    .setConta(12345)
                    .setAgencia(12345)
                    .setCPF("132.456.789.00")
                    .setSaldo(0.0)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCPFInvalido() {
        try {
            ContaBuilder alunoBuilder = new ContaBuilder();
            Conta conta = alunoBuilder
                    .setConta(12345)
                    .setAgencia(12345)
                    .setNome("Dono Conta")
                    .setSaldo(0.0)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CPF inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaSaldoInvalida() {
        try {
            ContaBuilder alunoBuilder = new ContaBuilder();
            Conta conta = alunoBuilder
                    .setConta(12345)
                    .setAgencia(12345)
                    .setNome("Dono Conta")
                    .setCPF("132.456.789.00")
                    .setSaldo(100.0)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Saldo inválido", e.getMessage());
        }
    }

}