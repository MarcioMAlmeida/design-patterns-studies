package org.example;

public abstract class FuncionarioEstado {

    public abstract String getEstado();

    public boolean trabalhar(Funcionario funcionario) {
        return false;
    }

    public boolean candidatar(Funcionario funcionario) {
        return false;
    }

    public boolean tirarFerias(Funcionario funcionario) {
        return false;
    }

    public boolean pedirDemissao(Funcionario funcionario) {
        return false;
    }

    public boolean entregarAtestado(Funcionario funcionario) {
        return false;
    }

    public boolean pedirLisenca(Funcionario funcionario) {
        return false;
    }
}
