package org.example;

import java.util.ArrayList;
import java.util.List;

public class Capitao extends Militar {

    public List<Militar> subordinados;

    public Capitao(String nome) {
        super(nome);
        this.subordinados = new ArrayList<Militar>();
    }

    public void addMilitar(Militar militar) {
        this.subordinados.add(militar);
    }

    public String getMilitar() {
        String descricao = "";
        descricao = "Capitão: " + this.getNome() + "\n";
        for (Militar militar : this.subordinados) {
            descricao += militar.getMilitar();
        }
        return descricao;
    }
}
