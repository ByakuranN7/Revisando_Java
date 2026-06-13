# 15 - Polimorfismo

## Objetivo

Esta seção apresenta o conceito de **Polimorfismo**, um dos pilares da Programação Orientada a Objetos (POO).

Polimorfismo permite que objetos diferentes sejam tratados através de uma mesma referência, executando comportamentos específicos de acordo com o tipo real do objeto.

Esse conceito trabalha diretamente com conteúdos vistos anteriormente, principalmente **Herança**, **Interfaces**, **Classes Abstratas** e **Sobrescrita de Métodos (`@Override`)**.

---

# O que é Polimorfismo?

A palavra "polimorfismo" significa:

> Muitas formas.

Em Java, significa que uma mesma referência pode representar diferentes tipos de objetos.

Exemplo conceitual:

```java
Animal animal;
```

A variável `animal` pode apontar para:

```java
Animal animal = new Cachorro();
```

ou

```java
Animal animal = new Gato();
```

Embora a referência seja do tipo `Animal`, o comportamento executado dependerá do objeto real armazenado nela.

---

# Exemplo Básico

Classe base:

```java
class Animal {

    void emitirSom() {
        System.out.println("Som genérico");
    }
}
```

Subclasses:

```java
class Cachorro extends Animal {

    @Override
    void emitirSom() {
        System.out.println("Au au");
    }
}
```

```java
class Gato extends Animal {

    @Override
    void emitirSom() {
        System.out.println("Miau");
    }
}
```

---

# Polimorfismo na Prática

```java
Animal a1 = new Cachorro();

Animal a2 = new Gato();

a1.emitirSom();
a2.emitirSom();
```

Saída:

```txt
Au au
Miau
```

Mesmo utilizando referências do tipo `Animal`, cada objeto executa sua própria implementação do método.

Esse é o principal exemplo de polimorfismo.

---

# Como o Polimorfismo Funciona?

Quando um método é sobrescrito utilizando `@Override`, Java decide em tempo de execução qual implementação deve ser utilizada.

Exemplo:

```java
Animal animal = new Cachorro();

animal.emitirSom();
```

Embora a variável seja do tipo `Animal`, o objeto armazenado é um `Cachorro`.

Por isso, o método executado será:

```java
System.out.println("Au au");
```

e não o método da classe `Animal`.

---

# Relação com Herança

O polimorfismo é frequentemente utilizado através da herança.

Lembrando rapidamente:

```java
class Cachorro extends Animal {

}
```

Nesse caso:

- `Cachorro` herda de `Animal`
- um `Cachorro` também pode ser tratado como um `Animal`
- isso permite criar referências mais genéricas

# Polimorfismo com Classes Abstratas

Classes abstratas também participam do polimorfismo.

Exemplo:

```java
abstract class Animal {

    abstract void emitirSom();
}
```

```java
class Cachorro extends Animal {

    @Override
    void emitirSom() {
        System.out.println("Au au");
    }
}
```

Uso:

```java
Animal animal = new Cachorro();

animal.emitirSom();
```

Mesmo utilizando uma referência abstrata, o comportamento correto será executado.

---

# Polimorfismo com Interfaces

Interfaces também permitem polimorfismo.

Interface:

```java
interface Animal {

    void emitirSom();
}
```

Implementação:

```java
class Cachorro implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }
}
```

Uso:

```java
Animal animal = new Cachorro();

animal.emitirSom();
```

A referência possui o tipo da interface, mas o método executado pertence ao objeto real.

---

# Tipos Comuns de Polimorfismo

| Tipo | Utiliza |
|--------|--------|
| Polimorfismo por herança | `extends` |
| Polimorfismo por interface | `implements` |

Ambos seguem exatamente a mesma ideia:

> Utilizar referências mais genéricas para manipular objetos mais específicos.

---

# Upcasting

Upcasting acontece quando um objeto da subclasse é tratado como uma superclasse.

Exemplo:

```java
Animal animal = new Cachorro();
```

Nesse caso:

- `Cachorro` é a subclasse
- `Animal` é a superclasse

O upcasting é automático e seguro.

---

# Limitação da Referência

Um conceito muito importante:

> O tipo da referência determina o que pode ser acessado.

Exemplo:

```java
class Cachorro extends Animal {

    void buscarBola() {
        System.out.println("Buscando bola");
    }
}
```

```java
Animal animal = new Cachorro();

animal.emitirSom();
```

Isso funciona.

Porém:

```java
animal.buscarBola();
```

Gera erro de compilação.

Embora o objeto seja um `Cachorro`, a referência é do tipo `Animal`.

Portanto, só é possível acessar membros definidos em `Animal`.

---

# instanceof

O operador `instanceof` permite verificar o tipo real de um objeto.

Exemplo:

```java
Animal animal = new Cachorro();

if (animal instanceof Cachorro) {
    System.out.println("É um cachorro");
}
```

Saída:

```txt
É um cachorro
```

Esse recurso é útil quando é necessário descobrir qual tipo de objeto está armazenado em uma referência mais genérica.

---

# Benefícios do Polimorfismo

- código mais flexível
- menor acoplamento
- maior reutilização
- facilidade de manutenção
- facilidade de expansão do sistema
- permite trabalhar com referências genéricas

---

# Exemplo Completo

```java
class Animal {

    void emitirSom() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {

    @Override
    void emitirSom() {
        System.out.println("Au au");
    }
}

class Gato extends Animal {

    @Override
    void emitirSom() {
        System.out.println("Miau");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal[] animais = {
            new Cachorro(),
            new Gato()
        };

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
```

Saída:

```txt
Au au
Miau
```

Observe que o mesmo código funciona para diferentes tipos de objetos.

---

# Observações

- Polimorfismo depende fortemente de herança ou interfaces.
- O comportamento executado depende do tipo real do objeto.
- O tipo da referência limita os membros acessíveis.
- `@Override` é frequentemente utilizado para implementar polimorfismo.
- Classes abstratas e interfaces são amplamente usadas em conjunto com polimorfismo.
- O operador `instanceof` permite verificar o tipo real de um objeto.

---

# Resumo

Polimorfismo é a capacidade de utilizar referências genéricas para trabalhar com diferentes tipos de objetos. Através de herança, interfaces e sobrescrita de métodos, Java consegue executar automaticamente o comportamento correto para cada objeto, tornando o código mais flexível, reutilizável e fácil de manter.