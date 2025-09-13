package org.example;

public class Balada {

    public static String proibicao = "idade > 17";

    public static boolean venderIngresso(double idade) {
        String expressao;
        expressao = proibicao.replace("idade", Double.toString(idade));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesLogicas(expressao);
        return interpretador.interpretar();
    }
}
