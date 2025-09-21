# Padrão de Projeto: Iterator

## Intenção

O Iterator é um padrão comportamental que **fornece uma maneira de acessar os elementos de uma coleção sequencialmente, sem expor sua representação interna**.

## Problema

Uma coleção, como uma Lista, uma Árvore ou um Grafo, precisa oferecer uma forma para que o código cliente possa percorrer seus elementos. A solução mais simples seria expor a estrutura interna da coleção (ex: o array de uma lista), mas isso viola o princípio do encapsulamento e acopla o cliente à implementação específica. Se a implementação da coleção mudar (de um `ArrayList` para um `LinkedList`), todo o código cliente que a percorre quebraria.

## Solução

O padrão Iterator extrai o comportamento de travessia da coleção para um objeto separado, o "Iterador". O iterador encapsula toda a lógica de como percorrer a coleção (manter o controle da posição atual, saber como obter o próximo elemento, etc.). Ele fornece uma interface simples e comum (ex: `proximo()`, `temProximo()`) para o cliente. A coleção original tem um método de fábrica para criar um novo iterador. Assim, o cliente pode percorrer qualquer coleção da mesma forma, independentemente de sua estrutura interna.

## Quando Usar

* Para esconder a complexidade da estrutura interna de uma coleção, desacoplando o cliente da implementação.
* Para fornecer uma interface única e padronizada para percorrer diferentes tipos de coleções.
* Para permitir que múltiplas travessias ocorram simultaneamente na mesma coleção (cada uma com seu próprio iterador).

---
### Diagrama de Classe UML

![image](https://github.com/user-attachments/assets/865bf42c-5995-4206-b609-ed831730e385)
