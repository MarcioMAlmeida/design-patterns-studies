# Padrão de Projeto: Adapter

## Intenção

O Adapter é um padrão estrutural que **permite que objetos com interfaces incompatíveis colaborem entre si**. Ele atua como um tradutor entre duas interfaces diferentes.

## Problema

Imagine que você está trabalhando em uma aplicação que precisa integrar uma biblioteca de terceiros. A sua aplicação espera trabalhar com uma interface específica, mas a biblioteca oferece a funcionalidade que você precisa através de uma interface totalmente diferente. Você não pode (ou não quer) alterar o código da biblioteca. Como fazer os dois lados conversarem?

## Solução

O padrão Adapter resolve isso criando uma classe intermediária, o "Adaptador", que "envolve" o objeto da biblioteca (o *Adaptee*) e implementa a interface que a sua aplicação espera (o *Target*).

Quando o seu código cliente chama um método na interface do Adaptador, o Adaptador recebe essa chamada e a traduz em uma ou mais chamadas para os métodos do objeto envolvido. Dessa forma, a complexidade da tradução fica isolada no Adaptador, e o resto do seu código permanece limpo e desacoplado da implementação externa.

## Quando Usar

* Quando você precisa usar uma classe existente, mas sua interface não é compatível com o resto do seu código.
* Para criar uma classe reutilizável que precisa cooperar com classes não relacionadas ou que não possuem necessariamente uma interface em comum.
* Para desacoplar seu código de implementações concretas de APIs externas, facilitando a troca dessas APIs no futuro.

---
### Diagrama de Classe UML

![image](https://github.com/user-attachments/assets/edc0f903-35d6-4063-9ae0-f7aa2be6db88)
