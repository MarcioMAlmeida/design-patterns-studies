package org.example;

public class CreditoEspecial extends ContaDecorator {

    public CreditoEspecial(Conta conta){
        super(conta);
    }
    public float getLimiteCredito() {
        return 1000.0f;
    }

    public String getNomeEstrutura() {
        return "CréditoEspecial";
    }
}
