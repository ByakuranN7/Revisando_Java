# 16 - Generics

## Objetivo

Esta seção apresenta o conceito de **Generics** em Java, que permite criar classes, interfaces e métodos capazes de trabalhar com diferentes tipos de dados de forma segura e reutilizável.

Generics aumentam a segurança do código ao evitar erros de tipo em tempo de execução, transferindo esses erros para o tempo de compilação.

---

# O que são Generics?

Generics permitem que você escreva código que funciona com diferentes tipos, sem precisar duplicar lógica.

Em vez de fixar um tipo específico, usamos um **parâmetro de tipo**. É como se você tivesse uma caixa onde você pode colocar coisas dentro, mas você decide que tipo de coisas você quer colocar nela.

---

# Sintaxe Básica

O símbolo mais comum é:

```java
<T>
```

Onde `T` representa um tipo genérico (Type).

Exemplo:

```java
class Caixa<T> {

    T valor;
}
```

Aqui, `T` pode ser qualquer tipo definido quando a classe for usada.

---

# Exemplo Prático

```java
class Caixa<T> {

    T valor;

    void guardar(T valor) {
        this.valor = valor;
    }

    T pegar() {
        return valor;
    }
}
```

### Uso:

```java
Caixa<String> caixaTexto = new Caixa<>();

caixaTexto.guardar("Olá");

String texto = caixaTexto.pegar();
```

Neste caso, `T` foi substituído por `String`.

---

# Vantagens dos Generics

- reutilização de código
- maior segurança de tipos
- evita casts desnecessários
- erros detectados em tempo de compilação
- código mais limpo e legível

---

# Sem Generics (problema)

Antes dos generics, era comum usar coleções sem tipo definido:

```java
ArrayList lista = new ArrayList();

lista.add("João");

String nome = (String) lista.get(0);
```

### Problema:
- necessidade de cast
- risco de erro em tempo de execução

---

# Com Generics (solução)

```java
ArrayList<String> lista = new ArrayList<>();

lista.add("João");

String nome = lista.get(0);
```

### Vantagens:
- sem cast
- mais seguro
- mais legível

---

# Tipos Comuns com Generics

Alguns exemplos frequentes:

```java
ArrayList<String>
ArrayList<Integer>
HashMap<String, Integer>
```

Essas estruturas fazem parte da **Collections Framework**, que será aprofundada em outra seção.

---

# Métodos Genéricos

Além de classes, métodos também podem usar generics.

Exemplo:

```java
public <T> void imprimir(T valor) {
    System.out.println(valor);
}
```

### Uso:

```java
imprimir("Texto");
imprimir(123);
imprimir(10.5);
```

O método se adapta automaticamente ao tipo passado.

---

# Wildcard (?)

O wildcard representa um tipo desconhecido.

```java
ArrayList<?> lista;
```

Ele é usado quando não importa o tipo específico, apenas que exista uma coleção.

---

# Importante

- Generics funcionam apenas com **tipos de referência (objetos)**.
- Tipos primitivos como `int`, `double`, `char` não podem ser usados diretamente.

### Solução:

Usar Wrappers:

- `int` → `Integer`
- `double` → `Double`
- `char` → `Character`

---

# Benefícios na prática

Generics ajudam principalmente em:

- estruturas de dados (listas, mapas, conjuntos)
- APIs reutilizáveis
- bibliotecas
- código genérico e extensível

---

# Resumo

Generics permitem criar estruturas flexíveis e seguras em Java, eliminando a necessidade de casts e reduzindo erros em tempo de execução. Eles são amplamente utilizados em coleções e APIs modernas, tornando o código mais limpo, reutilizável e confiável.