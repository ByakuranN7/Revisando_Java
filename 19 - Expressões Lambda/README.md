# 19 - Expressões Lambda

## Objetivo

Esta seção apresenta as **Expressões Lambda**, um recurso introduzido no Java 8 que permite escrever implementações de métodos de forma mais curta, legível e expressiva.

As lambdas são um dos pilares da programação moderna em Java e servem como base para recursos como **Programação Funcional**, **Streams**, **Method References** e diversas operações com Collections.

---

## Revisando: Classes Anônimas

Antes das Expressões Lambda, era comum implementar interfaces utilizando classes anônimas.

```java
interface Operacao {
    int calcular(int a, int b);
}

Operacao soma = new Operacao() {

    @Override
    public int calcular(int a, int b) {
        return a + b;
    }
};
```

Embora funcione, essa abordagem gera bastante código para uma tarefa simples.

---

## O que é uma Expressão Lambda?

Uma expressão lambda é uma forma reduzida de fornecer a implementação de um método abstrato de uma interface funcional.

O código anterior pode ser escrito assim:

```java
Operacao soma = (a, b) -> a + b;
```

O comportamento é o mesmo, mas o código fica muito mais simples.

---

## Sintaxe

Forma básica:

```java
(parametros) -> expressao
```

ou

```java
(parametros) -> {
    bloco de codigo
}
```

Exemplo:

```java
(a, b) -> a + b
```

---

## Estrutura da Lambda

A expressão:

```java
(a, b) -> a + b
```

possui:

- `(a, b)` → parâmetros
- `->` → operador lambda
- `a + b` → implementação do método

---

## Formas de Escrita

### Sem parâmetros

```java
() -> System.out.println("Olá");
```

---

### Um parâmetro

```java
x -> x * 2
```

ou

```java
(x) -> x * 2
```

---

### Vários parâmetros

```java
(a, b) -> a + b
```

---

### Bloco de código

```java
(a, b) -> {

    int resultado = a + b;

    return resultado;
};
```

Quando existe mais de uma instrução, as chaves são obrigatórias.

---

## Inferência de Tipos

O compilador geralmente consegue descobrir os tipos automaticamente.

Por isso:

```java
(a, b) -> a + b
```

é equivalente a:

```java
(int a, int b) -> a + b
```

Na maioria dos casos, informar os tipos é desnecessário.

---

## Interface Funcional

Lambdas funcionam apenas com interfaces funcionais.

Uma interface funcional possui exatamente um método abstrato.

```java
@FunctionalInterface
interface Operacao {

    int calcular(int a, int b);
}
```

A anotação `@FunctionalInterface` não é obrigatória, mas ajuda a evitar erros.

---

## Métodos Default e Static

Uma interface funcional pode possuir métodos `default` e `static`.

O importante é existir apenas um método abstrato.

```java
@FunctionalInterface
interface Operacao {

    int calcular(int a, int b);

    default void mostrar() {
    }

    static void teste() {
    }
}
```

---

## Variáveis Externas

Uma lambda pode acessar variáveis definidas fora dela.

```java
int bonus = 10;

Operacao soma = x -> x + bonus;
```

---

## Regra da Variável Efetivamente Final

Variáveis locais utilizadas dentro de lambdas devem ser:

- `final`
- ou efetivamente finais

Exemplo válido:

```java
int bonus = 10;

x -> x + bonus;
```

Exemplo inválido:

```java
int bonus = 10;

bonus++;

x -> x + bonus;
```

Nesse caso ocorre erro de compilação.

---

## Uso com Collections

Um dos usos mais comuns de lambdas é percorrer coleções.

```java
ArrayList<String> nomes = new ArrayList<>();

nomes.add("Ana");
nomes.add("Carlos");
nomes.add("Maria");

nomes.forEach(nome ->
    System.out.println(nome)
);
```

---

## Onde Lambdas São Utilizadas?

Você encontrará expressões lambda frequentemente em:

- Collections
- Streams
- Comparator
- Threads
- Eventos JavaFX
- APIs modernas do Java

---

## O que a Lambda NÃO Faz

É importante entender que uma lambda:

- Não cria um novo método
- Não cria uma nova interface
- Não substitui orientação a objetos

Ela apenas fornece uma implementação para o método abstrato de uma interface funcional.

---

## Relação com Programação Funcional

As expressões lambda foram introduzidas para permitir que Java adotasse conceitos de Programação Funcional.

Na próxima seção serão estudados:

- Interfaces Funcionais
- Programação Funcional
- Interfaces do pacote `java.util.function`

---

## Boas Práticas

- Utilize lambdas quando melhorarem a legibilidade.
- Evite blocos muito grandes dentro da lambda.
- Prefira nomes claros para os parâmetros.
- Use Method References quando deixarem o código mais simples.
- Não transforme toda lógica em lambdas apenas porque é possível.

---

## Resumo

Expressões Lambda foram introduzidas no Java 8 para permitir a implementação de métodos de interfaces funcionais de forma concisa.

Elas reduzem código repetitivo, aumentam a legibilidade e são amplamente utilizadas em Collections, Streams, Threads e diversas APIs modernas do Java.
