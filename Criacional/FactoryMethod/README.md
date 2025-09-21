# Padrão de Projeto: Factory Method

## Intenção

O Factory Method é um padrão criacional que **define uma interface para criar um objeto, mas deixa as subclasses decidirem qual classe concreta instanciar**. Ele permite que uma classe delegue a responsabilidade da instanciação para suas subclasses.

## Problema

Imagine que você está criando uma aplicação de logística que inicialmente só lida com transporte por caminhões. Seu código estaria cheio de referências à classe `Caminhao`. Agora, imagine que a aplicação precisa ser expandida para incluir transporte marítimo, com uma classe `Navio`. Você teria que modificar grande parte do seu código, trocando `new Caminhao()` por lógicas que decidem quando criar um caminhão ou um navio. Isso quebra o princípio "Aberto/Fechado", pois você precisa modificar código existente para adicionar novas funcionalidades.

## Solução

O padrão Factory Method sugere que você substitua as chamadas diretas ao construtor (`new ...`) por uma chamada a um método especial, o "método de fábrica" (Factory Method). A criação dos objetos continua sendo feita com o operador `new`, mas dentro do método de fábrica.

A "mágica" acontece quando você permite que as subclasses sobrescrevam esse método de fábrica para alterar o tipo de produto que será criado. Uma classe `LogisticaTerrestre` implementaria o método para retornar um `Caminhao`, enquanto uma `LogisticaMaritima` o implementaria para retornar um `Navio`. O código cliente que usa esses objetos não precisa saber qual tipo concreto está sendo criado, ele apenas interage com uma interface comum.

## Quando Usar

* Quando uma classe não sabe com antecedência quais tipos de objetos ela precisa criar.
* Quando você quer fornecer aos usuários da sua biblioteca ou framework uma maneira de estender seus componentes internos, permitindo que eles criem suas próprias versões dos objetos.
* Para centralizar a lógica de criação de produtos, evitando a duplicação de código e facilitando a manutenção quando o tipo de produto precisa mudar.

---
### Diagrama de Classe UML

![image](https://github.com/MarcioMAlmeida/FactoryMethodExemplo/assets/78739307/58597f89-35f7-4b03-8a18-8966cb5038bb)
