package org.example;

public class PlacaMae extends Componente {

    private static PlacaMae placaMae = new PlacaMae();

    private PlacaMae() {};

    public static PlacaMae getInstancia() {
        return placaMae;
    }
}
