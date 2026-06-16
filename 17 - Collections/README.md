# 17 - Collections

## Objetivo

Esta seção apresenta o conceito de **Collections em Java**, parte do **Java Collections Framework**, utilizado para armazenar, organizar e manipular conjuntos de objetos de forma dinâmica, flexível e eficiente.

---

## O que são Collections?

Collections são estruturas prontas do Java para armazenar grupos de objetos. Elas fazem parte do pacote:

```java
java.util
```

Elas complementam os arrays e, em muitos cenários, oferecem uma alternativa mais flexível para armazenamento e manipulação de dados, oferecendo mais funcionalidades e, na maioria dos casos, sendo mais utilizados.

---

## Vantagens das Collections

- Tamanho dinâmico (cresce automaticamente)
- Métodos prontos para manipulação de dados
- Mais flexível que arrays
- Melhor organização e abstração de dados
- Facilita operações como busca, remoção e inserção
- Estruturas otimizadas para diferentes cenários de uso

---

## Array vs Collection

### Array

```java
int[] numeros = new int[10];
```

- Tamanho fixo
- Estrutura simples
- Pouca flexibilidade

---

### Collection

```java
import java.util.ArrayList;

ArrayList<Integer> numeros = new ArrayList<>();
```

- Tamanho dinâmico
- Cresce automaticamente
- Mais métodos disponíveis
- Melhor abstração e reutilização

---

## Hierarquia simplificada do Collections Framework

```text
Collection
 ├── List
 │    ├── ArrayList
 │    └── LinkedList
 │
 └── Set
      └── HashSet

Map
 └── HashMap
```

### Importante

Apesar de fazer parte do Java Collections Framework, o `Map` não herda da interface `Collection`.

Por isso, `HashMap` pertence a uma hierarquia separada das listas e conjuntos.

---

## Interface

Em Java, normalmente programamos utilizando interfaces em vez de implementações concretas.

Exemplo recomendado:

```java
import java.util.ArrayList;
import java.util.List;

List<String> nomes = new ArrayList<>();
```

Em vez de:

```java
ArrayList<String> nomes = new ArrayList<>();
```

Isso torna o código mais flexível e facilita futuras mudanças de implementação.

---

## ArrayList

O `ArrayList` é uma das Collections mais utilizadas em Java. Ele armazena elementos em sequência e permite acesso rápido por índice.

### Características

- Baseado em array dinâmico
- Acesso rápido por índice (`get`)
- Inserções e remoções no meio podem ser mais lentas
- Ideal para muitas leituras e poucas alterações estruturais

```java
import java.util.ArrayList;
import java.util.List;

List<String> nomes = new ArrayList<>();

nomes.add("João");
nomes.add("Maria");
nomes.add("Pedro");
```

---

## Métodos comuns do ArrayList

### add()

Adiciona um elemento à lista:

```java
nomes.add("Pedro");
```

### get()

Obtém um elemento pelo índice:

```java
nomes.get(0);
```

### set()

Altera um elemento existente:

```java
nomes.set(0, "Carlos");
```

### remove()

Remove um elemento:

```java
nomes.remove(0);
```

### size()

Retorna a quantidade de elementos:

```java
nomes.size();
```

### contains()

Verifica se um elemento existe na lista:

```java
nomes.contains("João");
```

---

## Percorrendo Collections

### For-each

```java
for (String nome : nomes) {
    System.out.println(nome);
}
```

### forEach

```java
nomes.forEach(System.out::println);
```

Esse segundo exemplo utiliza referências de método, recurso bastante utilizado junto com Streams e Programação Funcional.

---

## LinkedList

O `LinkedList` é uma lista baseada em nós (encadeada), onde cada elemento aponta para o próximo.

### Características

- Melhor desempenho em inserções e remoções (principalmente no início/meio)
- Acesso por índice mais lento que ArrayList
- Pode ser usada como fila (FIFO) ou deque
- Estrutura mais flexível para mudanças frequentes

```java
import java.util.LinkedList;
import java.util.List;

List<String> fila = new LinkedList<>();

fila.add("João");
fila.add("Maria");

fila.removeFirst();
```

---

## HashSet

O `HashSet` é uma coleção que não permite elementos duplicados.

### Características

- Não permite valores repetidos
- Não garante ordem dos elementos
- Muito eficiente para buscas (`contains`)
- Ideal para garantir unicidade

```java
import java.util.HashSet;
import java.util.Set;

Set<String> conjunto = new HashSet<>();

conjunto.add("Java");
conjunto.add("Java"); // ignorado

System.out.println(conjunto.contains("Java"));
```

---

## HashMap

O `HashMap` armazena dados no formato **chave → valor**.

### Características

- Cada chave é única
- Valores podem se repetir
- Acesso rápido via chave
- Muito usado em sistemas reais para associações

```java
import java.util.HashMap;
import java.util.Map;

Map<String, Integer> notas = new HashMap<>();

notas.put("Ana", 90);
notas.put("Carlos", 85);

System.out.println(notas.get("Ana"));
```

---

## Comparação rápida

| Estrutura | Permite Duplicados | Mantém Ordem | Acesso por Índice |
|------------|------------|------------|------------|
| ArrayList | Sim | Sim | Sim |
| LinkedList | Sim | Sim | Sim |
| HashSet | Não | Não | Não |
| HashMap | Chave única | Não garantida | Não |

---

## Principais Collections do Java

- **ArrayList** → lista dinâmica baseada em array
- **LinkedList** → lista encadeada eficiente para inserções e remoções
- **HashSet** → não permite elementos duplicados
- **HashMap** → estrutura chave → valor

---

## Quando usar cada Collection?

- **ArrayList** → quando há muitas leituras e acesso por índice
- **LinkedList** → quando há muitas inserções e remoções frequentes
- **HashSet** → quando é necessário evitar duplicados
- **HashMap** → quando é preciso mapear chave → valor

---

## Generics

Collections utilizam **Generics** para definir o tipo de dado armazenado.

```java
ArrayList<String> nomes;
ArrayList<Integer> numeros;
ArrayList<Double> valores;
```

Isso garante segurança de tipos e evita casts manuais.

---

## Importante

Collections trabalham com objetos, não com tipos primitivos diretamente.

### Wrappers

| Primitivo | Wrapper |
|------------|------------|
| int | Integer |
| double | Double |
| char | Character |
| boolean | Boolean |

---

## Importações comuns

```java
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

```

---

## Resumo

Collections são estruturas fundamentais do Java para armazenar e manipular grupos de objetos de forma eficiente.

O Java Collections Framework fornece diferentes implementações para diferentes necessidades, como listas, conjuntos e mapas. Escolher a estrutura adequada ajuda a tornar o código mais organizado, legível e eficiente.