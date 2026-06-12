# 11 - Annotations

## Objetivo

Esta seção apresenta as **Annotations** em Java, recursos utilizados para adicionar metadados ao código.

As annotations não alteram diretamente o comportamento da aplicação, mas fornecem informações para o compilador, ferramentas de desenvolvimento, frameworks e bibliotecas.

---

# O que são Annotations?

Annotations são marcações especiais que podem ser aplicadas a classes, métodos, atributos, parâmetros e outros elementos do código.

Elas são identificadas pelo símbolo `@`.

Exemplo:

```java
@Override
public String toString() {
    return "Exemplo";
}
```

Neste caso, `@Override` informa ao compilador que o método está sobrescrevendo um método da superclasse.

---

# Por que Utilizar Annotations?

As annotations ajudam a:

* Tornar o código mais legível.
* Reduzir configurações manuais.
* Detectar erros em tempo de compilação.
* Fornecer informações para frameworks e bibliotecas.
* Automatizar comportamentos.

Atualmente, diversos frameworks Java utilizam annotations extensivamente, como:

* Spring Boot
* Hibernate/JPA
* Jakarta EE
* JUnit

---

# Annotation @Override

É uma das annotations mais utilizadas.

Indica que um método está sobrescrevendo um método herdado da superclasse.

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

---

# Vantagem do @Override

Sem a annotation:

```java
public class Cachorro extends Animal {

    public void emitiSom() {
        System.out.println("Au Au!");
    }
}
```

Observe o erro de digitação:

```txt
emitiSom
```

O compilador não entenderá que você pretendia sobrescrever o método.

Com `@Override`:

```java
@Override
public void emitiSom() {

}
```

O compilador emitirá um erro, ajudando a identificar o problema.

---

# Annotation @Deprecated

Indica que um elemento está obsoleto e não deve mais ser utilizado.

Exemplo:

```java
@Deprecated
public void metodoAntigo() {

}
```

Uso:

```java
objeto.metodoAntigo();
```

A IDE normalmente exibirá um aviso informando que o método foi depreciado, mas rodará o código normalmente.

---

# Annotation @SuppressWarnings

Permite suprimir determinados avisos do compilador.

Exemplo:

```java
@SuppressWarnings("unused")
private String nome;
```

Outro exemplo:

```java
@SuppressWarnings("deprecation")
```

Essa annotation deve ser utilizada com cautela para evitar esconder problemas reais no código.

---

# Annotation @FunctionalInterface

Utilizada para indicar que uma interface possui exatamente um método abstrato.

Exemplo:

```java
@FunctionalInterface
public interface Calculadora {

    int calcular(int a, int b);
}
```

Essa annotation é muito utilizada em conjunto com Expressões Lambda.

---

# Onde as Annotations Podem Ser Aplicadas?

Annotations podem ser utilizadas em diversos elementos:

* Classes
* Interfaces
* Métodos
* Construtores
* Atributos
* Parâmetros
* Pacotes
* Variáveis locais

Exemplo:

```java
@Override
public String toString() {

}
```

---

# Annotations Personalizadas

Também é possível criar suas próprias annotations.

Exemplo:

```java
public @interface Autor {

}
```

Uso:

```java
@Autor
public class Relatorio {

}
```

Embora não sejam comuns em aplicações simples, são bastante utilizadas no desenvolvimento de frameworks.

---

# Retenção das Annotations

Uma annotation pode existir em diferentes momentos da aplicação.

Os principais tipos de retenção são:

| Tipo    | Descrição                               |
| ------- | --------------------------------------- |
| SOURCE  | Existe apenas durante a compilação      |
| CLASS   | Fica armazenada no arquivo `.class`     |
| RUNTIME | Permanece disponível durante a execução |

Exemplo:

```java
@Retention(RetentionPolicy.RUNTIME)
```

O estudo detalhado desse recurso normalmente ocorre em tópicos mais avançados.

---

# Exemplo Completo

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

# Boas Práticas

* Utilize `@Override` sempre que sobrescrever métodos.
* Utilize `@Deprecated` para indicar funcionalidades antigas.
* Evite o uso excessivo de `@SuppressWarnings`.
* Prefira annotations em vez de comentários para fornecer metadados ao compilador.
* Utilize annotations de forma consistente ao longo do projeto.

---

# Observações

* Annotations são metadados adicionados ao código.
* São identificadas pelo símbolo `@`.
* Não substituem a lógica da aplicação.
* Podem ser utilizadas pelo compilador, IDEs e frameworks.
* Java fornece diversas annotations prontas.
* Também é possível criar annotations personalizadas.

---

# Resumo

Annotations são recursos utilizados para adicionar informações extras ao código-fonte. Elas ajudam o compilador, ferramentas e frameworks a compreender melhor a intenção do desenvolvedor, tornando o código mais seguro, organizado e fácil de manter.