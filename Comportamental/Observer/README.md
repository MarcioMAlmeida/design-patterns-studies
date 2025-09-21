# Padrão de Projeto: Observer

## Intenção

O Observer é um padrão comportamental que **define uma dependência um-para-muitos entre objetos**, de modo que, quando um objeto (o "sujeito") muda de estado, todos os seus dependentes (os "observadores") são notificados e atualizados automaticamente.

## Problema

Imagine um objeto cujo estado é de interesse para vários outros objetos. Por exemplo, um objeto `Produto` em um e-commerce e vários componentes da UI (`Carrinho`, `ListaDeDesejos`) que precisam saber quando o preço ou o estoque desse produto muda. Se o `Produto` tiver que conhecer e chamar diretamente cada um desses componentes, ele ficará fortemente acoplado a eles, tornando o sistema difícil de manter.

## Solução

O padrão Observer propõe que o objeto "Sujeito" (ou "Publicador") mantenha uma lista de referências a objetos "Observadores" (ou "Assinantes"). O Sujeito oferece métodos para que os Observadores possam se inscrever e cancelar a inscrição. Quando o estado do Sujeito muda, ele percorre sua lista de Observadores e chama um método de notificação (`atualizar()`) em cada um, passando os dados da mudança. Os Observadores podem então reagir a essa notificação.

## Quando Usar

* Quando uma mudança no estado de um objeto requer que outros objetos sejam atualizados, e você não sabe de antemão quantos e quais são esses objetos.
* Para implementar sistemas de notificação de eventos, onde o "publicador" de eventos não deve estar acoplado aos "assinantes".
* Em arquiteturas de UI, como no padrão MVC (Model-View-Controller), onde a View (Observador) precisa ser atualizada quando o Model (Sujeito) muda.

---
### Diagrama de Classe UML

![image](https://github.com/user-attachments/assets/2ac45064-d961-43cd-84de-f31d4d978353)
