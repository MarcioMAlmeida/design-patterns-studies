# Padrão de Projeto: Facade

## Intenção

O Facade é um padrão estrutural que **fornece uma interface unificada e simplificada para um conjunto de interfaces em um subsistema complexo**.

## Problema

Considere um sistema grande ou uma biblioteca com muitas classes interdependentes e uma lógica de inicialização complexa. Para realizar uma tarefa simples, como "converter um vídeo", o código cliente pode precisar instanciar e coordenar múltiplos objetos (leitor de vídeo, processador de áudio, codec, renderizador). Isso cria um alto acoplamento entre o cliente e o subsistema, tornando o código cliente difícil de ler, escrever e manter.

## Solução

O padrão Facade propõe a criação de uma nova classe, a "Fachada", que atua como um único ponto de entrada para o subsistema. A fachada esconde a complexidade interna e expõe apenas os métodos de alto nível que são realmente necessários para o cliente (ex: `converterVideo(arquivo, formato)`).

O código cliente interage apenas com a fachada. A fachada, por sua vez, se encarrega de orquestrar as chamadas para os objetos corretos dentro do subsistema na ordem certa. O cliente não precisa saber nada sobre a complexidade interna do subsistema.

## Quando Usar

* Para fornecer uma interface simples e limitada para um subsistema complexo.
* Para desacoplar o código cliente das classes internas de um subsistema, permitindo que o subsistema evolua sem impactar os clientes.
* Para organizar um sistema em camadas, usando fachadas como pontos de entrada para cada camada.

---
### Diagrama de Classe UML

![image](https://github.com/user-attachments/assets/f2c6e9eb-9a2e-47bb-ae03-8b2852ed983a)
