# Exercícios - Operadores

## Objetivo

Esta lista de exercícios tem como objetivo praticar os operadores da linguagem Java, incluindo:

* Operadores aritméticos
* Operadores de atribuição
* Operadores de incremento e decremento
* Precedência de operadores
* Manipulação de valores numéricos
* Avaliação de expressões

---

> [!IMPORTANT]
> Estes exercícios foram criados para praticar os conteúdos estudados até este ponto do repositório.
>
> Mesmo que você já conheça recursos mais avançados da linguagem, o ideal é resolver os problemas utilizando apenas os conceitos apresentados até aqui.
>
> O objetivo é consolidar os fundamentos da linguagem antes de avançar para tópicos mais complexos.

---

## Conteúdos Relacionados

Esta lista está diretamente relacionada às seguintes seções do repositório:

* `05 - Operadores` e anteriores

---

# Exercício 1 - Calculadora Simples

## Cenário

Você foi encarregado de criar uma calculadora básica, sem interface, capaz de realizar operações matemáticas utilizando dois números inteiros.

O objetivo é praticar os principais operadores aritméticos disponíveis em Java.

---

## Requisitos

Crie uma classe chamada:

```java
CalculadoraSimples
```

Dentro da classe:

1. Declare duas variáveis inteiras chamadas `a` e `b`.
2. Atribua valores para ambas as variáveis.
3. Calcule os seguintes resultados:

   * Soma
   * Subtração
   * Multiplicação
   * Divisão
   * Resto da divisão
4. Exiba todos os resultados no console.

---

## Resultado Esperado

O programa deve calcular corretamente todas as operações e exibir os resultados de forma organizada.

---

## O que este exercício reforça?

* Operador de soma (`+`)
* Operador de subtração (`-`)
* Operador de multiplicação (`*`)
* Operador de divisão (`/`)
* Operador de resto (`%`)
* Armazenamento de resultados em variáveis
* Impressão de informações no console

---

# Exercício 2 - Operadores de Atribuição

## Cenário

Em muitos programas é necessário alterar o valor de uma variável várias vezes durante sua execução.

Neste exercício você irá praticar os operadores de atribuição combinados com operações matemáticas.

---

## Requisitos

1. Declare uma variável inteira chamada:

```java
numero
```

2. Inicialize a variável com um valor à sua escolha.
3. Utilize os seguintes operadores:

   * `+=`
   * `-=`
   * `*=`
   * `/=`
4. Modifique o valor da variável utilizando cada operador.
5. Exiba o valor final no console.

---

## Resultado Esperado

O programa deve demonstrar que o valor da variável é alterado progressivamente conforme cada operador de atribuição é utilizado.

---

## O que este exercício reforça?

* Operadores de atribuição
* Atualização de variáveis
* Operações matemáticas encadeadas
* Leitura e interpretação de expressões
* Manipulação de valores inteiros

---

# Exercício 3 - Incremento e Decremento

## Cenário

Os operadores de incremento e decremento são amplamente utilizados para aumentar ou diminuir valores de forma simples e direta.

Neste exercício você irá praticar esses operadores.

---

## Requisitos

1. Declare uma variável inteira chamada:

```java
contador
```

2. Inicialize a variável com o valor `5`.
3. Utilize o operador de incremento para aumentar seu valor em uma unidade.
4. Utilize o operador de decremento para reduzir seu valor em uma unidade.
5. Exiba o valor final da variável.

---

## Resultado Esperado

O programa deve demonstrar o funcionamento dos operadores de incremento e decremento através da alteração do valor da variável.

---

## O que este exercício reforça?

* Operador de incremento (`++`)
* Operador de decremento (`--`)
* Alteração de variáveis numéricas
* Manipulação de contadores
* Operações simples de atualização de valores

---

# Exercício 4 - Precedência de Operadores de Incremento e Decremento

## Cenário

Além de incrementar e decrementar valores, Java permite que esses operadores sejam utilizados antes ou depois da variável.

A posição do operador altera o momento em que a operação acontece, produzindo resultados diferentes.

---

## Requisitos

Crie uma classe chamada:

```java
PrecedenciaOperadoresAtribuicao
```

Dentro da classe:

1. Declare uma variável inteira chamada:

```java
numero
```

2. Inicialize a variável com um valor à sua escolha.
3. Teste as seguintes operações:

   * Pré-incremento (`++var`)
   * Pós-incremento (`var++`)
   * Pré-decremento (`--var`)
   * Pós-decremento (`var--`)
4. Exiba os resultados obtidos em cada operação.

---

## Resultado Esperado

O programa deve demonstrar que a posição do operador influencia o valor utilizado na expressão.

---

## O que este exercício reforça?

* Pré-incremento
* Pós-incremento
* Pré-decremento
* Pós-decremento
* Ordem de avaliação de expressões
* Precedência de operadores
* Observação do comportamento do programa

---

## Desafio de Observação

Durante a implementação, tente responder:

* Qual a diferença entre `++numero` e `numero++`?
* Em que momento ocorre o incremento no pré-incremento?
* Em que momento ocorre o incremento no pós-incremento?
* O mesmo comportamento acontece com os operadores de decremento?
* Por que duas expressões aparentemente semelhantes podem produzir resultados diferentes?

Não é necessário pesquisar imediatamente as respostas. Tente observar o comportamento do programa e tirar suas próprias conclusões antes de avançar.

---

# Resumo

Após concluir esta lista você terá praticado:

✅ Operadores aritméticos

✅ Operadores de atribuição

✅ Operadores de incremento e decremento

✅ Precedência de operadores

✅ Manipulação de variáveis numéricas

✅ Avaliação de expressões

✅ Impressão de resultados no console

Esses conceitos serão fundamentais para a construção de estruturas de decisão, loops e algoritmos mais complexos nos próximos tópicos do repositório.
