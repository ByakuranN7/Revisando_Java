# Exercícios - Controles de Fluxo

## Objetivo

Esta lista de exercícios tem como objetivo praticar as estruturas de controle de fluxo da linguagem Java, incluindo:

* Estruturas condicionais `if` e `else`
* Operadores relacionais
* Operadores lógicos
* Estrutura `switch`
* Switch legacy (tradicional)
* Switch expression
* Avaliação de condições
* Tomada de decisões em programas

---

> [!IMPORTANT]
> Estes exercícios foram criados para praticar os conteúdos estudados até este ponto do repositório.
>
> Mesmo que você já conheça recursos mais avançados da linguagem, o ideal é resolver os problemas utilizando apenas os conceitos apresentados até aqui.
>
> O objetivo é consolidar os fundamentos da linguagem antes de avançar para tópicos mais complexos.

---

## Conteúdos Relacionados

Esta lista está relacionada principalmente à seção:

- `06 - Controles de Fluxo`

Além disso, utiliza conhecimentos adquiridos nas seções anteriores do repositório.
---

# Exercício 1 - Verificação de Número Par

## Cenário

Diversos programas precisam identificar se um número é par ou ímpar.

Uma das formas mais comuns de realizar essa verificação é utilizando o operador de resto da divisão (`%`).

---

## Requisitos

1. Declare uma variável inteira para armazenar um número.
2. Atribua um valor à variável.
3. Utilize o operador `%` para verificar se o número é divisível por `2`.
4. Exiba uma mensagem informando se o número é par ou ímpar.

---

## Resultado Esperado

O programa deve identificar corretamente se o número informado é par ou ímpar e exibir uma mensagem adequada no console.

---

## O que este exercício reforça?

* Operador de resto (`%`)
* Estrutura `if`
* Estrutura `else`
* Comparações numéricas
* Tomada de decisão

---

# Exercício 2 - Determinando o Nível de Satisfação

## Cenário

Uma empresa deseja registrar a satisfação de seus clientes através de uma escala de 1 a 5.

Seu programa deverá interpretar o valor informado e exibir o feedback correspondente.

---

## Requisitos

1. Declare uma variável inteira chamada:

```java
nivel
```

2. Utilize uma estrutura `switch expression` (com `->`) para avaliar seu valor.
3. Exiba o feedback correspondente:

   * 1 → Muito insatisfeito
   * 2 → Insatisfeito
   * 3 → Neutro
   * 4 → Satisfeito
   * 5 → Muito satisfeito
4. Caso o valor seja inválido, exiba uma mensagem apropriada.

---

## Resultado Esperado

O programa deve exibir o nível de satisfação correspondente ao valor informado.

---

## O que este exercício reforça?

* Switch expression
* Avaliação de múltiplos cenários
* Controle de fluxo
* Organização de código
* Tratamento de valores inválidos

---

# Exercício 3 - Verificador de Mês

## Cenário

Você precisa criar um programa capaz de identificar o nome de um mês com base em seu número correspondente.

---

## Requisitos

1. Crie uma variável chamada:

```java
mes
```

2. Armazene um valor entre `1` e `12`.
3. Utilize o `switch` tradicional (legacy).
4. Exiba o nome do mês correspondente.
5. Utilize `break` nos casos necessários.

---

## Resultado Esperado

O programa deve exibir corretamente o nome do mês correspondente ao número informado.

---

## O que este exercício reforça?

* Switch tradicional
* Utilização de `break`
* Associação entre valores e resultados
* Controle de fluxo
* Estruturas de decisão

---

# Exercício 4 - Número de Dias no Mês

## Cenário

Nem todos os meses possuem a mesma quantidade de dias.

Neste exercício você deverá identificar quantos dias existem em determinado mês.

---

## Requisitos

Crie uma classe chamada:

```java
DiasNoMes
```

Dentro da classe:

1. Declare uma variável chamada:

```java
mes
```

2. Armazene o nome de um mês.
3. Utilize um bloco `switch`.
4. Determine a quantidade de dias correspondente ao mês informado.
5. Caso o valor não corresponda a um mês válido, exiba uma mensagem apropriada.

---

## Resultado Esperado

O programa deve exibir corretamente a quantidade de dias do mês informado ou indicar quando o valor for inválido.

---

## O que este exercício reforça?

* Agrupamento de casos em `switch`
* Comparação de Strings
* Estruturas de decisão
* Organização de múltiplos cenários
* Tratamento de entradas inválidas

---

# Exercício 5 - Verificação de Aprovação Simplificada

## Cenário

Uma escola precisa determinar se um aluno foi aprovado com base na média de duas notas.

---

## Requisitos

1. Declare duas variáveis inteiras:

   * `nota1`
   * `nota2`
2. Atribua valores às notas.
3. Calcule a média das duas notas.
4. Considere aprovado o aluno cuja média seja maior ou igual a `6`.
5. Utilize operadores lógicos e relacionais para realizar a verificação.
6. Exiba o resultado no console.

---

## Resultado Esperado

O programa deve informar corretamente se o aluno foi aprovado ou reprovado com base na média calculada.

---

## O que este exercício reforça?

* Operadores relacionais
* Operadores lógicos
* Cálculo de média
* Estruturas condicionais
* Avaliação de expressões booleanas

---

# Exercício 6 - Verificação de Aprovação com Base em Notas e Presença

## Cenário

Agora a aprovação do aluno depende não apenas da média das notas, mas também de sua frequência nas aulas.

---

## Requisitos

1. Declare três variáveis inteiras:

   * `nota1`
   * `nota2`
   * `frequencia`
2. Atribua valores às variáveis.
3. Calcule a média das notas.
4. Considere aprovado o aluno que:

   * Possuir média maior ou igual a `7`.
   * Possuir frequência maior ou igual a `75`.
5. Utilize operadores lógicos para verificar ambas as condições.
6. Exiba uma mensagem indicando se o aluno foi aprovado ou reprovado.

---

## Resultado Esperado

O programa deve verificar simultaneamente as condições de nota e frequência e informar corretamente o resultado final.

---

## O que este exercício reforça?

* Operador lógico AND (`&&`)
* Operadores relacionais
* Avaliação de múltiplas condições
* Estruturas condicionais
* Regras de negócio simples

---

## Desafio de Observação

Durante a implementação, tente responder:

* Quando utilizar `if` e quando utilizar `switch`?
* Quais situações ficam mais organizadas utilizando `switch`?
* Qual a diferença entre o switch tradicional e o switch expression?
* O que acontece quando uma condição lógica utiliza `&&`?
* O que mudaria se fosse utilizado `||` em vez de `&&`?

Não é necessário pesquisar imediatamente as respostas. Tente observar o comportamento do programa e tirar suas próprias conclusões antes de avançar.

---

# Resumo

Após concluir esta lista você terá praticado:

✅ Estruturas `if` e `else`

✅ Operadores relacionais

✅ Operadores lógicos

✅ Switch tradicional (legacy)

✅ Switch expression

✅ Avaliação de múltiplas condições

✅ Comparação de valores e Strings

✅ Tomada de decisões em programas Java

Esses conceitos serão fundamentais para a construção de algoritmos mais complexos e para o uso eficiente das estruturas de controle estudadas nas próximas seções do repositório.
