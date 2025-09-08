package org.example;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private FuncionarioEstado estado;
    private List<FuncionarioEstado> memento = new ArrayList<FuncionarioEstado>();

    public FuncionarioEstado getEstado() {
        return estado;
    }

    public void setEstado(FuncionarioEstado estado) {
        this.estado = estado;
        this.memento.add(estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<FuncionarioEstado> getEstados() {
        return memento;
    }
}
