package org.example;

import java.util.ArrayList;

public abstract class Verificador {

    protected ArrayList listaTransacoes = new ArrayList();
    private Verificador verificadorSeguinte;

    public Verificador getVerificadorSeguinte() {
        return verificadorSeguinte;
    }

    public void setVerificadorSeguinte(Verificador verificadorSeguinte) {
        this.verificadorSeguinte = verificadorSeguinte;
    }

    public abstract String getDescricao();

    public String verificarTransacao(Transacao documento) {
        if (listaTransacoes.contains(documento.getTipoTransacao())) {
            return getDescricao();
        }
        else {
            if (verificadorSeguinte != null) {
                return verificadorSeguinte.verificarTransacao(documento);
            }
        }
        return "Sem Verificador";
    }
}
