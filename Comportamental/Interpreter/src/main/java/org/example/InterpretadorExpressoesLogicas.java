package org.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class InterpretadorExpressoesLogicas implements InterpretadorExpressao {

    private InterpretadorExpressao interpretadorInicial;

    public InterpretadorExpressoesLogicas(String contexto) {

        Stack<InterpretadorExpressao> pilhaInterpretadores = new Stack<>();
        List<String> elementos = Arrays.asList(contexto.split(" "));
        Iterator<String> iterator = elementos.iterator();

        while (iterator.hasNext()) {
            String elemento = iterator.next();
            if (elemento.matches("\\d+(\\.\\d*)?")) {
                pilhaInterpretadores.push(new Numero(Double.parseDouble(elemento)));
            } else if (elemento.equals(">")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Expressão inválida");
                Numero elementoEsquerda = (Numero) pilhaInterpretadores.pop();
                Numero elementoDireita = new Numero(Double.parseDouble(iterator.next()));
                pilhaInterpretadores.push(new CondicaoMaiorQue(elementoEsquerda, elementoDireita));
            } else if (elemento.equals("<")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Expressão inválida");
                Numero elementoEsquerda = (Numero) pilhaInterpretadores.pop();
                Numero elementoDireita = new Numero(Double.parseDouble(iterator.next()));
                pilhaInterpretadores.push(new CondicaoMenorQue(elementoEsquerda, elementoDireita));
            } else if (elemento.equals("=")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Expressão inválida");
                Numero elementoEsquerda = (Numero) pilhaInterpretadores.pop();
                Numero elementoDireita = new Numero(Double.parseDouble(iterator.next()));
                pilhaInterpretadores.push(new CondicaoIgual(elementoEsquerda, elementoDireita));
            } else {
                throw new IllegalArgumentException("Expressão com elemento inválido");
            }
        }
        interpretadorInicial = pilhaInterpretadores.pop();
    }

    public boolean interpretar() {
        return interpretadorInicial.interpretar();
    }
}
