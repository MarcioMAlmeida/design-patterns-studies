package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransacaoTest {

    VerificadorFraude verificadorFraude;
    VerificadorSaldo verificadorSaldo;
    VerificadorLimite verificadorLimite;

    @BeforeEach
    void setUp() {
        verificadorLimite = new VerificadorLimite(null);
        verificadorSaldo = new VerificadorSaldo(verificadorLimite);
        verificadorFraude = new VerificadorFraude(verificadorSaldo);
    }

    @Test
    void deveRetornarVerificadorFraude() {
        assertEquals("Verificador de Fraude", verificadorFraude.verificarTransacao(new Transacao(TipoTransacaoExtrato.getTipoTransacaoExtrato())));
    }

    @Test
    void deveRetornarVerificadorSaldo() {
        assertEquals("Verificador de Saldo",verificadorFraude.verificarTransacao(new Transacao(TipoTransacaoAVista.getTipoTransacaoAVista())));
    }

    @Test
    void deveRetornarVerificadorLimite() {
        assertEquals("Verificador de Limite",verificadorFraude.verificarTransacao(new Transacao(TipoTransacaoParcelada.getTipoTransacaoParcelada())));
    }
}