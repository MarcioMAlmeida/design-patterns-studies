# Padrão de Projeto: Visitor

## Intenção

O Visitor é um padrão comportamental que **permite separar um algoritmo de uma estrutura de objetos sobre a qual ele opera**, permitindo adicionar novas operações a essa estrutura sem alterar as classes dos objetos que a compõem.

## Problema

Imagine que você tem uma estrutura de objetos complexa (como a representação de um documento com parágrafos, imagens e tabelas) e precisa executar várias operações distintas sobre ela (ex: exportar para PDF, gerar HTML, verificar ortografia). Adicionar um método para cada nova operação diretamente nas classes de elementos (`Paragrafo`, `Imagem`, etc.) as tornaria "inchadas" e violaria o princípio de responsabilidade única.

## Solução

O padrão Visitor extrai as operações para classes separadas, os "Visitantes". Você cria uma interface `Visitor` com um método `visitar()` para cada tipo de elemento concreto (`visitarParagrafo(p)`, `visitarImagem(i)`). Para cada operação, você cria um visitante concreto (ex: `ExportadorPDFVisitor`). Cada elemento da estrutura de objetos deve ter um método `aceitar(Visitor)`, que simplesmente chama o método `visitar()` correto no visitante, passando a si mesmo (`this`). Isso permite adicionar novas operações criando novos visitantes, sem tocar nas classes dos elementos.

## Quando Usar

* Quando você precisa executar muitas operações diferentes e não relacionadas sobre os objetos de uma estrutura complexa.
* Para evitar poluir as classes da estrutura com lógicas que não são de sua responsabilidade principal.
* Quando a estrutura de objetos é relativamente estável, mas as operações sobre ela mudam com frequência.

---
### Diagrama de Classe UML

![image](https://github.com/user-attachments/assets/685dd083-bdca-4cd5-a691-67465e74bd03)
