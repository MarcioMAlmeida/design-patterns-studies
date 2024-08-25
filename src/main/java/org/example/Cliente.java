package org.example;

public class Cliente implements Pessoa {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCliente(this);
    }
}
