# 12 - Imutabilidade

## Objetivo

Esta seção apresenta o conceito de **Imutabilidade** em Java.

Imutabilidade é a característica de algo que não pode ser alterado após sua criação. Esse conceito está presente em diversos recursos da linguagem e ajuda a tornar o código mais seguro, previsível e fácil de manter.

---

# O que é Imutabilidade?

Algo é considerado imutável quando seu estado não pode ser modificado após ser definido.

Exemplo de valor mutável:

```java
int idade = 25;

idade = 30;

System.out.println(idade);
```

Saída:

```txt
30
```

O valor da variável foi alterado durante a execução do programa.

---

Exemplo de valor imutável:

```java
final int idade = 25;

idade = 30; // Erro de compilação
```

Após receber um valor, a variável não pode mais ser modificada.

---

# Onde a Imutabilidade Aparece em Java?

A imutabilidade pode ser encontrada em diferentes partes da linguagem:

* Variáveis.
* Atributos.
* Classes.
* Métodos.
* Constantes.
* Enums.
* Algumas classes da biblioteca padrão.

---

# Imutabilidade em Variáveis

Uma variável pode ser imutável através da palavra-chave `final`.

Exemplo:

```java
final double PI = 3.14159;
```

Após a inicialização, não é possível atribuir outro valor para a variável.

```java
PI = 3.14; // Erro de compilação
```

---

# Imutabilidade em Atributos

Atributos também podem ser declarados como `final`.

```java
public class Pessoa {

    private final int idade;

    public Pessoa(int idade) {
        this.idade = idade;
    }
}
```

Nesse caso, o atributo só poderá receber valor durante a construção do objeto.

---

# Imutabilidade em Classes

Uma classe pode ser declarada como `final`.

```java
public final class Calculadora {

}
```

Classes `final` não podem ser herdadas.

```java
public class MinhaCalculadora extends Calculadora { // Erro

}
```

Isso é frequentemente utilizado para proteger comportamentos que não devem ser alterados por subclasses.

---

# Imutabilidade em Métodos

Métodos também podem ser declarados como `final`.

```java
public class Veiculo {

    public final void ligar() {
        System.out.println("Ligando...");
    }
}
```

Nesse caso, subclasses não poderão sobrescrever esse método.

```java
public class Carro extends Veiculo {

    @Override
    public void ligar() { // Erro
    }
}
```

---

# A Palavra-Chave final

A palavra-chave `final` é o principal recurso utilizado para implementar imutabilidade em Java.

Ela pode ser aplicada em:

* Variáveis.
* Atributos.
* Métodos.
* Classes.

Resumo:

| Uso              | Efeito                              |
| ---------------- | ----------------------------------- |
| `final` variável | Impede nova atribuição              |
| `final` atributo | Impede alteração após inicialização |
| `final` método   | Impede sobrescrita                  |
| `final` classe   | Impede herança                      |

---

# Constantes em Java

Uma constante normalmente é criada utilizando `static final`.

Exemplo:

```java
public class Configuracao {

    public static final int IDADE_MINIMA = 18;
}
```

Nesse caso:

* `static` faz o valor pertencer à classe.
* `final` impede alterações.

---

# Convenção de Nomes para Constantes

Por convenção, constantes são escritas:

* Com letras maiúsculas.
* Com palavras separadas por `_`.

Exemplos:

```java
public static final int IDADE_MINIMA = 18;

public static final double TAXA_JUROS = 0.05;

public static final int MAXIMO_TENTATIVAS = 3;
```

Essa convenção facilita a identificação de valores que não devem ser modificados.

---

# Enum e Imutabilidade

Um `enum` representa um conjunto fixo de constantes.

Exemplo:

```java
public enum NivelAcesso {

    ADMIN,
    MODERADOR,
    USUARIO
}
```

Uso:

```java
NivelAcesso nivel = NivelAcesso.ADMIN;
```

Os valores definidos em um enum são fixos e não podem ser alterados durante a execução do programa.

---

# Por Que Utilizar Enum?

Sem enum:

```java
int nivel = 1;
```

O significado do valor não é imediatamente claro.

Com enum:

```java
NivelAcesso nivel = NivelAcesso.ADMIN;
```

O código se torna mais legível, seguro e menos propenso a erros.

---

# Benefícios da Imutabilidade

* Maior segurança dos dados.
* Menor chance de alterações acidentais.
* Código mais previsível.
* Facilidade de manutenção.
* Facilidade para testes.
* Melhor comportamento em ambientes concorrentes (multithreading).

---

# Boas Práticas

* Utilize `final` sempre que um valor não precisar mudar.
* Utilize constantes para valores fixos do sistema.
* Siga a convenção de nomes para constantes.
* Utilize enums para representar conjuntos fixos de valores.
* Evite permitir alterações desnecessárias em dados importantes.

---

# Observações

* Imutabilidade significa que algo não pode ser alterado após sua criação.
* `final` é o principal recurso de imutabilidade da linguagem.
* Constantes normalmente utilizam `static final`.
* Enums representam conjuntos fixos de constantes.
* Classes e métodos também podem utilizar `final`.
* `String` é uma das classes imutáveis mais utilizadas do Java.

---

# Resumo

Imutabilidade é a característica de algo que não pode ser alterado após ser criado. Em Java, ela aparece principalmente através da palavra-chave `final`, das constantes (`static final`), dos enums e de classes projetadas para impedir modificações em seu estado. Utilizar recursos imutáveis torna o código mais seguro, previsível e fácil de manter.
