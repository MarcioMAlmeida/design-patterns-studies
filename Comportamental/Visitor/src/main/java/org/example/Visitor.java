package org.example;

public interface Visitor {

    String exibirCliente(Cliente cliente);
    String exibirFuncionario(Funcionario funcionario);
    String exibirGerente(Gerente gerente);
}
