# ⚙️ Padrões de Projeto Comportamentais (Behavioral Design Patterns)

Os Padrões Comportamentais focam nos **algoritmos, na comunicação e na atribuição de responsabilidades entre os objetos**. Eles são projetados para gerenciar a colaboração entre objetos de uma maneira que aumente a flexibilidade e o desacoplamento.

## A Intenção Principal

Se os padrões criacionais tratam do "nascimento" dos objetos e os estruturais de sua "anatomia", os comportamentais tratam de sua "socialização". Eles definem como os objetos interagem e distribuem tarefas para realizar um objetivo que seria difícil ou impossível para um único objeto alcançar sozinho.

Esses padrões ajudam a definir fluxos de comunicação claros, reduzir a dependência direta entre objetos e encapsular comportamentos que podem variar.

## Problemas que Eles Resolvem:

* **Desacoplar comunicação:** Reduzir a dependência entre quem envia uma solicitação e quem a recebe.
* **Gerenciar algoritmos:** Encapsular diferentes algoritmos e torná-los intercambiáveis durante a execução.
* **Controlar o estado:** Permitir que um objeto mude seu comportamento com base em seu estado interno.
* **Definir fluxos de comunicação:** Centralizar ou encadear a comunicação para simplificar as interações.
* **Implementar notificações:** Permitir que múltiplos objetos sejam notificados sobre mudanças em um objeto de interesse.
* **Percorrer coleções:** Fornecer uma forma padrão de atravessar os elementos de uma coleção sem expor sua estrutura interna.
* **Encapsular operações:** Transformar uma solicitação em um objeto independente.

## Padrões Nesta Categoria:

Abaixo estão os padrões comportamentais implementados neste diretório, cada um abordando um padrão de comunicação ou atribuição de responsabilidade.

* **[Chain of Responsibility](./ChainOfResponsabilityExemplo/):** Passa uma solicitação ao longo de uma cadeia de manipuladores, permitindo que múltiplos objetos tratem a requisição.
* **[Command](./CommandExemplo/):** Encapsula uma solicitação como um objeto, permitindo parametrizar, enfileirar e registrar operações.
* **[Interpreter](./InterpreterExemplo/):** Define uma representação gramatical para uma linguagem e um interpretador para avaliar sentenças.
* **[Iterator](./IteratorExemplo/):** Fornece uma maneira de acessar os elementos de uma coleção sequencialmente, sem expor sua estrutura.
* **[Mediator](./MediatorExemplo/):** Reduz o acoplamento ao centralizar a comunicação complexa entre diferentes objetos em um único mediador.
* **[Memento](./MementoExemplo/):** Captura e restaura o estado interno de um objeto sem violar seu encapsulamento.
* **[Observer](./ObserverExemplo/):** Cria um mecanismo de assinatura onde múltiplos objetos (observadores) são notificados sobre mudanças em um objeto que estão observando.
* **[State](./StateExemplo/):** Permite que um objeto altere seu comportamento quando seu estado interno muda.
* **[Strategy](./StrategyExemplo/):** Define uma família de algoritmos, encapsula cada um e os torna intercambiáveis, permitindo que o algoritmo varie independentemente dos clientes.
* **[Template Method](./TemplateMethodExemplo/):** Define o esqueleto de um algoritmo em uma superclasse, mas deixa as subclasses redefinirem etapas específicas sem alterar a estrutura do algoritmo.
* **[Visitor](./VisitorExemplo/):** Permite adicionar novas operações a uma estrutura de objetos sem modificar as classes desses objetos.
