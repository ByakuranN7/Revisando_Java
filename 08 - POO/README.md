# 08 - Programação Orientada a Objetos (POO)

## Objetivo

Esta seção apresenta os fundamentos da Programação Orientada a Objetos (POO) em Java.

A POO é um paradigma de programação que organiza o software em objetos, permitindo criar aplicações mais organizadas, reutilizáveis, escaláveis e fáceis de manter.

Grande parte dos recursos avançados da linguagem Java é baseada nos conceitos da orientação a objetos.

---

# O que é Programação Orientada a Objetos?

Programação Orientada a Objetos é uma forma de modelar problemas do mundo real através de objetos.

Um objeto combina:

- Estado (atributos)
- Comportamento (métodos)

Exemplo:

Uma pessoa possui:

- Nome
- Idade

E pode realizar ações como:

- Andar
- Falar
- Dormir

Em Java, esses elementos são representados por classes e objetos.

---

# Classe

Uma classe funciona como um molde ou projeto para criação de objetos.

Ela define quais atributos e métodos os objetos terão.

## Exemplo

```java
public class Pessoa {

    String nome;
    int idade;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
```

---

# Objeto

Um objeto é uma instância de uma classe.

A partir de uma classe podem ser criados diversos objetos.

## Exemplo

```java
Pessoa pessoa1 = new Pessoa();

pessoa1.nome = "Maria";
pessoa1.idade = 25;

pessoa1.apresentar();
```

---

# Atributos

Atributos representam as características ou dados de um objeto.

## Exemplo

```java
public class Produto {

    String nome;
    double preco;
}
```

Neste exemplo:

- `nome` é um atributo.
- `preco` é um atributo.

---

# Métodos

Métodos representam os comportamentos ou ações de um objeto.

## Exemplo

```java
public class Calculadora {

    void somar(int a, int b) {
        System.out.println(a + b);
    }
}
```

---

# Construtores

Construtores são métodos especiais utilizados para inicializar objetos.

Eles possuem o mesmo nome da classe.

## Exemplo

```java
public class Pessoa {

    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
}
```

Uso:

```java
Pessoa pessoa = new Pessoa("João");
```

---

# Encapsulamento

Encapsulamento consiste em proteger os dados de uma classe e controlar seu acesso.

Normalmente utiliza-se:

- atributos privados (`private`)
- métodos getters e setters

## Exemplo

```java
public class Conta {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
```

---

# Palavra-chave THIS

A palavra-chave `this` referencia o próprio objeto atual.

## Exemplo

```java
public class Pessoa {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
}
```

Nesse caso:

```java
this.nome
```

refere-se ao atributo da classe.

---

# Organização desta Seção

Esta pasta serve como introdução à Programação Orientada a Objetos.

Os tópicos relacionados estão organizados em subpastas:

- Object
- Construct (Construtores)
- Package
- Modificadores de Acesso
- Métodos
- Getters e Setters
- Passagem por Valor e por Referência
- Static
- Métodos Static

Conceitos mais avançados como Herança, Interfaces, Classes Abstratas e Polimorfismo possuem seções próprias neste repositório.

---

# Benefícios da POO

- Maior organização do código.
- Melhor reutilização de código.
- Facilidade de manutenção.
- Maior modularidade.
- Melhor modelagem de problemas reais.
- Facilita o desenvolvimento de aplicações grandes.

---

# Observações

- Em Java, praticamente tudo gira em torno de classes e objetos.
- Objetos são criados utilizando o operador `new`.
- Uma classe pode gerar múltiplos objetos.
- Métodos definem comportamentos.
- Atributos armazenam informações.
- Construtores inicializam objetos.
- Encapsulamento ajuda a proteger os dados da aplicação.

---

# Resumo

A Programação Orientada a Objetos é um dos pilares da linguagem Java e permite organizar aplicações através de classes e objetos. Com ela é possível modelar entidades do mundo real, encapsular dados e criar sistemas mais reutilizáveis, organizados e fáceis de manter.