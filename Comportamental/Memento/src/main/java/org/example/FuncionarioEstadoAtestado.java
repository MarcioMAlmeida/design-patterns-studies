package org.example;

public class FuncionarioEstadoAtestado implements FuncionarioEstado {

    public FuncionarioEstadoAtestado() {}
    private static FuncionarioEstadoAtestado instance = new FuncionarioEstadoAtestado();
    public static FuncionarioEstadoAtestado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Atestado";
    }
}
