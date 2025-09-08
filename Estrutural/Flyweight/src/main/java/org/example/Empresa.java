package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public void contratarFuncionario(String nome, String nomeCargo) {
        Cargo cargo = CargoFactory.getCargo(nomeCargo);
        Funcionario funcionario = new Funcionario(nome, cargo);
        funcionarios.add(funcionario);
    }

    public List<String> getFuncionarios() {
        List<String> saida = new ArrayList<String>();
        for (Funcionario funcionario : this.funcionarios) {
            saida.add(funcionario.obterFuncionario());
        }
        return saida;
    }
}
