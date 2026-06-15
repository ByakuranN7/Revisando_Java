# 17 - Collections

## Objetivo

Esta seção apresenta o conceito de **Collections em Java**, parte do **Java Collections Framework**, utilizado para armazenar, organizar e manipular conjuntos de objetos de forma dinâmica, flexível e eficiente.

---

## O que são Collections?

Collections são estruturas prontas do Java para armazenar grupos de objetos. Elas fazem parte do pacote:

```java
java.util
```

Elas substituem e expandem o uso de arrays tradicionais, oferecendo mais funcionalidades e flexibilidade.

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

## ArrayList

O `ArrayList` é uma das Collections mais utilizadas em Java. Ele armazena elementos em sequência e permite acesso rápido por índice.

### Características

- Baseado em array dinâmico
- Acesso rápido por índice (`get`)
- Inserções e remoções no meio podem ser mais lentas
- Ideal para muitas leituras e poucas alterações estruturais

```java
import java.util.ArrayList;

ArrayList<String> nomes = new ArrayList<>();

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

## LinkedList

O `LinkedList` é uma lista baseada em nós (encadeada), onde cada elemento aponta para o próximo.

### Características

- Melhor desempenho em inserções e remoções (principalmente no início/meio)
- Acesso por índice mais lento que ArrayList
- Pode ser usada como fila (FIFO) ou deque
- Estrutura mais flexível para mudanças frequentes

```java
import java.util.LinkedList;

LinkedList<String> fila = new LinkedList<>();

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

HashSet<String> conjunto = new HashSet<>();

conjunto.add("Java");
conjunto.add("Java"); // ignorado (duplicado)

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

HashMap<String, Integer> notas = new HashMap<>();

notas.put("Ana", 90);
notas.put("Carlos", 85);

System.out.println(notas.get("Ana"));
```

---

## Principais Collections do Java

- **ArrayList** → lista dinâmica baseada em array
- **LinkedList** → lista encadeada eficiente para inserções/remoções
- **HashSet** → não permite elementos duplicados
- **HashMap** → chave/valor

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
|----------|--------|
| int | Integer |
| double | Double |
| char | Character |
| boolean | Boolean |

---

## Importações comuns

```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
```

---

## Resumo

Collections são estruturas fundamentais do Java que substituem arrays em muitos casos, oferecendo mais flexibilidade, métodos prontos e melhor organização de dados.

Cada implementação possui um propósito específico, e escolher corretamente impacta diretamente a eficiência e a clareza do código.