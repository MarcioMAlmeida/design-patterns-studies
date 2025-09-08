package org.example;

public class CartaoCredito extends ContaDecorator {

    public CartaoCredito(Conta conta){
        super(conta);
    }
    public float getLimiteCredito() {
        return 1000.0f;
    }

    public String getNomeEstrutura() {
        return "CartaoCrédito";
    }
}
