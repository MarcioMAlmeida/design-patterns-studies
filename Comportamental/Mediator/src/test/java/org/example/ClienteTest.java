package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarAoSAC() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nO SAC respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Empresa agradece a mensagem: Ótimo atendimento",
                cliente.enviarElogio("Ótimo atendimento"));
    }

    @Test
    void deveReclamarAoSAC() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nO SAC respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Empresa vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                cliente.enviarReclamacao("Lentidão no atendimento"));
    }

    @Test
    void deveSugerirAoSAC() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nO SAC respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Empresa vai analisar a sugestão: Ampliar horário funcionamento",
                cliente.enviarSugestao("Ampliar horário funcionamento"));
    }
}