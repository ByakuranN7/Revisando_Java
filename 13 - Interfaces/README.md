# 13 - Interfaces

## Objetivo

Esta seção apresenta o conceito de **Interfaces em Java**, que são usadas para definir contratos de comportamento entre classes.

Interfaces permitem que diferentes classes sigam o mesmo padrão de métodos, mesmo que tenham implementações completamente diferentes.

---

# O que é uma Interface?

Uma interface define **quais comportamentos uma classe deve ter**, sem definir como esses comportamentos serão implementados.

Ela funciona como um **contrato**.

### Sintaxe:

```java
interface NomeInterface {

}
```

---

# Implementando uma Interface

Uma classe implementa uma interface usando a palavra-chave `implements`.

### Exemplo:

```java
interface Animal {

    void emitirSom();
}

class Cachorro implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }
}
```

### Uso:

```java
Cachorro cachorro = new Cachorro();
cachorro.emitirSom();
```

---

# Métodos em Interfaces

As interfaces podem conter diferentes tipos de métodos. Cada um tem um comportamento específico.

## 📊 Comparação dos tipos de métodos

| Tipo de método | Possui implementação? | Precisa ser implementado pela classe? | Pode ser sobrescrito? | Onde pertence |
|----------------|----------------------|---------------------------------------|-----------------------|--------------|
| Abstrato       | ❌ Não               | ✅ Sim                                | —                     | Classe que implementa |
| default        | ✅ Sim               | ❌ Não                                | ✅ Sim                | Instância da classe |
| static         | ✅ Sim               | ❌ Não                                | ❌ Não                | Interface |

---

# Métodos abstratos (padrão)

Todos os métodos de uma interface são automaticamente:

- `public`
- `abstract`

### Exemplo:

```java
interface Animal {

    void emitirSom();
}
```

A classe que implementa essa interface é **obrigada** a implementar o método.

---

## Quando não implementa todos os métodos

Se a classe não implementar todos os métodos da interface, ela deve ser declarada como `abstract`.

```java
interface Animal {

    void emitirSom();
}

abstract class Gato implements Animal {

}
```

---

# Métodos default

Interfaces podem ter métodos com implementação usando `default`.

```java
interface Animal {

    void emitirSom();

    default void dormir() {
        System.out.println("Dormindo");
    }
}
```

### Características:

- Não são obrigatórios de implementar
- Podem ser usados diretamente pela classe
- Podem ser sobrescritos

---

# Métodos static

Interfaces também podem ter métodos `static`.

```java
interface Calculadora {

    static int somar(int a, int b) {
        return a + b;
    }
}
```

### Uso:

```java
Calculadora.somar(5, 5);
```

### Características:

- Pertencem à interface
- Não são herdados
- Não podem ser sobrescritos
- São chamados diretamente pela interface

---

# Características das Interfaces

- Não podem ser instanciadas
- Definem comportamentos (contratos)
- Métodos são `public abstract` por padrão
- Atributos são automaticamente `public static final`
- Permitem múltiplas implementações

---

# Implementar Múltiplas Interfaces

Uma classe pode implementar várias interfaces ao mesmo tempo.

```java
interface Corredor {
    void correr();
}

interface Nadador {
    void nadar();
}

class Pessoa implements Corredor, Nadador {

    @Override
    public void correr() {
        System.out.println("Correndo");
    }
    
    @Override
    public void nadar() {
        System.out.println("Nadando");
    }
}
```

---

# extends vs implements

## extends
Usado para herança de classes, herda de uma classe pai:

```java
class Filho extends Pai {

}
```

## implements
Usado para interfaces, implementa uma interface (segue o "contrato"):

```java
class Pessoa implements Corredor {

}
```

---

# Observações Importantes

- Interfaces não representam comportamento completo, apenas contrato.
- A classe que implementa define toda a lógica.
- Uma interface pode ser usada para padronizar diferentes implementações.
- O uso de interfaces é essencial para desacoplamento de código.
- Conceitos como o **polimorfismo** que usam interfaces com mais profundidade serão explorados em seções futuras do repositório.

---

# Resumo

Interfaces em Java são usadas para definir contratos que classes devem seguir. Elas garantem padronização de comportamento entre diferentes implementações, permitindo maior flexibilidade e organização no código.