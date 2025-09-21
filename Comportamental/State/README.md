# Padrão de Projeto: State

## Intenção

O State é um padrão comportamental que **permite que um objeto altere seu comportamento quando seu estado interno muda**. O objeto parecerá mudar de classe.

## Problema

Um objeto pode ter comportamentos muito diferentes dependendo de seu estado atual. Por exemplo, um objeto `Documento` pode ter os métodos `publicar()` e `revisar()`, mas eles se comportam de maneira diferente se o documento estiver no estado "Rascunho", "Em Revisão" ou "Publicado". A maneira mais comum de implementar isso é com grandes e complexas estruturas condicionais (`if/else` ou `switch`) dentro dos métodos do objeto, o que torna o código difícil de ler e manter.

## Solução

O padrão State sugere a criação de uma interface `Estado` e classes concretas para cada estado possível (`EstadoRascunho`, `EstadoRevisao`, etc.). O objeto principal (o "Contexto", `Documento`) armazena uma referência a um objeto de estado, que representa seu estado atual. Em vez de implementar o comportamento diretamente, o Contexto delega as chamadas para o objeto de estado. A transição de um estado para outro também é encapsulada nas próprias classes de estado.

## Quando Usar

* Quando o comportamento de um objeto depende de seu estado e precisa mudar dinamicamente em tempo de execução.
* Para substituir grandes e complexos blocos condicionais que gerenciam o comportamento de uma máquina de estados.
* Para localizar em um único lugar todo o comportamento associado a um estado particular, tornando o código mais limpo e coeso.

---
### Diagrama de Classe UML

![image](https://github.com/user-attachments/assets/7f00197c-92d6-4f3c-89ab-de538365d0a6)
