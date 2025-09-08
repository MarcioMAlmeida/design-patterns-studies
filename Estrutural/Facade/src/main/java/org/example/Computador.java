package org.example;

public class Computador {

    public boolean montarComputador() {

        return ComputadorFacade.verificarComponentes(this);
    }
}
