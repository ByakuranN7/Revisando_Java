# 05 - Operadores

## Objetivo

Esta seção apresenta os principais operadores da linguagem Java, utilizados para realizar cálculos, comparações, manipulação de valores, validações lógicas e construção de lógica em programas.

Os operadores são elementos básicos da programação e estão presentes em praticamente toda lógica construída em Java. Eles são fundamentais para controlar decisões e processamentos dentro do código.

---

## Tipos de Operadores em Java

Os operadores são divididos nas seguintes categorias:

- Operadores Aritméticos  
- Operadores de Comparação (Relacionais)  
- Operadores Lógicos  
- Operadores de Atribuição  
- Operadores Unários  
- Operadores de Incremento e Decremento (subconjunto dos unuários)  

---

## Operadores Aritméticos

Utilizados para operações matemáticas básicas.

### Operadores:

- `+` adição  
- `-` subtração  
- `*` multiplicação  
- `/` divisão  
- `%` resto da divisão  

### Exemplo:

```java
int a = 10;
int b = 3;

System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3
System.out.println(a % b); // 1
```

---

## Operadores de Comparação

Retornam valores booleanos (`true` ou `false`) ao comparar dois valores.

### Operadores:

- `==` igual a  
- `!=` diferente de  
- `>` maior que  
- `<` menor que  
- `>=` maior ou igual  
- `<=` menor ou igual  

### Exemplo:

```java
int a = 10;
int b = 20;

System.out.println(a == b); // false
System.out.println(a != b); // true
System.out.println(a > b);  // false
System.out.println(a < b);  // true
System.out.println(a >= b); // false
System.out.println(a <= b); // true
```

---

## Operadores Lógicos

Utilizados para combinar expressões booleanas.

### Operadores:

- `&&` E lógico (AND)  
- `||` OU lógico (OR)  
- `!` negação (NOT)  

### Exemplo:

```java
int a = 10;
int b = 20;
boolean ativo = true;

System.out.println(a < b && ativo); // true
System.out.println(a > b || ativo); // true
System.out.println(!ativo);         // false
```

---

## Operadores de Atribuição

Usados para atribuir ou modificar valores de variáveis.

### Operadores:

- `=` atribuição  
- `+=` soma e atribui  
- `-=` subtrai e atribui  
- `*=` multiplica e atribui  
- `/=` divide e atribui  
- `%=` módulo e atribui  

### Exemplo:

```java
int a = 10;

a += 5; // a = a + 5 → 15
a -= 2; // a = a - 2 → 13
a *= 3; // a = a * 3 → 39

System.out.println(a); // 39
```

---

## Operadores Unários

Operam em um único valor.

### Operadores:

- `+` positivo  
- `-` negativo  
- `!` negação lógica  

### Exemplo:

```java
int a = 10;

// operador + não altera o valor
System.out.println(+a); // 10

// operador - inverte o sinal do número
System.out.println(-a); // -10

boolean ativo = true;

// operador ! inverte o valor booleano
System.out.println(!ativo); // false
```

---

## Incremento e Decremento

Usados para aumentar ou diminuir valores em 1.

### Operadores:

- `++` incremento  
- `--` decremento  

### Exemplo:

```java
int a = 5;

a++; // incrementa a em 1 → a passa a ser 6
a--; // decrementa a em 1 → a volta para 5
```

---

## Pré-incremento vs Pós-incremento

```java
int a = 5;

int b = ++a; // pré-incremento: primeiro 'a' vira 6, depois 'b' recebe 6
int c = a++; // pós-incremento: 'c' recebe 6, depois 'a' vira 7
```

---

## Pré-decremento vs Pós-decremento

```java
int a = 5;

int b = --a; // pré-decremento: primeiro 'a' vira 4, depois 'b' recebe 4
int c = a--; // pós-decremento: 'c' recebe 4, depois 'a' vira 3
```

---

## Observações

- Operadores aritméticos seguem regras matemáticas padrão.
- Operadores de comparação sempre retornam boolean (`true` ou `false`).
- Operadores lógicos trabalham com expressões booleanas.
- Incremento e decremento podem alterar o valor antes ou depois da avaliação da expressão.
- O uso correto dos operadores é essencial para construir lógica em Java.