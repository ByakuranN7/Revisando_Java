# 10 - Herança

## Objetivo

Esta seção apresenta o conceito de **Herança**, um dos pilares da Programação Orientada a Objetos (POO).

A herança permite que uma classe reutilize atributos e métodos de outra classe, promovendo reaproveitamento de código, organização e especialização de comportamentos.

---

# O que é Herança?

Herança é o mecanismo que permite que uma classe herde características de outra.

A classe que fornece as características é chamada de **superclasse** (classe pai ou classe base).

A classe que herda essas características é chamada de **subclasse** (classe filha ou classe derivada).

Exemplo:

```java
public class Animal {

    String nome;

    public void dormir() {
        System.out.println("Dormindo...");
    }
}
```

```java
public class Cachorro extends Animal {

}
```

Neste caso, `Cachorro` herda os atributos e métodos de `Animal`.

---

# Palavra-chave extends

Em Java, a herança é implementada utilizando a palavra-chave `extends`.

Exemplo:

```java
public class Cachorro extends Animal {

}
```

A palavra `extends` indica que `Cachorro` herda tudo o que for acessível da classe `Animal`.

---

# Herança de Atributos

Os atributos da superclasse podem ser utilizados pela subclasse.

```java
public class Animal {

    String nome;
}
```

```java
public class Cachorro extends Animal {

}
```

Uso:

```java
Cachorro cachorro = new Cachorro();

cachorro.nome = "Rex";

System.out.println(cachorro.nome);
```

Saída:

```txt
Rex
```

---

# Herança de Métodos

Os métodos da superclasse também podem ser utilizados pela subclasse.

```java
public class Animal {

    public void dormir() {
        System.out.println("Dormindo...");
    }
}
```

```java
public class Cachorro extends Animal {

}
```

Uso:

```java
Cachorro cachorro = new Cachorro();

cachorro.dormir();
```

Saída:

```txt
Dormindo...
```

---

# Adicionando Novos Comportamentos

Uma subclasse pode adicionar seus próprios atributos e métodos.

```java
public class Cachorro extends Animal {

    public void latir() {
        System.out.println("Au Au!");
    }
}
```

Uso:

```java
Cachorro cachorro = new Cachorro();

cachorro.dormir();
cachorro.latir();
```

---

# Relação "É Um"

Uma boa forma de identificar quando usar herança é a relação **"é um"**.

Exemplos:

* Cachorro é um Animal.
* Gato é um Animal.
* Aluno é uma Pessoa.
* Gerente é um Funcionário.

Quando essa relação existe naturalmente, a herança geralmente faz sentido.

---

# Sobrescrita de Métodos (Override)

Uma subclasse pode alterar o comportamento herdado sobrescrevendo métodos da superclasse.

Exemplo:

```java
public class Animal {

    public void emitirSom() {
        System.out.println("Som genérico");
    }
}
```

```java
public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }
}
```

Uso:

```java
Cachorro cachorro = new Cachorro();

cachorro.emitirSom();
```

Saída:

```txt
Au Au!
```

---

# Utilizando super

A palavra-chave `super` permite acessar membros da superclasse.

Exemplo:

```java
public class Animal {

    protected String nome;
}
```

```java
public class Cachorro extends Animal {

    public void exibirNome() {
        System.out.println(super.nome);
    }
}
```

Também é possível chamar métodos da superclasse.

```java
super.metodo();
```

---

# Chamando o Construtor da Superclasse

A palavra-chave `super()` permite chamar o construtor da classe pai.

Exemplo:

```java
public class Animal {

    public Animal(String nome) {
        this.nome = nome;
    }

    protected String nome;
}
```

```java
public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }
}
```

---

# O que NÃO é Herdado?

Alguns membros não são herdados ou não podem ser acessados diretamente.

### Construtores

Construtores não são herdados.

```java
public class Animal {

    public Animal() {

    }
}
```

A subclasse pode chamar o construtor utilizando `super()`, mas não o herda.

---

### Membros Private

Membros `private` pertencem exclusivamente à classe onde foram declarados.

```java
private String senha;
```

A subclasse não possui acesso direto a eles.

---

# Herança em Cadeia

Uma classe pode herdar de outra que também herdou de outra.

Exemplo:

```java
Pessoa
   ↑
Funcionario
   ↑
Gerente
```

O objeto `Gerente` herda características de `Funcionario` e também de `Pessoa`.

---

# Herança Múltipla

Java não permite herança múltipla entre classes.

O seguinte código é inválido:

```java
public class ClasseFilha extends ClasseA, ClasseB {

}
```

Uma classe só pode herdar diretamente de uma única classe.

Para resolver situações semelhantes, Java utiliza Interfaces.

---

# Classe Object

Toda classe em Java herda direta ou indiretamente da classe `Object`.

Exemplo:

```java
public class Pessoa {

}
```

Na prática:

```java
public class Pessoa extends Object {

}
```

Por isso todas as classes possuem métodos como:

```java
toString()
equals()
hashCode()
```

---

# Boas Práticas

* Utilize herança apenas quando existir uma relação natural de especialização.
* Evite criar hierarquias excessivamente profundas.
* Prefira composição quando a relação "é um" não existir.
* Utilize `@Override` ao sobrescrever métodos.
* Mantenha as responsabilidades das classes bem definidas.

---

# Observações

* Herança é um dos pilares da Programação Orientada a Objetos.
* Uma subclasse pode reutilizar atributos e métodos da superclasse.
* Java utiliza a palavra-chave `extends` para implementar herança.
* Construtores não são herdados.
* Uma classe só pode herdar diretamente de uma única classe.
* Toda classe herda direta ou indiretamente de `Object`.

---

# Resumo

A herança permite criar novas classes a partir de classes existentes, promovendo reutilização de código e especialização de comportamentos. Utilizando `extends`, uma subclasse pode herdar atributos e métodos de uma superclasse, além de adicionar ou modificar funcionalidades através da sobrescrita de métodos.
