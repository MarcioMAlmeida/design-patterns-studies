# Padrão de Projeto: Strategy

## Intenção

O Strategy é um padrão comportamental que **define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis**. Ele permite que o algoritmo varie independentemente dos clientes que o utilizam.

## Problema

Você tem uma tarefa que pode ser executada de várias maneiras diferentes (usando diferentes algoritmos). Por exemplo, um sistema de mapas pode calcular uma rota para carro, a pé ou de bicicleta. Implementar todos esses algoritmos dentro da classe principal (`CalculadoraDeRota`) com uma estrutura condicional (`if/else`) para selecionar o algoritmo a torna grande, complexa e difícil de estender com novas opções.

## Solução

O padrão Strategy sugere extrair esses algoritmos para classes separadas, chamadas de "Estratégias". Todas as estratégias implementam uma interface comum. O objeto original (o "Contexto", `CalculadoraDeRota`) mantém uma referência a um objeto de estratégia e delega a ele a execução do algoritmo. O Contexto pode ter um método para trocar a estratégia em tempo de execução, alterando seu comportamento dinamicamente sem alterar seu código.

## Quando Usar

* Quando você tem várias variantes de um algoritmo e quer que o cliente possa escolher qual usar em tempo de execução.
* Para substituir condicionais que selecionam diferentes comportamentos, deixando o código mais limpo.
* Para isolar os detalhes de implementação dos algoritmos do código que os utiliza.
* Quando você tem muitas classes semelhantes que diferem apenas na maneira como executam algum comportamento.

---
### Diagrama de Classe UML

![image](https://github.com/user-attachments/assets/a6093ad8-01af-43a5-8b26-f70c42131d1e)
