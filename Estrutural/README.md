# 🏛️ Padrões de Projeto Estruturais (Structural Design Patterns)

Os Padrões Estruturais se concentram em como classes e objetos podem ser **compostos para formar estruturas maiores e mais complexas**, garantindo que essas estruturas permaneçam flexíveis, eficientes e estáveis. Eles simplificam o design ao identificar maneiras simples de realizar relacionamentos entre entidades.

## A Intenção Principal

Enquanto os padrões criacionais cuidam da criação de objetos, os estruturais cuidam da sua organização. O foco aqui é gerenciar as dependências e as relações entre as partes de um sistema. Eles utilizam herança e, principalmente, composição para permitir que objetos desenvolvidos de forma independente trabalhem juntos em algo maior.

Seja para combinar duas interfaces incompatíveis ou para simplificar a fachada de um sistema complexo, os padrões estruturais fornecem um guia para montar seu software.

## Problemas que Eles Resolvem:

* **Adaptar interfaces:** Fazer com que classes com interfaces incompatíveis possam colaborar.
* **Simplificar sistemas:** Criar uma interface única e simples para um subsistema complexo.
* **Adicionar funcionalidades:** Anexar novas responsabilidades a objetos de forma dinâmica, sem alterar seu código.
* **Gerenciar hierarquias:** Compor objetos em estruturas de árvore, permitindo que sejam tratados de forma uniforme.
* **Otimizar o uso de recursos:** Reduzir o uso de memória ao compartilhar objetos.
* **Controlar o acesso:** Atuar como um intermediário para outro objeto, controlando como ele é acessado.

## Padrões Nesta Categoria:

Abaixo estão os padrões estruturais implementados neste diretório. Cada um oferece uma solução para um desafio diferente de organização e composição de software.

* **[Adapter](./AdapterExemplo/):** Permite que interfaces incompatíveis trabalhem juntas, convertendo a interface de uma classe em outra que o cliente espera.
* **[Bridge](./BridgeExemplo/):** Desacopla uma abstração de sua implementação, para que as duas possam variar independentemente.
* **[Composite](./CompositeExemplo/):** Compõe objetos em estruturas de árvore para representar hierarquias, tratando objetos individuais e composições de forma uniforme.
* **[Decorator](./DecoratorExemplo/):** Anexa dinamicamente responsabilidades adicionais a um objeto, oferecendo uma alternativa flexível à herança.
* **[Facade](./FacadeExemplo/):** Fornece uma interface unificada e simplificada para um conjunto de interfaces em um subsistema complexo.
* **[Flyweight](./FlyweightExemplo/):** Minimiza o uso de memória ao compartilhar o máximo de dados possível com outros objetos semelhantes.
* **[Proxy](./ProxyExemplo/):** Fornece um substituto ou um marcador de lugar para outro objeto, a fim de controlar o acesso a ele.
