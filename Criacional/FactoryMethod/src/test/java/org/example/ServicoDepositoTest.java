package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoDepositoTest {

    @Test
    void deveExecutarDeposito() {
        IServico servico = ServicoFactory.obterServico("Deposito");
        assertEquals("Deposito realizado com sucesso!", servico.executar());
    }
}