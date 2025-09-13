package org.example;

public class FuncionarioEstadoDemitido implements FuncionarioEstado {

    public FuncionarioEstadoDemitido() {}
    private static FuncionarioEstadoDemitido instance = new FuncionarioEstadoDemitido();
    public static FuncionarioEstadoDemitido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Demitido";
    }
}
