package org.example;

import java.util.ArrayList;
import java.util.List;

public class Conta {

    private Double saldo;

    public Conta(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double valor) {
        saldo += valor;
    }

    public void sacar(Double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }
}
