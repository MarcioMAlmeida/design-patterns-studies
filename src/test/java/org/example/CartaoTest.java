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

        assertEquals("Cartao{conta=Conta{logradouro='Rua A', numero=1}, localNascimento='Juiz de Fora'}", cartao.toString());
        assertEquals("Cartao{conta=Conta{logradouro='Rua A', numero=2}, localNascimento='Juiz de Fora'}", cartaoClone.toString());
    }

}