package org.example;

public class OperacaoSaque implements Operacao {

    private Conta conta;

    public OperacaoSaque(Conta conta) {
        this.conta = conta;
    }

    public void executar(Double valor) {
        this.conta.sacar(valor);
    }

    @Override
    public void cancelar(Double valor) {
        this.conta.depositar(valor);
    }
}
