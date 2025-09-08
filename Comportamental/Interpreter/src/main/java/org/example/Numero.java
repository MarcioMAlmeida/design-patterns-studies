package org.example;

public class Numero implements InterpretadorExpressao {

    private double numero;

    public Numero(double numero) {
        this.numero = numero;
    }

    public boolean interpretar() {
        return true;
    }

    public double getNumero() {
        return this.numero;
    }
}
