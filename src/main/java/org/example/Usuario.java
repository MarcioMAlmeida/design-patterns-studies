package org.example;

import java.util.Observable;
import java.util.Observer;

public class Usuario implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void abrirConta(App app) {
        app.addObserver(this);
    }

    public void update(Observable app, Object arg1) {
        this.ultimaNotificacao = app.toString() +": "+ this.nome + " seu aplicativo tem uma atualização disponivel.";
    }
}
