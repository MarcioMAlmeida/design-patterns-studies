package org.example;

public class Processador extends Componente {

    private static Processador processador = new Processador();

    private Processador() {};

    public static Processador getInstancia() {
        return processador;
    }
}
