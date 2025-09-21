# Padrão de Projeto: Builder

## Intenção

O Builder é um padrão criacional que **separa a construção de um objeto complexo de sua representação final**, de modo que o mesmo processo de construção possa criar diferentes representações.

## Problema

Imagine um objeto que exige muitos parâmetros em seu construtor, alguns obrigatórios e muitos opcionais (ex: `new Casa(paredes, teto, piscina, jardim, garagem, tipoDeTinta)`). Um construtor com uma longa lista de parâmetros é confuso e propenso a erros, pois é fácil trocar a ordem dos argumentos. Outra abordagem, a de criar múltiplos construtores, pode levar a uma explosão de combinações.

Além disso, a construção do objeto pode exigir uma sequência específica de passos, e o construtor sozinho não garante essa ordem.

## Solução

O padrão Builder extrai a lógica de construção do objeto para uma classe separada, chamada de `Builder`. Este `Builder` possui uma série de métodos para configurar as diferentes partes do objeto (ex: `construirParedes()`, `construirPiscina()`). No final, um método `build()` é chamado para retornar o objeto final, já montado.

O processo é geralmente gerenciado por uma classe "Diretora" (Director), que conhece a sequência de passos de construção, mas não os detalhes de implementação. Isso permite que você use o mesmo processo de construção (o mesmo Diretor) para criar diferentes representações do objeto, apenas trocando a instância do `Builder`.

## Quando Usar

* Para evitar "construtores telescópicos" (múltiplos construtores com diferentes listas de parâmetros).
* Quando você precisa criar um objeto complexo que exige uma construção passo a passo ou uma ordem específica.
* Quando você quer que o mesmo processo de construção possa produzir diferentes representações do objeto.
* Para isolar a lógica de construção complexa da lógica de negócio do objeto.

---
### Diagrama de Classe UML

![image](https://github.com/MarcioMAlmeida/BuilderExemplo/assets/78739307/0b8f3c8b-d3b4-431b-a4ce-e359719a389c)
