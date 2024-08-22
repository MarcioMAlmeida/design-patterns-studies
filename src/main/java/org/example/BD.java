package org.example;

import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<String, Funcionario> funcionarios = new HashMap<>();

    public static Funcionario getFuncionario(String cpf) {
        return funcionarios.get(cpf);
    }

    public static void addFuncionario(Funcionario funcionario) {
        funcionarios.put(funcionario.getCpf(), funcionario);
    }
}
