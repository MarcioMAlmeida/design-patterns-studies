package org.example;

public class FaturaCartaoBlack implements Fatura {

    @Override
    public String emitirFatura() {
        return "Fatura Cartão Black";
    }
}
