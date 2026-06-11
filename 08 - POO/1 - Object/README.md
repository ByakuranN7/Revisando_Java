# 08.1 - Object

## Objetivo

Esta seção apresenta o conceito de objeto na Programação Orientada a Objetos (POO), um dos fundamentos mais importantes da linguagem Java.

Objetos representam entidades, conceitos ou abstrações do domínio da aplicação, armazenando informações (atributos) e comportamentos (métodos).

---

# O que é um Objeto?

Um objeto é uma instância de uma classe.

Enquanto a classe funciona como um molde ou projeto, o objeto é a entidade criada a partir desse molde.

## Exemplo do mundo real

Classe:

```txt
Pessoa
```

Objetos:

```txt
João
Maria
Carlos
```

Todos são objetos da classe `Pessoa`, mas cada um possui seus próprios valores para os atributos.

---

# Classe vs Objeto

## Classe

Define a estrutura que os objetos terão.

```java
public class Pessoa {

    String nome;
    int idade;
}
```

---

## Objeto

É uma instância da classe.

```java
Pessoa pessoa1 = new Pessoa();

pessoa1.nome = "João";
pessoa1.idade = 25;
```

Neste exemplo:

- `Pessoa` é a classe.
- `pessoa1` é um objeto.
- `new Pessoa()` cria uma nova instância da classe.

---

# Criando Objetos

Objetos são criados utilizando o operador `new`.

## Exemplo

```java
Pessoa pessoa1 = new Pessoa();
Pessoa pessoa2 = new Pessoa();
```

Cada objeto possui seu próprio espaço na memória.

---

# Acessando Atributos

Após criar um objeto, seus atributos podem ser acessados através do operador ponto (`.`).

## Exemplo

```java
Pessoa pessoa = new Pessoa();

pessoa.nome = "Maria";
pessoa.idade = 30;

System.out.println(pessoa.nome);
System.out.println(pessoa.idade);
```

---

# Acessando Métodos

Métodos também são acessados através do operador ponto.

## Exemplo

```java
public class Pessoa {

    String nome;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
```

Uso:

```java
Pessoa pessoa = new Pessoa();

pessoa.nome = "Maria";
pessoa.apresentar();
```

---

# Referências de Objetos

Em Java, variáveis de objetos armazenam referências para objetos na memória.

## Exemplo

```java
Pessoa pessoa1 = new Pessoa();
Pessoa pessoa2 = pessoa1;
```

Neste caso:

```txt
pessoa1 ──► Objeto
pessoa2 ──► Objeto
```

As duas variáveis apontam para o mesmo objeto.

---

## Exemplo Prático

```java
Pessoa pessoa1 = new Pessoa();
pessoa1.nome = "João";

Pessoa pessoa2 = pessoa1;

pessoa2.nome = "Maria";

System.out.println(pessoa1.nome);
```

Saída:

```txt
Maria
```

Isso ocorre porque ambas as variáveis referenciam o mesmo objeto.

---

# Comparando Objetos

O operador `==` compara referências, não o conteúdo dos objetos.

## Exemplo

```java
Pessoa pessoa1 = new Pessoa();
Pessoa pessoa2 = new Pessoa();

System.out.println(pessoa1 == pessoa2);
```

Saída:

```txt
false
```

Mesmo que os objetos possuam os mesmos valores, eles ocupam posições diferentes na memória.

---

# Classe Object

Todos os objetos em Java herdam, direta ou indiretamente, da classe `Object`.

Ela fornece métodos importantes como:

- `toString()`
- `equals()`
- `hashCode()`
- `getClass()`

Exemplo:

```java
Pessoa pessoa = new Pessoa();

System.out.println(pessoa.getClass());
```

---

# Observações

- Objetos são criados com o operador `new`.
- Cada objeto possui seu próprio estado (atributos).
- Objetos podem compartilhar a mesma referência.
- O operador `.` é utilizado para acessar atributos e métodos.
- Toda classe em Java herda da classe `Object`.
- Objetos são armazenados na memória e manipulados através de referências.

---

# Resumo

Objetos são a base da Programação Orientada a Objetos em Java. Eles representam instâncias de classes, armazenam dados através de atributos e executam comportamentos através de métodos. Compreender objetos é essencial para dominar os conceitos mais avançados da orientação a objetos.