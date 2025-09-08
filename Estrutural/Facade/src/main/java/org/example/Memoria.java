package org.example;

public class Memoria extends Componente {

    private static Memoria memoria = new Memoria();

    private Memoria() {};

    public static Memoria getInstancia() {
        return memoria;
    }
}
