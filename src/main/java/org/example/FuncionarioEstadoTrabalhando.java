package org.example;

public class FuncionarioEstadoTrabalhando extends FuncionarioEstado {

    private FuncionarioEstadoTrabalhando() {};
    private static FuncionarioEstadoTrabalhando instance = new FuncionarioEstadoTrabalhando();
    public static FuncionarioEstadoTrabalhando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Trabalhando";
    }

    public boolean trabalhar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoTrabalhando.getInstance());
        return true;
    }

    public boolean tirarFerias(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        return true;
    }

    public boolean pedirDemissao(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        return true;
    }

    public boolean entregarAtestado(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoAtestado.getInstance());
        return true;
    }

    public boolean pedirLisenca(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoLisenca.getInstance());
        return true;
    }
}
