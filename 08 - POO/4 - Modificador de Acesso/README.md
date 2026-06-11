# 08.4 - Modificadores de Acesso

## Objetivo

Esta seção apresenta os modificadores de acesso em Java, mecanismos utilizados para controlar a visibilidade e o acesso a classes, atributos, métodos e construtores.

Os modificadores de acesso são fundamentais para o encapsulamento, permitindo proteger dados e definir quais partes do sistema podem acessar determinados elementos.

---

# O que são Modificadores de Acesso?

Modificadores de acesso determinam onde uma classe, atributo, método ou construtor pode ser acessado.

Eles ajudam a controlar a exposição do código e a proteger informações internas da aplicação.

---

# Modificadores de Acesso em Java

Java possui quatro níveis de acesso:

- `public`
- `protected`
- `default` (sem modificador)
- `private`

---

# Resumo dos Níveis de Acesso

| Modificador | Mesma Classe | Mesmo Package | Subclasse | Outros Packages |
|------------|------------|------------|------------|------------|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌* |
| `default` | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

\* Classes de outros packages só podem acessar membros `protected` através de herança.

---

# Public

Elementos declarados como `public` podem ser acessados de qualquer lugar da aplicação.

## Exemplo

```java
public class Pessoa {

    public String nome;
}
```

Uso:

```java
Pessoa pessoa = new Pessoa();
pessoa.nome = "Maria";
```

---

# Private

Elementos declarados como `private` só podem ser acessados dentro da própria classe.

## Exemplo

```java
public class Conta {

    private double saldo;
}
```

O código abaixo gera erro:

```java
Conta conta = new Conta();
conta.saldo = 1000; // Erro de compilação
```

Normalmente o acesso é realizado através de métodos públicos.

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

# Protected

Elementos declarados como `protected` podem ser acessados:

- Pela própria classe.
- Por classes do mesmo package.
- Por subclasses (herança), mesmo em outros packages.

## Exemplo

```java
public class Animal {

    protected String nome;
}
```

Uma subclasse pode acessar esse atributo:

```java
public class Cachorro extends Animal {

    public void exibirNome() {
        System.out.println(nome);
    }
}
```

---

# Default (Package-Private)

Quando nenhum modificador é informado, o acesso é restrito ao mesmo package.

## Exemplo

```java
class Produto {

    String descricao;
}
```

Neste caso:

- Classes do mesmo package podem acessar `descricao`.
- Classes de outros packages não podem acessar `descricao`.

---

# Modificadores em Classes

Classes normais (top-level) podem utilizar apenas:

- `public`
- `default`

Exemplo:

```java
public class Pessoa {

}
```

ou

```java
class Pessoa {

}
```

Não é permitido:

```java
private class Pessoa {

}
```

ou

```java
protected class Pessoa {

}
```

ou seja, private e protected não podem ser utilizados em classes normais (top-level), apenas em classes internas (inner class). 

---

# Encapsulamento

O uso mais comum dos modificadores de acesso é o encapsulamento.

Boa prática:

```java
public class Produto {

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
```

Dessa forma, os dados ficam protegidos e o acesso é controlado pela própria classe.

---

# Boas Práticas

- Utilize `private` para atributos sempre que possível.
- Exponha apenas o necessário através de métodos públicos.
- Evite atributos públicos em aplicações reais.
- Utilize `protected` apenas quando fizer sentido na hierarquia de herança.
- Mantenha o menor nível de acesso necessário para cada elemento.

---

# Observações

- Modificadores de acesso podem ser aplicados a atributos, métodos, construtores e classes.
- Eles são um dos principais mecanismos para implementar encapsulamento.
- Quanto menor a visibilidade de um elemento, maior tende a ser sua proteção.
- Nem toda informação deve estar disponível para todas as partes do sistema.

---

# Resumo

Os modificadores de acesso permitem controlar a visibilidade dos elementos de uma aplicação Java. Eles são fundamentais para o encapsulamento, a organização do código e a proteção dos dados, ajudando a construir sistemas mais seguros e fáceis de manter.