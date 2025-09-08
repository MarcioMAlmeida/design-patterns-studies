package org.example;

public class FuncionarioEstadoLisenca implements FuncionarioEstado {

    public FuncionarioEstadoLisenca() {}
    private static FuncionarioEstadoLisenca instance = new FuncionarioEstadoLisenca();
    public static FuncionarioEstadoLisenca getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Lisença";
    }
}
