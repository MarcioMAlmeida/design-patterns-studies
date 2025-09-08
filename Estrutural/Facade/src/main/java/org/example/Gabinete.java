package org.example;

public class Gabinete extends Componente {

    private static Gabinete gabinete = new Gabinete();

    private Gabinete() {};

    public static Gabinete getInstancia() {
        return gabinete;
    }
}
