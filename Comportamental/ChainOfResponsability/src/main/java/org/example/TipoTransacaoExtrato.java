package org.example;

public class TipoTransacaoExtrato implements TipoTransacao {

    private static TipoTransacaoExtrato tipoTransacaoExtrato = new TipoTransacaoExtrato();

    private TipoTransacaoExtrato() {};

    public static TipoTransacaoExtrato getTipoTransacaoExtrato() {
        return tipoTransacaoExtrato;
    }
}
