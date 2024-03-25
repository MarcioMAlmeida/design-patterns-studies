package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoSaqueTest {

    @Test
    void deveExecutarSaque() {
        IServico servico = ServicoFactory.obterServico("Saque");
        assertEquals("Saque realizado com sucesso!", servico.executar());
    }
}