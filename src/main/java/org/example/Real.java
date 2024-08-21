package org.example;

public class Real implements IMoeda {

    private float valor;

    @Override
    public float getValor() {
        return this.valor;
    }

    @Override
    public void setValor(float valor) {
        this.valor = valor;
    }
}
