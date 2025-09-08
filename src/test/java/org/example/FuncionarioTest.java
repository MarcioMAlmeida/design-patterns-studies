package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    void setUp() {
        funcionario = new Funcionario();
    }

    ////////Funcionario Trabalhando

    @Test
    public void deveTirarFeriasTrabalhando() {
        funcionario.setEstado(FuncionarioEstadoTrabalhando.getInstance());
        assertTrue(funcionario.tirarFerias());
        assertEquals(FuncionarioEstadoFerias.getInstance(), funcionario.getEstado());
    }

    @Test
    public void devePedirDemissaoTrabalhando() {
        funcionario.setEstado(FuncionarioEstadoTrabalhando.getInstance());
        assertTrue(funcionario.pedirDemissao());
        assertEquals(FuncionarioEstadoDemitido.getInstance(), funcionario.getEstado());
    }

    @Test
    public void deveEntregarAtestadoTrabalhando() {
        funcionario.setEstado(FuncionarioEstadoTrabalhando.getInstance());
        assertTrue(funcionario.entregarAtestado());
        assertEquals(FuncionarioEstadoAtestado.getInstance(), funcionario.getEstado());
    }

    @Test
    public void devePedirLisencaTrabalhando() {
        funcionario.setEstado(FuncionarioEstadoTrabalhando.getInstance());
        assertTrue(funcionario.pedirLisenca());
        assertEquals(FuncionarioEstadoLisenca.getInstance(), funcionario.getEstado());
    }

    ////////////////////Funcionario Estado Ferias

    @Test
    public void deveTrabalharDeFerias() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertTrue(funcionario.trabalhar());
        assertEquals(FuncionarioEstadoTrabalhando.getInstance(), funcionario.getEstado());
    }

    @Test
    public void naoDevePedirDemissaoDeFerias() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertFalse(funcionario.pedirDemissao());
    }

    @Test
    public void naoDeveEntregarAtestadoDeFerias() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertFalse(funcionario.entregarAtestado());
    }

    @Test
    public void naoDevePedirLisencaDeFerias() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertFalse(funcionario.pedirLisenca());
    }

    ////////////////////Funcionario Estado Atestado

    @Test
    public void deveTrabalharDeAtestado() {
        funcionario.setEstado(FuncionarioEstadoAtestado.getInstance());
        assertTrue(funcionario.trabalhar());
        assertEquals(FuncionarioEstadoTrabalhando.getInstance(), funcionario.getEstado());
    }

    @Test
    public void naoDevePedirDemissaoDeAtestado() {
        funcionario.setEstado(FuncionarioEstadoAtestado.getInstance());
        assertFalse(funcionario.pedirDemissao());
    }

    @Test
    public void naoDevePedirFeriasDeAtestado() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertFalse(funcionario.tirarFerias());
    }

    @Test
    public void naoDevePedirLisencaDeAtestado() {
        funcionario.setEstado(FuncionarioEstadoAtestado.getInstance());
        assertFalse(funcionario.pedirLisenca());
    }

    ////////////////////Funcionario Estado Lisenca

    @Test
    public void deveTrabalharDeLisenca() {
        funcionario.setEstado(FuncionarioEstadoLisenca.getInstance());
        assertTrue(funcionario.trabalhar());
        assertEquals(FuncionarioEstadoTrabalhando.getInstance(), funcionario.getEstado());
    }

    @Test
    public void naoDevePedirDemissaoDeLisenca() {
        funcionario.setEstado(FuncionarioEstadoLisenca.getInstance());
        assertFalse(funcionario.pedirDemissao());
    }

    @Test
    public void naoDeveEntregarAtestadoDeLisenca() {
        funcionario.setEstado(FuncionarioEstadoLisenca.getInstance());
        assertFalse(funcionario.entregarAtestado());
    }

    @Test
    public void naoDeveTirarFeriasDeLisenca() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertFalse(funcionario.tirarFerias());
    }

    ////////////////////Funcionario Estado Demitido

    @Test
    public void naoDeveTrabalharDemitido() {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertFalse(funcionario.trabalhar());
    }

    @Test
    public void naoDeveTirarFeriasDemitido() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertFalse(funcionario.tirarFerias());
    }

    @Test
    public void naoDeveEntregarAtestadoDemitido() {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertFalse(funcionario.entregarAtestado());
    }

    @Test
    public void naoDevePedirLisencaDemitido() {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertFalse(funcionario.pedirLisenca());
    }
}