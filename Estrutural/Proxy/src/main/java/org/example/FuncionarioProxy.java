package org.example;

import java.util.List;

public class FuncionarioProxy implements IFuncionario {

    private Funcionario funcionario;

    private String cpf;

    public FuncionarioProxy(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public List<String> obterDadosFuncionario() {
        if (funcionario == null) {
            funcionario = new Funcionario(cpf);
        }
        return funcionario.obterDadosFuncionario();
    }

    @Override
    public boolean demitirFuncionario(Gerente gerente){
        if(!gerente.isAdministrador()) {
            throw new IllegalArgumentException("Gerente não autorizado");
        }
        if(funcionario == null) {
            funcionario = new Funcionario(cpf);
        }
        return funcionario.demitirFuncionario(gerente);
    }
}
