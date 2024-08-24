package org.example;

public class FuncionarioEstadoLisenca extends FuncionarioEstado  {

    private FuncionarioEstadoLisenca() {};
    private static FuncionarioEstadoLisenca instance = new FuncionarioEstadoLisenca();
    public static FuncionarioEstadoLisenca getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Lisenca";
    }

    public boolean trabalhar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoTrabalhando.getInstance());
        return true;
    }
}
