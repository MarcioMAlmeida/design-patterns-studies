# Padrão de Projeto: Bridge

## Intenção

O Bridge é um padrão estrutural que **desacopla uma abstração de sua implementação**, permitindo que ambas possam evoluir de forma independente.

## Problema

Considere uma hierarquia de classes que precisa ser estendida em duas dimensões independentes. Por exemplo, você tem classes de `Forma` (`Circulo`, `Quadrado`) e precisa que elas funcionem com diferentes APIs de desenho (`API_V1`, `API_V2`). Criar uma classe para cada combinação (`Circulo_API_V1`, `Quadrado_API_V2`, etc.) levaria a uma "explosão de classes" e a um código muito rígido e difícil de manter.

## Solução

O padrão Bridge sugere dividir essa hierarquia monolítica em duas separadas:
1.  **Abstração:** A hierarquia das `Formas`, que lida com a lógica de alto nível.
2.  **Implementação:** Uma interface para as `APIs de Desenho` e suas classes concretas.

A classe base `Forma` conterá uma referência a um objeto da interface de `API de Desenho`. Quando um método como `desenhar()` for chamado em uma `Forma`, ela delegará o trabalho de baixo nível (desenhar pixels, linhas, etc.) para o objeto de implementação que ela contém. Isso permite que você adicione novas formas sem tocar no código das APIs, e vice-versa.

## Quando Usar

* Quando você quer evitar um vínculo permanente entre uma abstração e sua implementação, especialmente se a implementação precisa ser selecionada ou trocada em tempo de execução.
* Quando tanto as abstrações quanto suas implementações podem ser estendidas por subclasses de forma independente.
* Para esconder detalhes de implementação do código cliente, melhorando o encapsulamento.

---
### Diagrama de Classe UML

![image](https://github.com/MarcioMAlmeida/BridgeExemplo/assets/78739307/711ecb9a-bf73-42ce-b09d-e44c5083c733)
