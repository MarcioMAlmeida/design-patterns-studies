# Padrão de Projeto: Chain of Responsibility

## Intenção

O Chain of Responsibility é um padrão comportamental que **permite passar uma solicitação ao longo de uma cadeia de objetos manipuladores**, evitando o acoplamento direto entre quem envia a solicitação e quem a recebe.

## Problema

Imagine um sistema que precisa processar uma solicitação de diferentes maneiras, dependendo do tipo de dado ou de certas condições. Por exemplo, um sistema de aprovação de despesas onde valores diferentes precisam ser aprovados por diferentes níveis hierárquicos (gerente, diretor, CEO). Se o código que inicia a solicitação tiver que conhecer todos os possíveis aprovadores e usar uma série de `if/else` para direcionar a despesa, ele ficará fortemente acoplado e difícil de manter.

## Solução

O padrão sugere organizar os objetos manipuladores em uma "corrente". Cada manipulador contém uma referência ao próximo na cadeia. Ao receber uma solicitação, o manipulador tem duas opções:
1.  Processar a solicitação, se for capaz.
2.  Passar a solicitação para o próximo manipulador na corrente, se não for.

O cliente que envia a solicitação só precisa conhecer o primeiro objeto da cadeia. A solicitação viajará pela corrente até que um dos manipuladores a processe ou até que chegue ao final da cadeia.

## Quando Usar

* Quando mais de um objeto pode tratar uma solicitação, e o manipulador exato não é conhecido a priori.
* Para desacoplar quem envia uma solicitação de quem a recebe.
* Quando o conjunto de objetos que pode tratar uma solicitação precisa ser definido dinamicamente.

---
### Diagrama de Classe UML

![image](https://github.com/user-attachments/assets/64e72a7d-3f27-45bf-a74f-1505fdca5592)
