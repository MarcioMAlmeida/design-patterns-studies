package org.example;

public class FuncionarioEstadoTrabalhando implements FuncionarioEstado {

    public FuncionarioEstadoTrabalhando() {}
    private static FuncionarioEstadoTrabalhando instance = new FuncionarioEstadoTrabalhando();
    public static FuncionarioEstadoTrabalhando getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Trabalhando";
    }
}
