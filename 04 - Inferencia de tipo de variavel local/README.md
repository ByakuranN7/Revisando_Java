# 04 - Inferência de Tipo de Variável Local

## Objetivo

Esta seção apresenta o recurso de inferência de tipo de variável local introduzido no Java 10 através da palavra-chave `var`.

A inferência de tipo permite que o compilador determine automaticamente o tipo de uma variável local com base no valor atribuído a ela durante sua declaração.

---

## O que é Inferência de Tipo?

Normalmente, ao declarar uma variável, precisamos informar explicitamente seu tipo:

```java
String nome = "Byakuran";
int idade = 25;
double altura = 1.75;
```

Com a palavra-chave `var`, o compilador é capaz de identificar o tipo automaticamente:

```java
var nome = "Guilherme";
var idade = 25;
var altura = 1.75;
```

O código continua possuindo tipagem estática, porém o tipo é inferido pelo compilador.

---

## Exemplo Básico

```java
var nome = "Maria";
var idade = 20;
var altura = 1.65;

System.out.println(nome);
System.out.println(idade);
System.out.println(altura);
```

Neste exemplo, o compilador interpreta as variáveis como:

```java
String nome = "Maria";
int idade = 20;
double altura = 1.65;
```

---

## Como o Compilador Faz a Inferência?

O tipo é determinado com base no valor atribuído à variável.

```java
var texto = "Java";      // String
var numero = 10;         // int
var preco = 15.99;       // double
var ativo = true;        // boolean
```

Após a inferência, a variável continua possuindo um tipo fixo.

Por exemplo:

```java
var nome = "Byakuran";

nome = "João"; // Correto
```

Mas:

```java
var nome = "Guilherme";

nome = 10; // Erro de compilação
```

O compilador identificou `nome` como sendo do tipo `String`.

---

## Regras de Utilização

A palavra-chave `var` pode ser utilizada apenas para variáveis locais.

Exemplo:

```java
public static void main(String[] args) {
    var mensagem = "Olá";
}
```

---

## Exemplos Inválidos

### Variável sem inicialização

```java
var nome; // Erro de compilação
```

O compilador não consegue inferir o tipo sem um valor inicial.

---

### Inicialização com null

```java
var valor = null; // Erro de compilação
```

O compilador não consegue determinar qual tipo deve ser utilizado.

---

### Atributos de classe

```java
public class Pessoa {

    var nome = "João"; // Erro de compilação

}
```

A inferência de tipo não pode ser utilizada em atributos da classe.

---

## Vantagens

- Reduz a quantidade de código escrito.
- Pode tornar declarações complexas mais legíveis.
- Evita repetição desnecessária de tipos.

Exemplo:

```java
var numeros = new ArrayList<String>();
```

Ao invés de:

```java
ArrayList<String> numeros = new ArrayList<String>();
```

---

## Observações

- O uso de `var` não torna Java uma linguagem de tipagem dinâmica.
- O tipo da variável continua sendo definido em tempo de compilação.
- O compilador apenas infere o tipo durante a declaração.
- Após a inferência, a variável passa a se comportar exatamente como uma variável declarada explicitamente.
- O uso excessivo de `var` pode reduzir a legibilidade do código quando o tipo não é facilmente identificado.

---

## Quando Utilizar?

O uso de `var` costuma ser mais útil quando o tipo da variável é evidente.

Exemplo:

```java
var listaNomes = new ArrayList<String>();
```

Por outro lado, quando o tipo não é claro, declarar explicitamente pode melhorar a legibilidade:

```java
double mediaFinal = calcularMedia();
```

Em vez de:

```java
var mediaFinal = calcularMedia();
```

---

## Resumo

A inferência de tipo através da palavra-chave `var` permite que o compilador determine automaticamente o tipo de variáveis locais com base no valor atribuído durante a declaração, reduzindo a verbosidade do código sem abrir mão da tipagem estática característica da linguagem Java.