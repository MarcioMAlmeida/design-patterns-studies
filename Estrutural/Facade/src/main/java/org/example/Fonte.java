package org.example;

public class Fonte extends Componente {

    private static Fonte fonte = new Fonte();

    private Fonte() {};

    public static Fonte getInstancia() {
        return fonte;
    }
}
