package org.example;

public class Gerente implements Pessoa {

    private String nome;
    private String setor;
    private Double salario;

    public Gerente(String nome, String setor, Double salario) {
        this.nome = nome;
        this.setor = setor;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return setor;
    }

    public void setCargo(String setor) {
        this.setor = setor;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirGerente(this);
    }
}
