# Padrão de Projeto: Mediator

## Intenção

O Mediator é um padrão comportamental que **define um objeto que encapsula como um conjunto de outros objetos interage**, promovendo o baixo acoplamento ao evitar que eles se refiram uns aos outros explicitamente.

## Problema

Em um sistema com muitos componentes que precisam se comunicar (ex: um formulário com campos de texto, botões, checkboxes), permitir que cada componente se comunique diretamente com todos os outros cria uma "teia de aranha" de dependências. Isso torna o sistema difícil de entender, manter e reutilizar, pois cada componente está fortemente acoplado aos outros.

## Solução

O padrão Mediator propõe a criação de um objeto "Mediador" central que lida com toda a comunicação entre os componentes (agora chamados de "Colegas"). Os Colegas não falam mais uns com os outros diretamente; eles apenas notificam o Mediador sobre suas ações ou mudanças de estado. O Mediador, que conhece todos os Colegas, então orquestra as interações, decidindo quais outros Colegas precisam reagir. Isso centraliza a lógica de comunicação em um único lugar.

## Quando Usar

* Quando um conjunto de objetos se comunica de maneiras complexas e bem definidas, resultando em um emaranhado de dependências.
* Para centralizar a lógica de controle quando é difícil modificar um objeto porque ele está acoplado a muitos outros.
* Para reutilizar componentes individuais, já que eles não dependem mais de outros componentes concretos, apenas do Mediador.

---
### Diagrama de Classe UML

![image](https://github.com/user-attachments/assets/f1414ce7-9b0e-44c4-94c8-9a3fa70cfc29)
