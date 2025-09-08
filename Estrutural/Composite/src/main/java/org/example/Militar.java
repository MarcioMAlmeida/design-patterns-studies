package org.example;

public abstract class Militar {

    private String nome;

    public Militar(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public  abstract String getMilitar();
}

