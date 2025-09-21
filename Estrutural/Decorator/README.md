# Padrão de Projeto: Decorator

## Intenção

O Decorator é um padrão estrutural que **anexa dinamicamente responsabilidades ou comportamentos adicionais a um objeto**, sem alterar seu código.

## Problema

Às vezes, você precisa estender a funcionalidade de uma classe, mas usar herança não é uma boa opção. A herança é estática (definida em tempo de compilação) e se aplica a todas as instâncias da classe. Se você precisar de muitas combinações de funcionalidades (ex: notificação por Email, SMS, Slack), isso levaria a uma explosão de subclasses (`NotificadorEmailSMS`, `NotificadorEmailSlack`, etc.).

## Solução

O padrão Decorator sugere que você "envolva" o objeto original em um outro objeto, chamado de "Decorador". Tanto o objeto original quanto os decoradores implementam a mesma interface, garantindo que sejam intercambiáveis.

O decorador recebe em seu construtor o objeto a ser decorado. Quando um método é chamado no decorador, ele executa sua própria funcionalidade adicional e, em seguida, delega a chamada para o objeto envolvido. Como os decoradores e o objeto original compartilham a mesma interface, você pode "empilhar" múltiplos decoradores uns sobre os outros.

## Quando Usar

* Para adicionar responsabilidades a objetos individuais de forma dinâmica e transparente, sem afetar outros objetos.
* Quando a extensão por subclasses é impraticável devido ao grande número de combinações independentes.
* Quando a definição de uma classe é complexa ou oculta e não pode ser alterada.

---
### Diagrama de Classe UML

![image](https://github.com/MarcioMAlmeida/DecoratorExemplo/assets/78739307/048f5e5e-6b2f-40ee-9cfb-dca62b5e54d6)
