# Padrão de Projeto: Template Method

## Intenção

O Template Method é um padrão comportamental que **define o esqueleto de um algoritmo em uma superclasse, mas deixa as subclasses redefinirem certas etapas desse algoritmo** sem alterar sua estrutura geral.

## Problema

Suponha que você tenha vários algoritmos que seguem a mesma sequência de passos, mas os detalhes de cada passo podem variar. Por exemplo, um processo de compilação de código pode sempre seguir os passos: "Coletar Fontes", "Compilar Código" e "Executar Testes", mas a forma como cada passo é executado pode ser diferente para Java ou C++. Duplicar a estrutura geral do algoritmo em várias classes levaria à repetição de código.

## Solução

O padrão Template Method resolve isso criando uma classe base abstrata que contém um "Método Template". Este método define a sequência de passos do algoritmo e é declarado como `final` para que as subclasses não possam sobrescrevê-lo. Os passos que são comuns a todas as variações são implementados na própria classe base. Os passos que variam são declarados como métodos abstratos, forçando as subclasses a fornecerem suas próprias implementações.

## Quando Usar

* Para permitir que as subclasses estendam apenas partes específicas de um algoritmo, sem modificar sua estrutura geral.
* Para evitar a duplicação de código, centralizando a parte invariável de um algoritmo em uma única classe base.
* Para controlar os pontos de extensão em um framework, garantindo que a lógica principal não seja alterada.

---
### Diagrama de Classe UML

![image](https://github.com/user-attachments/assets/e432b7b6-46f1-4ab3-ba21-b238dc0f4fae)
