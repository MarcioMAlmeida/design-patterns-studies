package org.example;

public class FaturaCartaoPlatinum implements Fatura {

    @Override
    public String emitirFatura() {
        return "Fatura Cartão Platinum";
    }
}
