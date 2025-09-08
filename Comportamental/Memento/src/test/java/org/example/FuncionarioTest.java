package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveArmazenarEstados() {
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoTrabalhando.getInstance());
        funcionario.setEstado(FuncionarioEstadoAtestado.getInstance());
        assertEquals(2, funcionario.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoTrabalhando.getInstance());
        funcionario.setEstado(FuncionarioEstadoAtestado.getInstance());
        funcionario.restauraEstado(0);
        assertEquals(FuncionarioEstadoTrabalhando.getInstance(), funcionario.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoTrabalhando.getInstance());
        funcionario.setEstado(FuncionarioEstadoAtestado.getInstance());
        funcionario.setEstado(FuncionarioEstadoTrabalhando.getInstance());
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        funcionario.restauraEstado(2);
        assertEquals(FuncionarioEstadoTrabalhando.getInstance(), funcionario.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}