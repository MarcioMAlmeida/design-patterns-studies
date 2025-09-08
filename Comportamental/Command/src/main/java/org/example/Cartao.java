package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cartao {

    private List<Operacao> operacoes = new ArrayList<Operacao>();

    public void executarOperacao(Operacao operacao, Double valor) {
        this.operacoes.add(operacao);
        operacao.executar(valor);
    }

    public void cancelarUltimaOperacao(Double valor) {
        if(operacoes.size() != 0) {
            Operacao operacao = this.operacoes.get(operacoes.size() - 1);
            operacao.cancelar(valor);
            this.operacoes.remove(operacoes.size() - 1);
        }
    }
}
