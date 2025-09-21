# Padrão de Projeto: Flyweight

## Intenção

O Flyweight é um padrão estrutural que **minimiza o uso de memória ao compartilhar o máximo de dados possível com outros objetos semelhantes**, em vez de manter todos os dados em cada objeto.

## Problema

Imagine uma aplicação que precisa lidar com uma quantidade massiva de objetos pequenos e muito parecidos, como partículas em um efeito especial ou árvores em um jogo 3D. Se cada objeto contivesse todos os seus dados (coordenadas, cor, textura, malha 3D), a memória RAM seria rapidamente consumida, tornando a aplicação inviável.

## Solução

O padrão Flyweight sugere dividir o estado de um objeto em duas partes:
1.  **Estado Intrínseco:** Os dados que são imutáveis e compartilhados entre muitos objetos (ex: a textura e a malha 3D de uma árvore).
2.  **Estado Extrínseco:** Os dados que são únicos para cada objeto e não podem ser compartilhados (ex: as coordenadas x, y, z de cada árvore).

O estado intrínseco é armazenado em um objeto "Flyweight", que é reutilizado por todos os objetos que precisam dele. O estado extrínseco é mantido fora do Flyweight e é passado como parâmetro para seus métodos quando uma operação é necessária. Uma fábrica geralmente gerencia um pool de Flyweights, garantindo que apenas uma instância de cada tipo seja criada.

## Quando Usar

* Quando uma aplicação precisa criar um número muito grande de objetos e não tem memória suficiente para isso.
* Quando a maioria do estado dos objetos pode ser externalizada e compartilhada.
* Quando a identidade de cada objeto não é importante, e eles podem ser tratados como intercambiáveis.

---
### Diagrama de Classe UML

![image](https://github.com/user-attachments/assets/e0e136af-5783-4a05-b449-090184866470)
