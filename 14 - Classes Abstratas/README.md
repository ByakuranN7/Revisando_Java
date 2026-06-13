# 14 - Classes Abstratas

## Objetivo

Esta seção apresenta o conceito de **classes abstratas em Java**, que servem como base para outras classes e não podem ser instanciadas diretamente.

Elas são usadas para representar uma estrutura genérica que será especializada por subclasses, permitindo reutilização de código e definição de comportamentos obrigatórios.

---

# O que é uma Classe Abstrata?

Uma classe abstrata é uma classe que:

- não pode ser instanciada diretamente
- pode conter métodos abstratos e concretos
- pode conter atributos e estado
- serve como modelo para outras classes

### Sintaxe:

```java
abstract class NomeClasse {

}
```

### Exemplo:

```java
abstract class Animal {

}

Animal a = new Animal(); // Erro: não pode instanciar
```

---

# Objetivo das Classes Abstratas

Classes abstratas são usadas como **modelo base para outras classes**.

Elas permitem:

- reutilização de código
- centralização de comportamentos compartilhados
- definir estrutura comum
- obrigar subclasses a implementarem métodos específicos

---

# Métodos Abstratos

Métodos abstratos:

- não possuem implementação (corpo)
- obrigam a implementação na subclasse
- quando declarados em uma classe, exigem que a classe seja abstrata

### Exemplo:

```java
abstract class Animal {

    abstract void emitirSom();
}
```

### Implementação obrigatória:

```java
class Cachorro extends Animal {

    @Override
    void emitirSom() {
        System.out.println("Au au");
    }
}
```

---

# Regras importantes

## 1. Classe com método abstract deve ser abstrata

```java
abstract class Animal {

    abstract void emitirSom();
}
```

---

## 2. Se uma subclasse não implementar todos os métodos abstratos, ela também deve ser abstrata.

```java
abstract class Gato extends Animal {

}
```

---

# Métodos normais (Métodos concretos)

Classes abstratas também podem ter métodos com implementação.

### Exemplo:

```java
abstract class Animal {

    void dormir() {
        System.out.println("Dormindo");
    }
}
```

Esses métodos são herdados normalmente pelas subclasses.

---

# Atributos e Construtores

Classes abstratas podem conter:

- atributos
- construtores
- métodos normais
- métodos abstratos
- métodos static
- métodos final

Diferente de interfaces, classes abstratas podem manter estado.

### Exemplo:

```java
abstract class Pessoa {

    String nome;

    Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Pessoa criada");
    }
}
```

Classes abstratas podem possuir construtores normalmente. Embora não possam ser instanciadas diretamente, seus construtores são executados quando uma subclasse é instanciada.

---

# extends

Classes abstratas são herdadas usando `extends`.

### Exemplo:

```java
class Cachorro extends Animal {

}
```

---

# Métodos static e final

Classes abstratas também podem conter métodos `static` e `final`.

### Método static:

Não pertence ao objeto, e sim à própria classe. Por isso, não participa de polimorfismo.

```java
abstract class Utils {

    static int soma(int a, int b) {
        return a + b;
    }
}
```

### Método final:

Não pode ser sobrescrito pelas subclasses.

```java
abstract class Animal {

    final void respirar() {
        System.out.println("Respirando");
    }
}
```

---

# Diferença entre Interface e Classe Abstrata

## Interface
- define um contrato
- permite múltiplas implementações (`implements`)
- foco em "o que deve ser feito"
- podem ter implementações limitadas (`default`/`static`)
- não são usadas para armazenar estado de instância como classes.

## Classe Abstrata
- serve como base de herança
- pode conter estado (atributos) e implementação
- foco em reutilização de código
- classes permitem apenas herança única (`extends`)
- podem implementar interfaces

---

# Quando usar cada um?

## Use Interface quando:
- quiser definir comportamentos comuns entre classes diferentes
- precisar de múltiplas implementações
- quiser desacoplamento forte

## Use Classe Abstrata quando:
- existir uma estrutura base em comum
- houver código reutilizável entre classes
- quiser compartilhar estado e comportamento

---

# Resumo

Classes abstratas são estruturas base que não podem ser instanciadas diretamente e servem para definir uma combinação de comportamento obrigatório (métodos abstratos) e comportamento reutilizável (métodos concretos e estado).

Elas são ideais para criar hierarquias de classes mais organizadas e reaproveitáveis.