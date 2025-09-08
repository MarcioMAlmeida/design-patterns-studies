package org.example;

public class Cliente {

    private double idade;

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public boolean comprarIngresso() {
        return Balada.venderIngresso(this.idade);
    }
}
