# Exercícios - Fundamentos da Programação Java

## Objetivo

Esta lista de exercícios tem como objetivo praticar os primeiros conceitos da linguagem Java, incluindo:

* Declaração de variáveis
* Tipos primitivos
* Atribuição de valores
* Operações matemáticas
* Saída de dados com `System.out.println()`
* Promoção automática de tipos

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

* `00 - Comentários em Java e Identificadores Válidos`
* `01 - Exemplo de Variáveis`
* `02 - Exemplo de Tipos Primitivos`
* `03 - Promoções Automáticas`
* `04 - Inferência de Tipo de Variável Local`

---

# Exercício 1 - Controle de Estoque em uma Padaria

## Cenário

Imagine que você está desenvolvendo um sistema simples para gerenciar o estoque de uma padaria.

Seu programa deverá registrar a quantidade disponível de farinha e açúcar e exibir essas informações para o usuário.

---

## Requisitos

Crie uma classe chamada:

```java
ControleEstoquePadaria
```

Dentro da classe:

1. Declare uma variável inteira para armazenar a quantidade de farinha.
2. Declare uma variável inteira para armazenar a quantidade de açúcar.
3. Atribua valores iniciais para ambas as variáveis.
4. Exiba as quantidades utilizando mensagens informativas.

---

## Resultado Esperado

O programa deve exibir as informações cadastradas de forma clara e organizada no console.

---

## O que este exercício reforça?

* Declaração de variáveis
* Utilização do tipo `int`
* Atribuição de valores
* Impressão de informações no console
* Organização básica de um programa Java

---

# Exercício 2 - Cálculo da Área de um Retângulo

## Cenário

Uma empresa precisa de um programa capaz de calcular a área de um retângulo utilizando sua largura e altura.

---

## Requisitos

Crie uma classe chamada:

```java
CalculadoraAreaRetangulo
```

Dentro da classe:

1. Declare uma variável `double` para a largura.
2. Declare uma variável `double` para a altura.
3. Atribua valores para ambas as variáveis.
4. Calcule a área utilizando a fórmula:

```text
Área = largura × altura
```

5. Exiba o resultado no console.

---

## Resultado Esperado

O programa deve calcular corretamente a área do retângulo e apresentar o resultado de forma clara ao usuário.

---

## O que este exercício reforça?

* Utilização do tipo `double`
* Operações matemáticas
* Armazenamento de resultados em variáveis
* Manipulação de dados numéricos
* Exibição de resultados no console

---

# Exercício 3 - Promoção Automática de Tipos em Java

## Cenário

Java realiza automaticamente conversões entre tipos primitivos durante operações matemáticas.

Neste exercício você irá observar esse comportamento na prática.

---

## Requisitos

Crie uma classe chamada:

```java
PromocaoAutomatica
```

Declare as seguintes variáveis:

```java
byte a;
short b;
char c;
int d;
long e;
float f;
double g;
```

Atribua valores para cada variável.

---

## Atividades

### Parte 1 - Exibição dos Valores

Exiba o valor de cada variável no console.

### Parte 2 - Operações Matemáticas

Realize algumas operações envolvendo os tipos declarados.

Exemplos:

```java
a + b;
d + e;
f + g;
```

Armazene os resultados em variáveis compatíveis.

### Parte 3 - Tipo char

Exiba o conteúdo da variável `char`.

Exemplo:

```java
System.out.println(c);
```

Observe que o tipo `char` representa caracteres individuais.

---

## Resultado Esperado

O programa deve demonstrar o comportamento da promoção automática de tipos durante operações matemáticas e exibir os resultados obtidos.

---

## O que este exercício reforça?

* Tipos primitivos
* Utilização do tipo `char`
* Operações matemáticas
* Promoção automática de tipos
* Conversões implícitas
* Compatibilidade entre tipos numéricos
* Saída de dados no console

---

## Desafio de Observação

Durante a implementação, tente responder:

* O resultado de `byte + short` continua sendo `byte`?
* Por que algumas operações precisam ser armazenadas em `int`?
* O que acontece quando um `float` é combinado com um `double`?
* Como o Java decide qual será o tipo final de uma expressão?

Não é necessário pesquisar imediatamente as respostas. Tente observar o comportamento do programa e tirar suas próprias conclusões antes de avançar.

---

# Resumo

Após concluir esta lista você terá praticado:

✅ Declaração de variáveis

✅ Tipos primitivos

✅ Operações matemáticas básicas

✅ Impressão de informações no console

✅ Utilização de `int` e `double`

✅ Promoção automática de tipos em Java

✅ Manipulação do tipo `char`

Esses conceitos formam a base necessária para os próximos tópicos do repositório.

