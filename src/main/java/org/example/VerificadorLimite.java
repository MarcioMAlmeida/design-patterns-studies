package org.example;

public class VerificadorLimite extends Verificador {

    public VerificadorLimite(Verificador verificadorSeguinte) {
        listaTransacoes.add(TipoTransacaoParcelada.getTipoTransacaoParcelada());
        setVerificadorSeguinte(verificadorSeguinte);
    }

    public String getDescricao() {
        return "Verificador de Limite";
    }
}
