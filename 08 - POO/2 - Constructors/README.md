# 08.2 - Constructors (Construtores)

## Objetivo

Esta seção apresenta os construtores em Java, métodos especiais utilizados para inicializar objetos durante sua criação.

Os construtores permitem definir valores iniciais para os atributos de uma classe, garantindo que os objetos sejam criados em um estado válido e consistente.

---

# O que é um Construtor?

Um construtor é um método especial executado automaticamente quando um objeto é criado utilizando o operador `new`.

Sua principal função é inicializar atributos e preparar o objeto para uso.

---

# Características dos Construtores

- Possuem o mesmo nome da classe.
- Não possuem tipo de retorno.
- São executados automaticamente na criação do objeto.
- Podem receber parâmetros.
- Podem ser sobrecarregados.

---

# Construtor Padrão

Quando nenhum construtor é declarado, o Java cria automaticamente um construtor sem parâmetros.

## Exemplo

```java
public class Pessoa {

    String nome;
    int idade;
}
```

Uso:

```java
Pessoa pessoa = new Pessoa();
```

Neste caso, o compilador cria implicitamente um construtor padrão.

---

# Construtor Personalizado

É possível criar construtores para inicializar atributos com valores específicos.

## Exemplo

```java
public class Pessoa {

    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```

Uso:

```java
Pessoa pessoa = new Pessoa("Maria", 25);
```

---

# Palavra-chave THIS

A palavra-chave `this` é frequentemente utilizada dentro de construtores para diferenciar atributos da classe de parâmetros locais.

## Exemplo

```java
public class Produto {

    private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }
}
```

Neste exemplo:

```java
this.nome
```

refere-se ao atributo da classe.

Já:

```java
nome
```

refere-se ao parâmetro recebido pelo construtor.

---

# Sobrecarga de Construtores

Uma classe pode possuir múltiplos construtores com diferentes parâmetros.

## Exemplo

```java
public class Pessoa {

    String nome;
    int idade;

    public Pessoa() {
        nome = "Não informado";
        idade = 0;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        idade = 0;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```

Uso:

```java
Pessoa p1 = new Pessoa();
Pessoa p2 = new Pessoa("João");
Pessoa p3 = new Pessoa("Maria", 25);
```

---

# Chamada de Construtor com THIS()

Um construtor pode chamar outro construtor da mesma classe utilizando `this()`.

## Exemplo

```java
public class Pessoa {

    String nome;
    int idade;

    public Pessoa() {
        this("Não informado", 0);
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```

Isso evita duplicação de código.

---

# Benefícios dos Construtores

- Inicializam objetos corretamente.
- Evitam estados inválidos.
- Tornam o código mais seguro.
- Facilitam a criação de objetos consistentes.
- Permitem diferentes formas de inicialização através da sobrecarga.

---

# Observações

- Construtores não possuem tipo de retorno, nem mesmo `void`.
- O nome do construtor deve ser exatamente igual ao nome da classe.
- Se um construtor personalizado for criado, o construtor padrão deixa de ser gerado automaticamente pelo compilador.
- É possível criar vários construtores utilizando sobrecarga.

---

# Erro Comum

Após criar um construtor personalizado:

```java
public class Pessoa {

    public Pessoa(String nome) {

    }
}
```

O seguinte código gera erro:

```java
Pessoa pessoa = new Pessoa();
```

Isso acontece porque o construtor sem parâmetros não existe mais.

A solução é criar explicitamente um construtor vazio:

```java
public Pessoa() {

}
```

---

# Resumo

Construtores são métodos especiais responsáveis pela inicialização de objetos em Java. Eles são executados automaticamente durante a criação de instâncias, permitem definir valores iniciais para atributos e contribuem para a criação de objetos consistentes e seguros.
