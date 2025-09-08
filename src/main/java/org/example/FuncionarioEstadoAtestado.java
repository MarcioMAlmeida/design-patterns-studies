package org.example;

public class FuncionarioEstadoAtestado extends FuncionarioEstado {

    private FuncionarioEstadoAtestado() {};
    private static FuncionarioEstadoAtestado instance = new FuncionarioEstadoAtestado();
    public static FuncionarioEstadoAtestado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Atestado";
    }

    public boolean trabalhar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoTrabalhando.getInstance());
        return true;
    }
}
