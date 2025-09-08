package org.example;

public class Pessoa {

    public String enviarElogio(String mensagem) {
        return Ouvidoria.getInstancia().enviarElogio(mensagem);
    }

    public String enviarReclamacao(String mensagem) {
        return Ouvidoria.getInstancia().enviarReclamacao(mensagem);
    }

    public String enviarSugestao(String mensagem) {
        return Ouvidoria.getInstancia().enviarSugestao(mensagem);
    }


}