package org.example;

public class Armazenamento extends Componente {

    private static Armazenamento armazenamento = new Armazenamento();

    private Armazenamento() {};

    public static Armazenamento getInstancia() {
        return armazenamento;
    }
}
