# 19.1 - Interface Funcional e Programação Funcional

## Objetivo

Esta seção aprofunda os conceitos introduzidos pelas Expressões Lambda, apresentando as **Interfaces Funcionais** e os fundamentos da **Programação Funcional em Java**.

Esses conceitos são essenciais para compreender APIs modernas como Streams e o pacote `java.util.function`.

---

## O que é Programação Funcional?

Programação Funcional é um paradigma que trata comportamentos e funções como valores que podem ser passados, armazenados e executados.

Em Java, esse paradigma foi incorporado principalmente a partir do Java 8.

Ao utilizar:

- Expressões Lambda
- Method References
- Streams
- Interfaces Funcionais

você está aplicando conceitos de Programação Funcional.

---

## O que é uma Interface Funcional?

Uma interface funcional é uma interface que possui apenas um método abstrato.

Exemplo:

```java
@FunctionalInterface
interface Operacao {

    int calcular(int a, int b);
}
```

Essas interfaces foram criadas para servir como alvo para Expressões Lambda.

---

## @FunctionalInterface

A anotação:

```java
@FunctionalInterface
```

é opcional, mas extremamente recomendada.

Ela informa ao compilador que aquela interface deve possuir apenas um método abstrato.

```java
@FunctionalInterface
interface Operacao {

    int calcular(int a, int b);
}
```

Se outro método abstrato for adicionado, ocorrerá erro de compilação.

---

## Exemplo Sem Lambda

```java
Operacao soma = new Operacao() {

    @Override
    public int calcular(int a, int b) {
        return a + b;
    }
};
```

---

## Exemplo Com Lambda

```java
Operacao soma = (a, b) -> a + b;
```

A lambda fornece a implementação do método abstrato da interface.

---

## Regras das Interfaces Funcionais

Uma interface funcional pode possuir:

- 1 método abstrato

E também pode possuir:

- métodos default
- métodos static
- métodos herdados de Object

---

## Exemplo Válido

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

Continua sendo funcional porque existe apenas um método abstrato.

---

## Exemplo Inválido

```java
@FunctionalInterface
interface Operacao {

    int somar(int a, int b);

    int multiplicar(int a, int b);
}
```

Existem dois métodos abstratos.

Portanto, não é uma interface funcional.

---

## Métodos Herdados de Object

Métodos herdados da classe Object não contam como métodos abstratos adicionais.

```java
@FunctionalInterface
interface Pessoa {

    void falar();

    String toString();
}
```

Essa interface continua sendo funcional.

---

## Interfaces Funcionais Prontas

Java fornece diversas interfaces funcionais no pacote:

```java
java.util.function
```


```java
java.util.function
```

Essas interfaces representam comportamentos muito comuns e são amplamente utilizadas por APIs modernas do Java, principalmente Streams.

Neste momento, o importante é entender **o que elas representam** e saber que elas existem. Você provavelmente só começará a utilizá-las frequentemente quando estudar Streams.

---

## Predicate<T>

Representa uma verificação.

Recebe um valor e responde com `true` ou `false`.

Exemplo:

```java
Predicate<Integer> maiorDeIdade =
        idade -> idade >= 18;

System.out.println(maiorDeIdade.test(20));
```

Saída:

```text
true
```

Podemos pensar em um `Predicate` como uma pergunta:

```text
"Esse valor atende uma condição?"
```

Outros exemplos:

```text
O número é par?
O usuário é maior de idade?
O texto está vazio?
O produto está em estoque?
```

---

## Function<T, R>

Representa uma transformação.

Recebe um valor e devolve outro.

Exemplo:

```java
Function<String, Integer> tamanho =
        texto -> texto.length();

System.out.println(tamanho.apply("Java"));
```

Saída:

```text
4
```

Podemos pensar em uma `Function` como:

```text
"Pego uma informação e transformo em outra."
```

Outros exemplos:

```text
Nome -> quantidade de caracteres

Produto -> preço

Pessoa -> nome

Data -> texto formatado

Temperatura em Celsius -> Fahrenheit

Texto -> texto em maiúsculo
```

Sempre que um dado entra e outro sai, provavelmente estamos diante de uma Function.

---

## Consumer<T>

Representa uma ação.

Recebe um valor e não retorna nada.

Exemplo:

```java
Consumer<String> imprimir =
        texto -> System.out.println(texto);

imprimir.accept("Olá");
```

Saída:

```text
Olá
```

Podemos pensar em um `Consumer` como:

```text
"Recebo algo e faço alguma ação com isso."
```

Outros exemplos:

```text
Receber um texto e imprimir

Receber um usuário e salvar no banco

Receber uma mensagem e enviar por e-mail

Receber um produto e registrar em log
```

O foco não é produzir um resultado, mas executar alguma ação.

---

## Supplier<T>

Representa um fornecedor de valores.

Não recebe parâmetros e retorna um resultado.

Exemplo:

```java
Supplier<Double> aleatorio =
        () -> Math.random();

System.out.println(aleatorio.get());
```

Saída:

```text
0.7348291
```

Podemos pensar em um `Supplier` como:

```text
"Quando alguém pedir, eu forneço um valor."
```

Outros exemplos:

```text
Gerar um número aleatório

Fornecer a data atual

Criar um novo objeto

Gerar um ID único

Ler uma configuração do sistema
```

O valor só é produzido quando solicitado.

---

## Não se preocupe em decorar

Neste momento, não é necessário decorar essas interfaces nem seus métodos.

O mais importante é entender que:

- `Predicate` verifica algo
- `Function` transforma algo
- `Consumer` executa uma ação
- `Supplier` fornece um valor

Conforme você estudar Streams e APIs mais modernas do Java, verá essas interfaces aparecendo naturalmente em diversos exemplos.
---

## Relação com Collections

Interfaces funcionais aparecem frequentemente ao trabalhar com Collections.

```java
nomes.forEach(nome ->
    System.out.println(nome)
);
```

Nesse exemplo existe uma interface funcional por trás do método `forEach`.

Mesmo quando não parece, as lambdas sempre estão associadas a uma interface funcional.

---

## Benefícios da Programação Funcional

- Menos código repetitivo
- Maior legibilidade
- Código mais declarativo
- Melhor integração com Streams
- Facilidade para processar coleções

---

## Boas Práticas

- Utilize `@FunctionalInterface` sempre que possível.
- Prefira as interfaces prontas de `java.util.function` antes de criar novas.
- Mantenha lambdas simples e objetivas.
- Evite lógica excessivamente complexa dentro de expressões lambda.

---

## Resumo

Interfaces funcionais são interfaces que possuem apenas um método abstrato e servem como base para Expressões Lambda.

Elas são fundamentais para a Programação Funcional em Java e aparecem constantemente em Streams, Collections e APIs modernas da linguagem.