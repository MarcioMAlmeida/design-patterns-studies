package org.example;

public class FuncionarioEstadoFerias extends FuncionarioEstado {

    private FuncionarioEstadoFerias() {};
    private static FuncionarioEstadoFerias instance = new FuncionarioEstadoFerias();
    public static FuncionarioEstadoFerias getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ferias";
    }

    public boolean trabalhar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoTrabalhando.getInstance());
        return true;
    }
}
