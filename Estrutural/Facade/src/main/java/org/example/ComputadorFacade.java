package org.example;

public class ComputadorFacade {

    public static boolean verificarComponentes(Computador computador) {
        if (Gabinete.getInstancia().verificarComputadorIncompleto(computador)) {
            return false;
        }
        if (Processador.getInstancia().verificarComputadorIncompleto(computador)) {
            return false;
        }
        if (PlacaMae.getInstancia().verificarComputadorIncompleto(computador)) {
            return false;
        }
        if (PlacaVideo.getInstancia().verificarComputadorIncompleto(computador)) {
            return false;
        }
        if (Fonte.getInstancia().verificarComputadorIncompleto(computador)) {
            return false;
        }
        if (Armazenamento.getInstancia().verificarComputadorIncompleto(computador)) {
            return false;
        }
        if (Memoria.getInstancia().verificarComputadorIncompleto(computador)) {
            return false;
        }
        return true;
    }
}
