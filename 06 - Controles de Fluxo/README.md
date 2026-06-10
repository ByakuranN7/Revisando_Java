# 06 - Controles de Fluxo

## Objetivo

Esta seção apresenta os principais controles de fluxo da linguagem Java, responsáveis por definir **o caminho de execução do programa** com base em condições.

Com eles, é possível tomar decisões, executar blocos de código diferentes e controlar o comportamento da aplicação.

---

# O que são Controles de Fluxo?

Controles de fluxo são estruturas que determinam como e quando determinadas partes do código serão executadas.

Eles permitem que o programa “decida” o que fazer em tempo de execução.

---

# Estruturas de Controle de Fluxo

Em Java, os principais controles de fluxo são:

- `if`
- `else`
- `else if`
- `switch`

---

# Estrutura IF

Usada para executar um bloco de código **somente se uma condição for verdadeira**.

## Exemplo:

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Maior de idade");
}
```

---

# Estrutura IF-ELSE

Permite definir um caminho alternativo caso a condição seja falsa.

## Exemplo:

```java
int idade = 16;

if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

---

# Estrutura ELSE IF

Usada quando existem múltiplas condições.

## Exemplo:

```java
int nota = 7;

if (nota >= 9) {
    System.out.println("Excelente");
} else if (nota >= 7) {
    System.out.println("Bom");
} else {
    System.out.println("Reprovado");
}
```

---

# Estrutura SWITCH

Usada para comparar uma variável com múltiplos valores possíveis.

## Exemplo:

```java
int dia = 3;

switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda");
        break;
    case 3:
        System.out.println("Terça");
        break;
    default:
        System.out.println("Dia inválido");
}
```

---

# Importância do BREAK

O `break` impede que o código continue executando os próximos casos do `switch`.

Sem ele, ocorre o chamado **fall-through** (execução em sequência).

---

# Operadores em Controles de Fluxo

Controles de fluxo geralmente utilizam operadores:

- Comparação (`==`, `!=`, `>`, `<`, `>=`, `<=`)
- Lógicos (`&&`, `||`, `!`)

## Exemplo:

```java
int idade = 20;

if (idade >= 18 && idade < 60) {
    System.out.println("Adulto");
}
```

---

# instanceof

O operador `instanceof` verifica se um objeto é de um determinado tipo.

Ele é muito usado antes de fazer cast (conversão de tipo).

## Exemplo:

```java
Object obj = "Java";

if (obj instanceof String) {
    System.out.println("É uma String");
}
```

---

## Exemplo com cast seguro:

```java
Object obj = "Java";

if (obj instanceof String) {
    String texto = (String) obj;
    System.out.println(texto.toUpperCase());
}
```

---

# Observações Importantes

- `if` avalia condições booleanas.
- `else` é executado quando a condição do `if` é falsa.
- `else if` permite múltiplas verificações.
- `switch` é mais organizado quando há muitos casos fixos.
- O uso correto dos controles de fluxo é essencial para lógica de programação.

---

# Resumo

Controles de fluxo permitem controlar a execução do programa com base em condições, tornando possível criar decisões e comportamentos dinâmicos em Java.