package org.example;

public class Soldado extends Militar {

    public Soldado(String nome) {
        super(nome);
    }

    @Override
    public String getMilitar() {
        return "Soldado: "+this.getNome() + "\n";
    }

}
