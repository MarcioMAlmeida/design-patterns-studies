package org.example;

import java.util.Date;

public class Cartao implements Cloneable {

    private Conta conta;
    private String numeroCartao;
    private String dataValidade;
    private int codigoSeguranca;
    private String nomeCartao;

    public Cartao(Conta conta, String numeroCartao, String dataValidade, int codigoSeguranca, String nomeCartao) {
        this.conta = conta;
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
        this.nomeCartao = nomeCartao;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(int codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    @Override
    public Cartao clone() throws CloneNotSupportedException {
        Cartao cartaoClone = (Cartao) super.clone();
        cartaoClone.conta = (Conta) cartaoClone.conta.clone();
        return cartaoClone;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "conta=" + conta + '\'' +
                ", numero='" + numeroCartao + '\'' +
                ", dataValidade=" + dataValidade + '\'' +
                ", codigoSeguranca=" + codigoSeguranca + '\'' +
                ", nomeCartao='" + nomeCartao +
                '}';
    }
}
