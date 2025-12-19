# Sistema bancário

## Foco: Herança e Polimorfismo

### Aprendizados

- Extends na classe filha para fazer a herança;

- O uso de protect ao invés de private, limita a visualização dos atributos de uma classe para as suas filhas, optei por manter private e ter segurança máxima, fazendo uso de getters e setters;

- No constructor de uma classe filha, precisamos chamar super(atributos herdados), DEVE ser a primeira linha do constructor e continuar normalmente;

- Em um ArrayList<ClasseMãe>, podem ser armazenados Classes Filhas;

- Switch case, pode ter mais de um número por case (separado por vírgula)

- Classes filhas herdam inclusive métodos sobrescriots, exemplo: toString(), portanto, deve-se complementar o toString com os atributos que a mãe não tinha --> return super.toString() + " | Limite: " + this.limite;

- Pensando em boas práticas é melhor ter duas funções distintas, mesmo que tenham uma funcionalidade muito similar;

- Usei o operador instanceof e casting dentro do if para converter o objeto armazenado no ArrayList para um outro.