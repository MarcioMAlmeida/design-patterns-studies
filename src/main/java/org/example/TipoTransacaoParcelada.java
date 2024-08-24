package org.example;

public class TipoTransacaoParcelada implements TipoTransacao {

    private static TipoTransacaoParcelada tipoTransacaoParcelada = new TipoTransacaoParcelada();

    private TipoTransacaoParcelada() {};

    public static TipoTransacaoParcelada getTipoTransacaoParcelada() {
        return tipoTransacaoParcelada;
    }
}
