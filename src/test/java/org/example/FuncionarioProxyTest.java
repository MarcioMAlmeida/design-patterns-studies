package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioProxyTest {

    @BeforeEach
    void setUp() {
        BD.addFuncionario(new Funcionario("Jorge","123.456.789-00","jorjinho@gamil.com",true));
    }

    @Test
    void deveRetornarDadosFuncionario() {
        FuncionarioProxy funcionario = new FuncionarioProxy("123.456.789-00");

        assertEquals(Arrays.asList("Jorge","123.456.789-00","jorjinho@gamil.com"),funcionario.obterDadosFuncionario());
    }

    @Test
    void deveDemitirFuncionario() {
        Gerente gerente = new Gerente("Carlos",true);
        FuncionarioProxy funcionario = new FuncionarioProxy("123.456.789-00");

        assertEquals(false,funcionario.demitirFuncionario(gerente));
    }

    @Test
    void deveRetornarExcecaoUsuarioNaoAutorizadoDemitirFuncionario() {
        try {
            Gerente gerente = new Gerente("Carlos",false);
            FuncionarioProxy funcionario = new FuncionarioProxy("123.456.789");

            funcionario.demitirFuncionario(gerente);
            fail();
        }
        catch (Exception e) {
            assertEquals("Gerente não autorizado",e.getMessage());
        }
    }
}