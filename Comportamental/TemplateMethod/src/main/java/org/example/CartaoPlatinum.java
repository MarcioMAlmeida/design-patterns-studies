package org.example;

public class CartaoPlatinum extends Cartao {

    public Double calcularPontos() {
        return this.gastos * 2;
    }
}
