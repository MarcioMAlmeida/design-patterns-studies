# Padrão de Projeto: Abstract Factory

## Intenção

O Abstract Factory é um padrão criacional que **fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas**. É como uma "fábrica de fábricas".

## Problema

Considere uma aplicação que cria móveis. Você tem vários tipos de móveis (Cadeira, Sofá, Mesa) que precisam combinar entre si em diferentes estilos (Vitoriano, Moderno, Art Déco). Se o seu código misturar a lógica de negócio com as chamadas diretas aos construtores (`new CadeiraVitoriana()`, `new SofaVitoriano()`), você terá um grande problema quando precisar adicionar um novo estilo, como "Rústico". Seu código ficará cheio de condicionais (`if/else`) para decidir qual variante de objeto criar, tornando-o difícil de manter.

## Solução

O padrão Abstract Factory sugere a criação de uma interface (`FabricaDeMoveis`) que declara métodos para criar cada produto da família (ex: `criarCadeira()`, `criarSofa()`). Em seguida, você cria classes de fábrica concretas que implementam essa interface para cada variante (`FabricaVitoriana`, `FabricaModerna`).

O código cliente não instancia os produtos diretamente. Ele obtém uma instância da fábrica apropriada para o estilo que deseja e, a partir dela, solicita a criação dos móveis. O cliente não sabe qual tipo concreto de móvel está recebendo, apenas que ele pertence à família correta e é compatível com os outros produtos da mesma fábrica.

## Quando Usar

* Quando seu sistema precisa ser independente de como seus produtos são criados, compostos e representados.
* Quando você precisa trabalhar com **famílias de objetos relacionados** e garantir que os produtos criados sejam sempre compatíveis entre si.
* Quando você quer fornecer uma biblioteca de classes e quer expor apenas suas interfaces, não suas implementações.

---
### Diagrama de Classe UML
