package org.example;

public class Conta {

    IMoeda saldo;
    MoedaAdapter conversor;

    public Conta() {
        saldo = new Real();
        conversor = new MoedaAdapter(saldo);
    }

    public void setSaldo(float valor) {
        saldo.setValor(valor);
        conversor.salvarSaldoDollar();
    }

    public float getSaldo() {
        return conversor.recuperarSaldoReal();
    }

    public float getValor() {
        return conversor.getValorDollar();
    }
}
