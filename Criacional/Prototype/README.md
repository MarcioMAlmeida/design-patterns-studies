# Padrão de Projeto: Prototype

## Intenção

O Prototype é um padrão criacional que **permite criar novos objetos através da cópia (clonagem) de uma instância existente**, em vez de criá-los do zero.

## Problema

Suponha que você tenha um objeto cuja criação é um processo caro e demorado, envolvendo, por exemplo, consultas a um banco de dados ou cálculos complexos. Se você precisar de múltiplos objetos com configurações muito semelhantes, recriar cada um deles do zero seria ineficiente.

Além disso, às vezes você só conhece o tipo de objeto que precisa criar em tempo de execução, e o código cliente não deve depender das classes concretas desses objetos.

## Solução

O padrão Prototype resolve isso delegando o processo de criação ao próprio objeto que será copiado. Ele define uma interface comum para todos os objetos que podem ser clonados, geralmente contendo um único método, como `clone()`.

O código cliente, em vez de chamar `new`, chama o método `clone()` em um objeto "protótipo". Esse método cria um novo objeto da mesma classe e copia todos os campos do objeto original para o novo. Isso é muito mais rápido do que a criação do zero, especialmente para objetos complexos.

## Quando Usar

* Quando a criação de um objeto é mais cara ou complexa do que sua cópia.
* Quando seu código não deve depender das classes concretas dos objetos que você precisa criar e copiar.
* Para reduzir o número de subclasses que diferem apenas na inicialização de seus atributos. Você pode criar um conjunto de protótipos pré-configurados e cloná-los quando necessário.

---
### Diagrama de Classe UML

![image](https://github.com/MarcioMAlmeida/PrototypeExemplo/assets/78739307/1ccde959-4879-40fe-a738-0ca15a5cd682)
