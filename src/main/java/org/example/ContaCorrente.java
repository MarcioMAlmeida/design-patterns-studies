package org.example;

public class ContaCorrente implements Conta {

    public float limiteTotalCredito;

    public ContaCorrente() {
    }

    public ContaCorrente(float limiteTotalCredito) {
        this.limiteTotalCredito = limiteTotalCredito;
    }

    public float getLimiteTotalCredito() {
        return limiteTotalCredito;
    }

    public String getEstrutura() {
        return "ContaCorrente";
    }
}
