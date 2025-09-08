package org.example;

public class PixCredito extends ContaDecorator {

    public PixCredito(Conta conta) {
        super(conta);
    }

    public float getLimiteCredito() {
        return 1000.0f;
    }

    public String getNomeEstrutura() {
        return "PixCrédito";
    }
}
