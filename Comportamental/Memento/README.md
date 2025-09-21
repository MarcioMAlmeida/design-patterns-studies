# Padrão de Projeto: Memento

## Intenção

O Memento é um padrão comportamental que **permite capturar e externalizar o estado interno de um objeto, sem violar seu encapsulamento**, para que ele possa ser restaurado a esse estado posteriormente.

## Problema

Você precisa implementar uma funcionalidade de "desfazer" (undo) ou criar "pontos de salvamento" (checkpoints) para um objeto complexo. Uma abordagem ingênua seria tornar todos os campos do objeto públicos para que outra classe pudesse salvar e restaurar seus valores, mas isso quebraria totalmente o encapsulamento, uma das bases da orientação a objetos.

## Solução

O padrão Memento utiliza três papéis:
1.  **Originator:** O objeto cujo estado queremos salvar. Ele sabe como criar um `Memento` com seu estado atual e como se restaurar a partir de um `Memento`.
2.  **Memento:** Um objeto simples que armazena o estado do Originator. Seus campos são inacessíveis para outras classes, exceto para o Originator, garantindo o encapsulamento.
3.  **Caretaker:** A classe que armazena os Mementos (ex: em uma pilha para a função de desfazer), mas não sabe nada sobre seu conteúdo interno. Ela apenas os guarda e os devolve ao Originator quando solicitado.

## Quando Usar

* Para implementar funcionalidades de desfazer/refazer em uma aplicação.
* Para salvar e restaurar o estado de um objeto em momentos específicos, como em checkpoints de jogos ou transações.
* Para garantir que o estado salvo de um objeto não possa ser modificado por outras classes, preservando o encapsulamento.

---
### Diagrama de Classe UML

![image](https://github.com/user-attachments/assets/89af80e6-d3ac-4ef2-9ed4-edebb3e77b76)
