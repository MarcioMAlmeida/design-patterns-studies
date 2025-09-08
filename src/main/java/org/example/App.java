package org.example;

import java.util.Observable;

public class App extends Observable {

    private String nome;

    public App(String nome) {
        this.nome = nome;
    }

    public void avisarAtualizacao() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return nome;
    }
}
