package org.example;

public class FuncionarioEstadoFerias implements FuncionarioEstado {

    public FuncionarioEstadoFerias() {}
    private static FuncionarioEstadoFerias instance = new FuncionarioEstadoFerias();
    public static FuncionarioEstadoFerias getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Ferias";
    }
}
