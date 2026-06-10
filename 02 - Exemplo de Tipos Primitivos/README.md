# 02 - Exemplo de Tipos Primitivos

## Objetivo

Esta seção apresenta os tipos primitivos disponíveis em Java.

Tipos primitivos são os tipos de dados básicos da linguagem e são utilizados para armazenar valores simples, como números, caracteres e valores lógicos.

---

## Tipos Primitivos

Java possui 8 tipos primitivos:

| Tipo | Faixa de Valores | Exemplo |
|--------|--------|--------|
| `byte` | -128 até 127 | `byte idade = 25;` |
| `short` | -32.768 até 32.767 | `short populacao = 1000;` |
| `int` | -2.147.483.648 até 2.147.483.647 | `int ano = 2025;` |
| `long` | -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807 | `long distancia = 100000L;` |
| `float` | ±1.4E-45 a ±3.4028235E38 | `float altura = 1.75f;` |
| `double` | ±4.9E-324 a ±1.7976931348623157E308. | `double peso = 72.5;` |
| `char` | 0 até 65.535 (caracteres Unicode) | `char letra = 'A';` |
| `boolean` | `true` ou `false` | `boolean ativo = true;` |

---

## Exemplo Básico

```java
int idade = 25;
double altura = 1.75;
char letra = 'A';
boolean ativo = true;

System.out.println(idade);
System.out.println(altura);
System.out.println(letra);
System.out.println(ativo);
```

---

## Observações

- Tipos primitivos armazenam valores simples diretamente na memória.
- Cada tipo possui uma faixa de valores específica.
- `float` utiliza o sufixo `f`.
- `long` pode utilizar o sufixo `L`.
- `char` utiliza aspas simples (`' '`).
- `boolean` armazena apenas `true` ou `false`.
- Tipos primitivos não possuem métodos, pois não são objetos.
- `String` não é um tipo primitivo, mas sim uma classe da linguagem Java.

Exemplo:

```java
String nome = "Byakuran";
```