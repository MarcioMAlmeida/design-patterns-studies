package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarRotaMaisCurta() {
        Cliente cliente = new Cliente();
        cliente.encontrarRotaMaisCurta();
        assertEquals("Rota Mais Curta é por aqui.",cliente.getRota());
    }

    @Test
    void deveRetornarRotaMaisRapida() {
        Cliente cliente = new Cliente();
        cliente.encontrarRotaMaisRapida();
        assertEquals("Rota Mais Rapida é por aqui.",cliente.getRota());
    }

    @Test
    void deveRetornarRotaMenosPedagios() {
        Cliente cliente = new Cliente();
        cliente.encontrarRotaMenosPedagio();
        assertEquals("Rota com Menos Pedágios é por aqui.",cliente.getRota());
    }
}