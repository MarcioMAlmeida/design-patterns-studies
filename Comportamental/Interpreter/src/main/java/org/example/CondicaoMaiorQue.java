package org.example;

public class CondicaoMaiorQue implements InterpretadorExpressao {

    private double x;
    private double y;

    public CondicaoMaiorQue(Numero numero, Numero numero1) {
        x = numero.getNumero();
        y = numero1.getNumero();
    }

    public boolean interpretar() {
        return x > y;
    }
}
