# 09 - Arrays

## Objetivo

Esta seção apresenta os Arrays em Java, estruturas utilizadas para armazenar múltiplos valores do mesmo tipo em uma única variável.

Arrays são uma das formas mais básicas e importantes de trabalhar com coleções de dados, servindo como base para diversas estruturas mais avançadas da linguagem.

---

# O que é um Array?

Um array é uma estrutura que permite armazenar vários elementos do mesmo tipo em posições sequenciais da memória.

Sem arrays, seria necessário criar uma variável para cada valor:

```java
String nome1 = "João";
String nome2 = "Maria";
String nome3 = "Carlos";
```

Com arrays:

```java
String[] nomes = {"João", "Maria", "Carlos"};
```

---

# Declarando Arrays

Existem diferentes formas de declarar um array.

## Declaração simples

```java
int[] numeros;
```

ou

```java
int numeros[];
```

A primeira forma é a mais utilizada atualmente.

---

# Criando um Array

Após a declaração, é necessário criar o array informando sua capacidade.

```java
int[] numeros = new int[5];
```

Neste exemplo, o array possui espaço para armazenar 5 números inteiros.

---

# Inicialização Direta

Também é possível declarar e inicializar ao mesmo tempo.

```java
int[] numeros = {10, 20, 30, 40, 50};
```

---

# Índices

Cada posição do array possui um índice.

Os índices sempre começam em zero.

Exemplo:

```java
String[] nomes = {"João", "Maria", "Carlos"};
```

Representação:

```txt
Índice    Valor
0         João
1         Maria
2         Carlos
```

---

# Acessando Elementos

Para acessar um elemento, utilizamos seu índice.

```java
String[] nomes = {"João", "Maria", "Carlos"};

System.out.println(nomes[0]);
```

Saída:

```txt
João
```

---

# Alterando Elementos

Também é possível modificar valores existentes.

```java
String[] nomes = {"João", "Maria", "Carlos"};

nomes[1] = "Ana";
```

Resultado:

```txt
João
Ana
Carlos
```

---

# Percorrendo Arrays com For

Uma das formas mais comuns de percorrer arrays é utilizando um loop `for`.

```java
int[] numeros = {10, 20, 30, 40, 50};

for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

---

# Propriedade Length

Arrays possuem a propriedade `length`, que informa sua quantidade de elementos.

```java
int[] numeros = {10, 20, 30};

System.out.println(numeros.length);
```

Saída:

```txt
3
```

---

# Enhanced For (For-Each)

Java oferece uma sintaxe simplificada para percorrer arrays.

```java
String[] nomes = {"João", "Maria", "Carlos"};

for (String nome : nomes) {
    System.out.println(nome);
}
```

Esse tipo de loop é conhecido como **for-each**.

---

# Valores Padrão

Quando um array é criado, seus elementos recebem valores padrão automaticamente.

Exemplos:

| Tipo | Valor Padrão |
|--------|--------|
| byte | 0 |
| short | 0 |
| int | 0 |
| long | 0 |
| float | 0.0 |
| double | 0.0 |
| char | '\u0000' |
| boolean | false |
| Objetos | null |

Exemplo:

```java
int[] numeros = new int[3];

System.out.println(numeros[0]);
```

Saída:

```txt
0
```

---

# Arrays de Objetos

Arrays também podem armazenar objetos.

Exemplo:

```java
Pessoa[] pessoas = new Pessoa[3];
```

Cada posição poderá armazenar uma referência para um objeto da classe `Pessoa`.

---

# Exemplo Completo

```java
public class ExemploArray {

    public static void main(String[] args) {

        int[] notas = {8, 7, 10, 9};

        for (int nota : notas) {
            System.out.println(nota);
        }
    }
}
```

Saída:

```txt
8
7
10
9
```

---

# Limitações dos Arrays

Arrays possuem tamanho fixo.

Exemplo:

```java
int[] numeros = new int[5];
```

Após a criação, não é possível aumentar ou diminuir seu tamanho.

Caso seja necessário trabalhar com tamanhos dinâmicos, normalmente utilizamos estruturas como:

```java
ArrayList
LinkedList
```

que serão estudadas posteriormente em Collections.

---

# Boas Práticas

- Utilize nomes descritivos para arrays.
- Prefira `for-each` quando não precisar do índice.
- Utilize `length` em vez de valores fixos nos loops.
- Evite acessar posições inexistentes.
- Escolha arrays quando o tamanho dos dados for conhecido previamente.

---

# Erro Comum: ArrayIndexOutOfBoundsException

Ocorre quando tentamos acessar uma posição que não existe.

Exemplo:

```java
int[] numeros = {10, 20, 30};

System.out.println(numeros[3]);
```

Erro:

```txt
ArrayIndexOutOfBoundsException
```

Os índices válidos são:

```txt
0
1
2
```

---

# Observações

- Arrays armazenam múltiplos valores do mesmo tipo.
- Os índices começam em zero.
- O tamanho é definido na criação.
- A propriedade `length` informa a quantidade de elementos.
- Arrays podem armazenar tipos primitivos ou objetos.
- São amplamente utilizados em algoritmos e estruturas de dados.

---

# Resumo

Arrays são estruturas utilizadas para armazenar múltiplos elementos do mesmo tipo em posições indexadas. Eles oferecem acesso rápido aos dados, são simples de utilizar e constituem uma das bases para o estudo de estruturas de dados mais avançadas em Java.