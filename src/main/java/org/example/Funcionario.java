package org.example;

public class Funcionario {

    private String nome;
    private FuncionarioEstado estado;

    public Funcionario() {
        this.estado = FuncionarioEstadoTrabalhando.getInstance();
    }

    public void setEstado(FuncionarioEstado estado) {
        this.estado = estado;
    }

    public boolean trabalhar() {
        return estado.trabalhar(this);
    }

    public boolean tirarFerias() {
        return estado.tirarFerias(this);
    }

    public boolean pedirDemissao() {
        return estado.pedirDemissao(this);
    }

    public boolean entregarAtestado() {
        return estado.entregarAtestado(this);
    }

    public boolean pedirLisenca() {
        return estado.pedirLisenca(this);
    }

    public FuncionarioEstado getEstado() {
        return estado;
    }
}
