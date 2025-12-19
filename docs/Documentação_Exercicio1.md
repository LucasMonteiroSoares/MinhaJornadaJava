# Sistema de estoque e criação de pedidos
## Foco: Encapsulamento, ArrayList, Objeto dentro de Objeto e Listas dentro de Classes
### Aprendizados
- Conceitos: private, static, constructor, getters/setters, scanners;
- Abrir e fechar scanner na main, passar para outras funções como parâmetro;
- É uma boa prática @Override (sobrescrever) o método toString nas suas classes, dessa maneira, ao der print em uma instância, vêm os dados "bonitos".
- Manipulação de objetos dentro de outros objetos, exemplo: um objeto Produto formou uma instãncia da classe ItemPedido
- Descobri que toda a vez que você concatena um objeto com uma String usando +, o Java chama automaticamente o toString() daquele objeto!