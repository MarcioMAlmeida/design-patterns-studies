package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void devePermitirComprarIngresso() {
        Cliente cliente = new Cliente();
        cliente.setIdade(18);

        assertTrue(cliente.comprarIngresso());
    }
}