# 📖 Padrões de Projeto Criacionais (Creational Design Patterns)

Os Padrões Criacionais são focados em um único objetivo: **controlar o processo de criação de objetos**. Eles oferecem mecanismos que aumentam a flexibilidade e o reuso de código, tornando o sistema independente de como seus objetos são criados, compostos e representados.

## A Intenção Principal

Em sistemas complexos, a criação direta de objetos com a palavra-chave `new` pode levar a um alto acoplamento e dificultar a manutenção. Por exemplo, se você precisa mudar a classe de um objeto que é instanciado em vários pontos do código, teria que alterar cada uma dessas instâncias manualmente.

Os Padrões Criacionais resolvem isso encapsulando o conhecimento sobre quais classes concretas o sistema deve usar e escondendo como as instâncias dessas classes são criadas e montadas.

## Problemas que Eles Resolvem:

* **Abstrair a instanciação:** Esconder a lógica de qual classe concreta será criada.
* **Flexibilizar a criação:** Permitir que o sistema seja configurado com diferentes "fábricas" de objetos sem alterar o código que os utiliza.
* **Garantir instâncias únicas:** Controlar o número de instâncias de uma classe (como no Singleton).
* **Simplificar a criação de objetos complexos:** Separar a construção de um objeto de sua representação final (como no Builder).

## Padrões Nesta Categoria:

Abaixo estão os padrões criacionais implementados neste diretório. Cada um oferece uma abordagem diferente para o desafio da criação de objetos.

* **[Singleton](./Singleton/):** Garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global a ela.
* **[Factory Method](./FactoryMethod/):** Define uma interface para criar um objeto, mas deixa as subclasses decidirem qual classe instanciar.
* **[Abstract Factory](./AbstractFactory/):** Fornece uma interface para criar famílias de objetos relacionados sem especificar suas classes concretas.
* **[Builder](./Builder/):** Separa a construção de um objeto complexo de sua representação, permitindo diferentes representações com o mesmo processo de construção.
* **[Prototype](./Prototype/):** Cria novos objetos através da cópia (clonagem) de uma instância existente.
