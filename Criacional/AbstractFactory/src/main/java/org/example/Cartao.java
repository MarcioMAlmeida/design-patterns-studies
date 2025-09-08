package org.example;

public class Cartao {

    private Fatura fatura;

    public Cartao (AbstractFactory factory) {
        this.fatura = factory.createFatura();
    }

    public String emitirFatura() {
        return this.fatura.emitirFatura();
    }
}
