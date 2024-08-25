package org.example;

public class CondicaoIgual implements InterpretadorExpressao {

    private double x;
    private double y;

    public CondicaoIgual(Numero numero, Numero numero1) {
        x = numero.getNumero();
        y = numero1.getNumero();
    }

    public boolean interpretar() {
        return x == y;
    }
}
