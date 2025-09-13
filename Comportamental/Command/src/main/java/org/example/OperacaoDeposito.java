package org.example;

public class OperacaoDeposito implements Operacao {

    private Conta conta;

    public OperacaoDeposito(Conta conta) {
        this.conta = conta;
    }

    public void executar(Double valor) {
        this.conta.depositar(valor);
    }

    public void cancelar(Double valor) {
        this.conta.sacar(valor);
    }
}
