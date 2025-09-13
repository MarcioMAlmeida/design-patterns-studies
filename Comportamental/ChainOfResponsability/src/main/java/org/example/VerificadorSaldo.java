package org.example;

public class VerificadorSaldo extends Verificador {

    public VerificadorSaldo(Verificador verificadorSeguinte) {
        listaTransacoes.add(TipoTransacaoAVista.getTipoTransacaoAVista());
        setVerificadorSeguinte(verificadorSeguinte);
    }

    public String getDescricao() {
        return "Verificador de Saldo";
    }
}
