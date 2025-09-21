# Padrão de Projeto: Singleton

## Intenção

O Singleton é um padrão criacional que **garante que uma classe tenha apenas uma única instância** e fornece um ponto de acesso global a essa instância.

## Problema

Imagine que você precisa de um objeto para gerenciar um recurso compartilhado, como uma conexão com o banco de dados, um gerenciador de configurações ou um serviço de log. Se você permitir que várias instâncias desse objeto sejam criadas livremente (`new ObjetoDeConfig()`), você pode acabar com vários problemas:
1.  **Desperdício de Recursos:** Múltiplas conexões de banco de dados ou múltiplos objetos de configuração consumindo memória desnecessariamente.
2.  **Inconsistência de Estado:** Se vários objetos de configuração existirem, qual deles representa a "verdade"? Modificar um não afetaria os outros, levando a um estado inconsistente no sistema.

## Solução

O padrão Singleton resolve isso ao proibir a criação de objetos por meios convencionais e, em vez disso, fornecer um método estático especial (`getInstance()`) que se encarrega de gerenciar a única instância.

A implementação clássica envolve:
1.  Tornar o **construtor da classe privado**, para impedir que outras classes usem o operador `new` com ela.
2.  Criar um **método estático público** (`getInstance()`) que atua como o construtor alternativo. Na primeira vez que é chamado, ele cria o objeto e o armazena em um campo estático. Em todas as chamadas subsequentes, ele simplesmente retorna o objeto já existente.

Isso garante que, não importa quantas vezes o método `getInstance()` seja chamado, ele sempre retornará o mesmo objeto.

## Quando Usar

* Quando você precisa de **exatamente uma instância** de uma classe disponível para todos os clientes, como um objeto de configurações globais ou um pool de conexões.
* Quando o controle estrito sobre uma instância única é necessário para coordenar ações em todo o sistema, como em serviços de log ou drivers de hardware.
* Para gerenciar recursos que são caros para criar e devem ser compartilhados, como uma conexão com um serviço externo.

---
### Diagrama de Classe UML

![image](https://github.com/MarcioMAlmeida/AbstractFactoryExemplo/assets/78739307/7f251e53-6633-4ab7-9094-5edcf6cf2c44)
