package org.example;

public class FactoryBlack implements AbstractFactory {

    @Override
    public  Fatura createFatura(){
        return new FaturaCartaoBlack();
    }
}
