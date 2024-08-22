package org.example;

import java.util.List;

public interface IFuncionario {
    List<String> obterDadosFuncionario();
    boolean demitirFuncionario(Gerente gerente);
}
