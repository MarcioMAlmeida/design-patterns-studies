package org.example;

public class TipoTransacaoAVista implements TipoTransacao {

    private static TipoTransacaoAVista tipoTransacaoAVista = new TipoTransacaoAVista();

    private TipoTransacaoAVista() {};

    public static TipoTransacaoAVista getTipoTransacaoAVista() {
        return tipoTransacaoAVista;
    }
}
