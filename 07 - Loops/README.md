# 07 - Loops

## Objetivo

Esta seção apresenta as estruturas de repetição (loops) em Java, utilizadas para executar um bloco de código várias vezes de forma controlada.

Loops são fundamentais para automatizar tarefas repetitivas e percorrer coleções de dados.

---

# O que são Loops?

Loops permitem repetir a execução de um bloco de código enquanto uma condição for verdadeira ou até que uma condição seja atingida.

---

# Tipos de Loops em Java

Em Java, os principais loops são:

- `for`
- `while`
- `do while`

---

# Loop FOR

Usado quando já se 'sabe' o número de repetições.

## Estrutura:

```java
for (inicialização; condição; incremento) {
    // código a ser repetido
}
```

## Exemplo:

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Valor de i: " + i);
}
```

---

# Loop WHILE

Executa enquanto a condição for verdadeira.

## Estrutura:

```java
while (condição) {
    // código
}
```

## Exemplo:

```java
int i = 0;

while (i < 5) {
    System.out.println(i);
    i++;
}
```

---

# Loop DO WHILE

Executa pelo menos uma vez, mesmo se a condição for falsa.

## Estrutura:

```java
do {
    // código
} while (condição);
```

## Exemplo:

```java
int i = 0;

do {
    System.out.println(i);
    i++;
} while (i < 5);
```

---

# Controle de Loops

Java permite controlar o fluxo dentro de loops com:

- `break`
- `continue`

---

# BREAK

Interrompe completamente o loop.

## Exemplo:

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
}
```

O loop para quando `i == 5`.

---

# CONTINUE

Pula a iteração atual e vai para a próxima.

## Exemplo:

```java
for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue;
    }
    System.out.println(i);
}
```

O valor `2` não será impresso.

---

# Diferença entre BREAK e CONTINUE

- `break` → sai do loop completamente
- `continue` → pula apenas a iteração atual

---

# Observações Importantes

- `for` é ideal quando o número de repetições é conhecido.
- `while` é ideal quando a condição pode mudar dinamicamente.
- `do while` garante pelo menos uma execução.
- `break` e `continue` ajudam a controlar o fluxo dentro dos loops.
- Uso excessivo de `break` pode dificultar a leitura do código.

---

# Resumo

Loops permitem repetir blocos de código de forma eficiente, e são essenciais para estruturas de repetição, processamento de listas e automação de tarefas em Java.