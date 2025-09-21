# Padrão de Projeto: Composite

## Intenção

O Composite é um padrão estrutural que **permite compor objetos em estruturas de árvore para representar hierarquias de parte-todo**, tratando objetos individuais e composições de objetos de maneira uniforme.

## Problema

Suponha que você esteja modelando uma hierarquia, como um sistema de arquivos (pastas e arquivos) ou uma interface gráfica (painéis e botões). Frequentemente, você precisa executar a mesma operação em um objeto simples (um "nó folha", como um arquivo) e em um objeto complexo que contém outros (um "container", como uma pasta). O código cliente geralmente acaba com condicionais (`if/else`) para diferenciar os dois tipos, tornando-o mais complexo.

## Solução

O padrão Composite sugere a criação de uma interface ou classe abstrata comum (o "Componente") que é implementada tanto pelos objetos simples ("Folha") quanto pelos objetos compostos ("Container"). Essa interface declara as operações que são comuns a todos.

O "Container" mantém uma lista de "Componentes" filhos. Quando uma operação é chamada no Container, ele geralmente delega essa chamada para cada um de seus filhos. O código cliente pode, então, interagir com qualquer objeto através da interface Componente, sem precisar se preocupar se é um objeto simples ou um container complexo.

## Quando Usar

* Quando você precisa representar uma hierarquia de objetos do tipo "parte-todo".
* Quando você quer que o código cliente trate objetos individuais e composições de objetos da mesma forma, simplificando o código e promovendo a reutilização.
* Em qualquer estrutura que possa ser representada como uma árvore.

---
### Diagrama de Classe UML

![image](https://github.com/user-attachments/assets/fb125674-9f3b-4b70-85d9-1cafa1a37593)
