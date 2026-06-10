# 00 - Comentários em Java e Identificadores Válidos

## Objetivo

Esta seção apresenta dois conceitos fundamentais da linguagem Java:

- Comentários no código
- Regras para criação de identificadores válidos

Esses conceitos são essenciais para escrever código organizado, legível e correto sintaticamente.

---

# Comentários em Java

Comentários são trechos de código ignorados pelo compilador e usados para adicionar notas, explicações ou documentação no código.

Eles ajudam na legibilidade e manutenção do código.

---

## Tipos de Comentários em Java

### 1. Comentário de linha única

Usado para explicações rápidas.

```java
// Este é um comentário de linha única
```

---

### 2. Comentário de múltiplas linhas

Usado para explicações maiores.

```java
/*
Este é um comentário
de várias linhas
*/
```

---

### 3. Comentário Javadoc

Usado para gerar documentação automática da API do código.

```java
/**
 * Este é um comentário Javadoc
 */
```

---

## Exemplo Prático de Comentários

```java
public class Exemplo {
    public static void main(String[] args) {

        // Imprime mensagem na tela
        System.out.println("Olá, Mundo!");

        /*
         Bloco de comentário explicando
         uma parte maior do código
        */

        int numero = 10;
        System.out.println("O número é " + numero);
    }
}
```

---

## Dicas sobre Comentários

- Use comentários para explicar o **porquê** do código, não o óbvio.
- Evite comentários redundantes como:
  ```java
  int x = 10; // cria uma variável x com valor 10
  ```
- Prefira código limpo e autoexplicativo em vez de excesso de comentários.
- Use Javadoc em métodos e classes públicas quando necessário.
- Comentários desatualizados são piores que ausência de comentários.

---

# Identificadores Válidos em Java

Identificadores são nomes usados para variáveis, métodos, classes e outros elementos do código.

---

## Regras para Identificadores

### 1. Caracteres permitidos

Podem conter:

- Letras (a-z, A-Z)
- Dígitos (0-9)
- Sublinhado (_)
- Cifrão ($)

❌ Não podem começar com número.

---

### 2. Sensibilidade a maiúsculas e minúsculas

Java diferencia letras maiúsculas e minúsculas:

```java
nome != Nome
```

---

### 3. Palavras reservadas

Não podem ser usadas como identificadores, como:

```java
int
class
public
static
```

---

### 4. Comprimento

Não há limite de tamanho, mas é recomendado usar nomes claros e significativos.

---

## Exemplos de Identificadores Válidos

```txt
nome
idade
salarioAnual
_temp
$id
```

---

## Exemplos de Identificadores Inválidos

```txt
123abc   // começa com número
a-b      // contém caractere inválido
class    // palavra reservada
```

---

## Convenções de Nomenclatura em Java

Java segue padrões de escrita para melhorar legibilidade e organização:

### 1. Classes

- Devem começar com letra maiúscula
- Usam PascalCase

```java
public class ContaBancaria
```

---

### 2. Variáveis e Métodos

- Devem começar com letra minúscula
- Usam camelCase

```java
int saldoTotal;
public void sacarDinheiro() {}
```

---

### 3. Constantes

- Escritas em letras maiúsculas
- Palavras separadas por underscore (_)

```java
public static final double TAXA_JUROS = 0.05;
```

---

### 4. Pacotes

- Sempre em letras minúsculas

```java
package com.meuprojeto.servicos;
```

---

## Observações

- Identificadores devem ser claros e descritivos.
- Evite nomes genéricos como `a`, `x`, `temp` (exceto em exemplos simples ou onde é padrão universal como dentro de um for).
- Classes sempre começam com letra maiúscula.
- Métodos e variáveis sempre começam com letra minúscula.
- Java é **case-sensitive** (diferencia maiúsculas de minúsculas).
- Seguir convenções não é obrigatório, mas é essencial para código profissional.