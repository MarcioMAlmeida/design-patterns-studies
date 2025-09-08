package org.example;

public class Paciente {

    private String nome;
    private boolean emTratamento;

    public Paciente(String nome, boolean emTratamento) {
        this.nome = nome;
        this.emTratamento = emTratamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEmTratamento() {
        return emTratamento;
    }

    public void setEmTratamento(boolean emTratamento) {
        this.emTratamento = emTratamento;
    }
}
