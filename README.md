# 📚 Estudos sobre Padrões de Projeto (Design Patterns) em Java

Bem-vindo a este repositório dedicado à exploração e implementação dos principais Padrões de Projeto (Design Patterns) utilizando a linguagem Java. Cada padrão foi desenvolvido como um projeto Maven individual para facilitar o estudo e a compreensão de seus conceitos e aplicabilidade.

Este projeto unifica os diversos repositórios individuais que foram originalmente criados durante a disciplina de Linguagem de Programação V. Cada sub-projeto aqui presente é autocontido e inclui não apenas a implementação de um exemplo prático do padrão, mas também seus respectivos testes unitários e um diagrama de classe que ilustra a estrutura desenvolvida.

## O que são Padrões de Projeto?

Padrões de Projeto são soluções reutilizáveis, testadas e comprovadas para problemas comuns que ocorrem no desenvolvimento de software. Eles não são um código ou algoritmo específico, mas sim um **modelo** ou **template** que descreve como estruturar classes e objetos para resolver um determinado tipo de problema de forma eficiente e flexível.

Popularizados pelo famoso livro "Design Patterns: Elements of Reusable Object-Oriented Software", escrito por Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides (conhecidos como "Gang of Four" ou GoF), os padrões são divididos em três categorias principais.

---

## As 3 Categorias de Padrões de Projeto

Os Padrões de Projeto são divididos em três categorias para organizar melhor suas finalidades e os tipos de problemas que eles resolvem. Cada categoria aborda um aspecto diferente do design de software orientado a objetos.

### 📖 1. Padrões Criacionais (Creational Patterns)

Esses padrões lidam com os mecanismos de **criação de objetos**, tentando criar objetos de uma maneira adequada a cada situação. A forma básica de criação de objetos pode resultar em problemas de design ou adicionar complexidade desnecessária ao projeto. Os padrões criacionais resolvem esse problema, controlando o processo de criação de objetos.

* **Singleton:** Garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global a ela.
* **Factory Method:** Define uma interface para criar um objeto, mas deixa as subclasses decidirem qual classe instanciar.
* **Abstract Factory:** Fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.
* **Builder:** Separa a construção de um objeto complexo de sua representação, de modo que o mesmo processo de construção possa criar diferentes representações.
* **Prototype:** Permite a criação de novos objetos através da cópia de uma instância existente (protótipo).

### 🏛️ 2. Padrões Estruturais (Structural Patterns)

Esses padrões se concentram em como classes e objetos podem ser **compostos para formar estruturas maiores e mais complexas**, mantendo essas estruturas flexíveis e eficientes. Eles explicam como montar objetos e classes em estruturas maiores, simplificando as relações entre eles.

* **Adapter:** Permite que interfaces incompatíveis trabalhem juntas.
* **Bridge:** Desacopla uma abstração de sua implementação, para que as duas possam variar independentemente.
* **Composite:** Compõe objetos em estruturas de árvore para representar hierarquias de partes e todos. Permite que os clientes tratem objetos individuais e composições de objetos de maneira uniforme.
* **Decorator:** Anexa dinamicamente responsabilidades adicionais a um objeto.
* **Facade:** Fornece uma interface unificada e simplificada para um conjunto de interfaces em um subsistema complexo.
* **Flyweight:** Reduz o custo de criação e manipulação de um grande número de objetos semelhantes, compartilhando partes do estado entre eles.
* **Proxy:** Fornece um substituto ou um marcador de lugar para outro objeto, a fim de controlar o acesso a ele.

### ⚙️ 3. Padrões Comportamentais (Behavioral Patterns)

Esses padrões estão relacionados aos **algoritmos e à atribuição de responsabilidades e comunicação entre os objetos**. Eles descrevem não apenas as estruturas de objetos ou classes, mas também os padrões em suas interações.

* **Chain of Responsibility:** Evita o acoplamento do remetente de uma solicitação ao seu receptor, dando a mais de um objeto a chance de tratar a solicitação.
* **Command:** Encapsula uma solicitação como um objeto, permitindo parametrizar clientes com diferentes solicitações, enfileirar ou registrar solicitações e suportar operações que podem ser desfeitas.
* **Interpreter:** Dado um idioma, define uma representação para sua gramática junto com um interpretador que usa a representação para interpretar sentenças no idioma.
* **Iterator:** Fornece uma maneira de acessar os elementos de um objeto agregado sequencialmente, sem expor sua representação subjacente.
* **Mediator:** Define um objeto que encapsula como um conjunto de objetos interage, promovendo o baixo acoplamento.
* **Memento:** Sem violar o encapsulamento, captura e externaliza o estado interno de um objeto para que ele possa ser restaurado posteriormente.
* **Observer:** Define uma dependência um-para-muitos entre objetos, de modo que, quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.
* **State:** Permite que um objeto altere seu comportamento quando seu estado interno muda. O objeto parecerá mudar de classe.
* **Strategy:** Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. Permite que o algoritmo varie independentemente dos clientes que o utilizam.
* **Template Method:** Define o esqueleto de um algoritmo em uma operação, adiando alguns passos para as subclasses.
* **Visitor:** Representa uma operação a ser executada nos elementos de uma estrutura de objetos. Permite definir uma nova operação sem alterar as classes dos elementos sobre os quais opera.

## 🗺️ Como Navegar no Repositório

O projeto está organizado em três diretórios principais, correspondendo às categorias de padrões:

-   `/Criacional`
-   `/Estrutural`
-   `/Comportamental`

Dentro de cada um desses diretórios, cada padrão de projeto é um subdiretório contendo um projeto Maven independente e autocontido, facilitando o isolamento e o estudo de cada conceito.
