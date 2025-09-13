package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Componente {

    private List<Computador> computadoresIncompletos = new ArrayList<Computador>();

    public void addComponenteFaltando(Computador computador) {
        this.computadoresIncompletos.add(computador);
    }

    public boolean verificarComputadorIncompleto(Computador computador) {
        return this.computadoresIncompletos.contains(computador);
    }
}
