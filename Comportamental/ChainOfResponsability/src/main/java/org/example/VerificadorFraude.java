package org.example;

public class VerificadorFraude extends Verificador {

    public VerificadorFraude(Verificador verificadorSeguinte) {
        listaTransacoes.add(TipoTransacaoExtrato.getTipoTransacaoExtrato());
        setVerificadorSeguinte(verificadorSeguinte);
    }

    public String getDescricao() {
        return "Verificador de Fraude";
    }
}
