# 03 - Promoções Automáticas

## Objetivo

Esta seção apresenta o conceito de promoções automáticas (*automatic type promotion*) em Java.

Promoções automáticas acontecem quando a linguagem converte automaticamente um tipo de dado para outro compatível durante expressões e operações matemáticas.

---

## O que são Promoções Automáticas?

Durante uma operação, Java pode promover tipos menores para tipos maiores para evitar perda de informação.

Exemplos:

- `byte` → `short`
- `short` → `int`
- `char` → `int`
- `int` → `long`
- `long` → `float`
- `float` → `double`

---

## Regras Básicas

### byte, short e char são promovidos para int

Quando utilizados em expressões aritméticas, os tipos `byte`, `short` e `char` são promovidos automaticamente para `int`.

```java
byte a = 10;
int b = a + 5; // a é promovido para int antes do cálculo
```

---

### Se um operando é long, o outro é promovido para long

```java
int a = 10;
long b = 15L;

long c = a + b; // a é promovido para long antes do cálculo
```

---

### Se um operando é float, o outro é promovido para float

```java
int a = 10;
float b = 1.5f;

float c = a * b; // a é promovido para float antes do cálculo
```

---

### Se um operando é double, o outro é promovido para double

```java
int a = 10;
double b = 1.5;

double c = a * b; // a é promovido para double antes do cálculo
```

---

## Exemplo Básico

```java
byte numero1 = 10;
byte numero2 = 20;

int resultado = numero1 + numero2;

System.out.println(resultado);
```

Mesmo que as duas variáveis sejam do tipo `byte`, o resultado da operação será promovido para `int`.

---

## Hierarquia de Promoção

Quando necessário, Java realiza as promoções seguindo a seguinte ordem:

```txt
byte
  ↓
short
  ↓
int
  ↓
long
  ↓
float
  ↓
double
```

O tipo resultante da expressão será o tipo de maior capacidade envolvido na operação.

---

## Exemplo com Diferentes Tipos

```java
int idade = 25;
double altura = 1.75;

double resultado = idade + altura;

System.out.println(resultado);
```

Neste caso, o valor de `idade` é promovido automaticamente para `double` antes da operação ser realizada.

---

## Observações

- Operações envolvendo `byte`, `short` e `char` produzem um resultado do tipo `int`.
- Promoções automáticas ocorrem apenas entre tipos compatíveis.
- A promoção automática evita perda de precisão durante cálculos.
- Nem toda conversão é automática. Em alguns casos é necessário utilizar *casting*.
- O tipo resultante de uma expressão será, em geral, o tipo de maior capacidade presente na operação.

Exemplo de conversão explícita:

```java
double valor = 10.5;
int inteiro = (int) valor;
```

Neste caso ocorre perda da parte decimal do número.

---

## Exemplo de Erro Comum

```java
byte numero1 = 10;
byte numero2 = 20;

byte resultado = numero1 + numero2; // Erro de compilação
```

O erro ocorre porque a soma de dois valores `byte` gera um resultado do tipo `int`.

A forma correta seria:

```java
int resultado = numero1 + numero2;
```

ou, se tem certeza que o resultado cabe em byte:

```java
byte resultado = (byte) (numero1 + numero2);
```