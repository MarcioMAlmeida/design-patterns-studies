# Padrão de Projeto: Command

## Intenção

O Command é um padrão comportamental que **encapsula uma solicitação ou operação como um objeto**. Isso permite parametrizar clientes com diferentes solicitações, enfileirar ou registrar operações, e suportar funcionalidades de "desfazer".

## Problema

Em muitas aplicações, o objeto que invoca uma ação (ex: um botão em uma interface gráfica) não é o mesmo que executa a ação (ex: um editor de texto). Acoplar diretamente o botão à lógica de "salvar arquivo" o tornaria inflexível e impossível de reutilizar para outras ações como "copiar" ou "colar".

## Solução

O padrão Command propõe a criação de um objeto intermediário, o "Comando", que encapsula a ação a ser executada. Este objeto geralmente contém uma referência ao objeto que realmente fará o trabalho (o "Receptor"). O objeto que invoca a ação (o "Invocador", como o botão) é configurado com um objeto de comando e simplesmente chama um método padrão, como `execute()`. O Invocador não precisa saber nada sobre o Receptor ou sobre a ação que está sendo executada.

## Quando Usar

* Para parametrizar objetos com ações a serem executadas (ex: configurar botões e itens de menu).
* Para criar filas de tarefas, agendar sua execução ou executá-las em threads separadas.
* Para implementar uma funcionalidade de "desfazer" (undo/redo), adicionando um método `undo()` ao objeto de comando.
* Para desacoplar o objeto que invoca uma operação daquele que sabe como realizá-la.

---
### Diagrama de Classe UML

![image](https://github.com/user-attachments/assets/127da849-a37b-4ab9-ab91-6ea15b6daa83)
