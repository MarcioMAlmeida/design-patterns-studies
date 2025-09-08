package org.example;

public class FactoryPlatinum implements AbstractFactory {

    @Override
    public  Fatura createFatura(){
        return new FaturaCartaoPlatinum();
    }
}
