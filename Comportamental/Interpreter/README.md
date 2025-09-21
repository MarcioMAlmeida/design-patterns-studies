# Padrão de Projeto: Interpreter

## Intenção

O Interpreter é um padrão comportamental que, dada uma linguagem, **define uma representação para sua gramática junto com um interpretador** que usa essa representação para avaliar sentenças na linguagem.

## Problema

Imagine que você precisa processar uma "mini-linguagem", como uma string de busca (`"usuários ATIVOS e (de SAO_PAULO ou do RIO_DE_JANEIRO)"`) ou uma fórmula matemática. Analisar essa string e executar a lógica correspondente usando uma série de condicionais e laços pode resultar em um código muito complexo, frágil e difícil de estender com novas regras.

## Solução

O padrão Interpreter propõe modelar a gramática da linguagem usando classes. Você cria uma interface `Expressao` e classes concretas para cada "símbolo" da gramática. As expressões podem ser combinadas para formar uma estrutura de árvore (Árvore de Sintaxe Abstrata). Cada classe de expressão sabe como se "interpretar". O cliente constrói essa árvore a partir da string de entrada e então chama o método `interpretar()` no nó raiz da árvore para obter o resultado final.

## Quando Usar

* Quando você tem uma linguagem simples que pode ser representada como uma árvore de sintaxe.
* Para analisar e avaliar expressões, como em linguagens de consulta, scripts de configuração ou protocolos.
* Quando a gramática da linguagem é relativamente estável e não excessivamente complexa.

---
### Diagrama de Classe UML

![image](https://github.com/user-attachments/assets/1940dfa6-b912-4314-bf41-f1356fdbaf6a)

