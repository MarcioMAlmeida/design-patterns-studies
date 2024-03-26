package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartaoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Cartao cartao = new Cartao(new Conta("1234", "123456-7","Marcio Martins de Almeida","123.456.789-10"), "0123-4567-8910-0000", "08/31", 123, "MARCIO M ALMEIDA");

        Cartao cartaoClone = cartao.clone();
        cartaoClone.setNumeroCartao("8910-0000-4567-0123");
        cartaoClone.setDataValidade("09/31");
        cartaoClone.setCodigoSeguranca(456);

        assertEquals("Cartao{conta='Conta{conta='1234', agencia='123456-7', portador='Marcio Martins de Almeida', documento='123.456.789-10'}', numero='0123-4567-8910-0000', dataValidade='08/31', codigoSeguranca='123', nomeCartao='MARCIO M ALMEIDA'}", cartao.toString());
        assertEquals("Cartao{conta='Conta{conta='1234', agencia='123456-7', portador='Marcio Martins de Almeida', documento='123.456.789-10'}', numero='8910-0000-4567-0123', dataValidade='09/31', codigoSeguranca='456', nomeCartao='MARCIO M ALMEIDA'}", cartaoClone.toString());
    }

}