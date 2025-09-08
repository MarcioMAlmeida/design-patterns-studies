package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadorTest {

    @Test
    void deveRetornarPendenciaGabineteFormatura() {
        Computador computador = new Computador();
        Gabinete.getInstancia().addComponenteFaltando(computador);

        assertEquals(false, computador.montarComputador());
    }

    @Test
    void deveRetornarPendenciaProcessadorFormatura() {
        Computador computador = new Computador();
        Processador.getInstancia().addComponenteFaltando(computador);

        assertEquals(false, computador.montarComputador());
    }

    @Test
    void deveRetornarPendenciaPlacaMaeFormatura() {
        Computador computador = new Computador();
        PlacaMae.getInstancia().addComponenteFaltando(computador);

        assertEquals(false, computador.montarComputador());
    }

    @Test
    void deveRetornarPendenciaPlacaVideoFormatura() {
        Computador computador = new Computador();
        PlacaVideo.getInstancia().addComponenteFaltando(computador);

        assertEquals(false, computador.montarComputador());
    }

    @Test
    void deveRetornarPendenciaFonteFormatura() {
        Computador computador = new Computador();
        Fonte.getInstancia().addComponenteFaltando(computador);

        assertEquals(false, computador.montarComputador());
    }

    @Test
    void deveRetornarPendenciaArmazenamentoFormatura() {
        Computador computador = new Computador();
        Armazenamento.getInstancia().addComponenteFaltando(computador);

        assertEquals(false, computador.montarComputador());
    }

    @Test
    void deveRetornarPendenciaMemoriaFormatura() {
        Computador computador = new Computador();
        Memoria.getInstancia().addComponenteFaltando(computador);

        assertEquals(false, computador.montarComputador());
    }

    @Test
    void deveRetornarComputadorSemPendenciaFormatura() {
        Computador computador = new Computador();

        assertEquals(true, computador.montarComputador());
    }

}