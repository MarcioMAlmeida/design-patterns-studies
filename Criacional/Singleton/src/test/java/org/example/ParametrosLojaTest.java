package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosLojaTest {

    @Test
    public void deveRetornarNomeLoja() {
        ParametrosLoja.getInstance().setNomeLoja("Loja 1");
        assertEquals("Loja 1", ParametrosLoja.getInstance().getNomeLoja());
    }

    @Test
    public void deveRetornarRazaoSocial() {
        ParametrosLoja.getInstance().setRazaoSocial("Loja 1 LTDA");
        assertEquals("Loja 1 LTDA", ParametrosLoja.getInstance().getRazaoSocial());
    }

    @Test
    public void deveRetornarCnpj() {
        ParametrosLoja.getInstance().setCnpj("09.123.456/0001-00");
        assertEquals("09.123.456/0001-00", ParametrosLoja.getInstance().getCnpj());
    }

}