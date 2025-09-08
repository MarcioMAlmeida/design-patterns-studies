package org.example;

public class CartaoBlack extends Cartao {

    public Double calcularPontos() {
        return this.gastos * 3;
    }
}
