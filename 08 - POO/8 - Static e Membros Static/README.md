# 08.8 - Static e Membros Static

## Objetivo

Esta seção apresenta o modificador `static` em Java, utilizado para criar membros que pertencem à classe em vez de pertencerem a objetos individuais.

Compreender o funcionamento de membros estáticos é importante para entender como compartilhar dados e comportamentos entre todas as instâncias de uma classe.

---

# O que é Static?

O modificador `static` indica que um membro pertence à própria classe, e não aos objetos criados a partir dela.

Isso significa que não é necessário criar uma instância da classe para acessar esse membro.

Exemplo:

```java
public class Matematica {

    public static double PI = 3.14159265359;
}
```

Uso:

```java
System.out.println(Matematica.PI);
```

Observe que não foi necessário criar um objeto:

```java
Matematica matematica = new Matematica();
```

---

# Membros Estáticos

Podem ser declarados como `static`:

- Atributos
- Métodos
- Blocos de inicialização
- Classes internas (nested classes)

Os mais comuns são atributos e métodos.

---

# Atributos Static

Um atributo estático pertence à classe e é compartilhado por todos os objetos.

## Exemplo

```java
public class Funcionario {

    public static int quantidadeFuncionarios = 0;

    public Funcionario() {
        quantidadeFuncionarios++;
    }
}
```

Uso:

```java
Funcionario f1 = new Funcionario();
Funcionario f2 = new Funcionario();

System.out.println(Funcionario.quantidadeFuncionarios);
```

Saída:

```txt
2
```

---

# Compartilhamento Entre Objetos

Todos os objetos compartilham o mesmo atributo estático.

Exemplo:

```java
public class Pessoa {

    public static String empresa = "Atlus";
}
```

```java
Pessoa p1 = new Pessoa();
Pessoa p2 = new Pessoa();

p1.empresa = "Valve";

System.out.println(p2.empresa);
```

Saída:

```txt
Valve
```

Isso ocorre porque existe apenas uma cópia do atributo estático na memória.

---

# Métodos Static

Métodos estáticos também pertencem à classe.

Eles podem ser chamados sem criar objetos.

## Exemplo

```java
public class Calculadora {

    public static int somar(int a, int b) {
        return a + b;
    }
}
```

Uso:

```java
int resultado = Calculadora.somar(10, 20);
```

---

# Exemplo da Classe Math

A classe `Math` é um dos exemplos mais conhecidos de utilização de métodos estáticos.

Exemplo:

```java
double valor = Math.sqrt(25);

System.out.println(valor);
```

Saída:

```txt
5.0
```

Não é necessário criar:

```java
Math math = new Math();
```

Os métodos já pertencem à própria classe.

---

# Quando Utilizar Static?

O uso de `static` faz sentido quando o comportamento ou dado pertence à classe inteira e não a objetos específicos.

Exemplos:

- Constantes.
- Contadores globais.
- Métodos utilitários.
- Operações matemáticas.
- Conversões de unidades.

Exemplo:

```java
public static final double PI = 3.14159265359;
```

---

# Quando NÃO Utilizar Static?

Nem tudo deve ser estático.

Considere uma classe:

```java
public class Pessoa {

    private String nome;
}
```

O atributo `nome` deve pertencer a cada objeto individualmente.

Não faz sentido:

```java
private static String nome;
```

pois todas as pessoas passariam a compartilhar o mesmo nome.

---

# Problemas do Uso Excessivo de Static

Embora seja útil em diversas situações, o uso excessivo de membros estáticos pode causar problemas.

## Estado Compartilhado

Todos os objetos compartilham o mesmo valor.

Isso pode gerar comportamentos inesperados.

## Menor Aderência à POO

Java é uma linguagem orientada a objetos.

O uso excessivo de `static` reduz o aproveitamento de conceitos como:

- Encapsulamento.
- Herança.
- Polimorfismo.

## Testabilidade

Membros estáticos podem dificultar a criação de testes unitários, pois introduzem dependências globais.

## Consumo de Memória

Variáveis estáticas permanecem na memória enquanto a classe estiver carregada.

O uso inadequado pode aumentar o consumo de memória da aplicação.

---

# Acesso a Membros Static

Embora seja possível acessar membros estáticos através de objetos:

```java
Funcionario funcionario = new Funcionario();

funcionario.quantidadeFuncionarios++;
```

o recomendado é utilizar o nome da classe:

```java
Funcionario.quantidadeFuncionarios++;
```

Isso deixa claro que o membro pertence à classe.

---

# Limitações dos Métodos Static

Métodos estáticos pertencem à classe e podem ser executados sem a necessidade de criar objetos.

Por esse motivo, eles não possuem acesso direto aos atributos e métodos de instância, que pertencem a objetos específicos.

Exemplo:

```java
public class Pessoa {

    private String nome;

    public static void exibirNome() {
        System.out.println(nome); // Erro de compilação
    }
}
```

O código acima gera erro porque `nome` é um atributo de instância. Como o método `exibirNome()` pertence à classe e não a um objeto específico, o Java não sabe qual valor de `nome` deveria ser utilizado.

---

# Boas Práticas

- Utilize `static` apenas quando o membro realmente pertencer à classe.
- Prefira acessar membros estáticos pelo nome da classe.
- Evite armazenar estado global desnecessariamente.
- Não utilize `static` apenas por conveniência.
- Use métodos estáticos para operações utilitárias independentes de objetos.

---

# Observações

- Membros estáticos pertencem à classe.
- Existe apenas uma cópia de um atributo estático na memória.
- Todos os objetos compartilham membros estáticos.
- Métodos estáticos podem ser chamados sem instanciar objetos.
- Métodos estáticos não possuem acesso direto a atributos de instância.
- O uso excessivo de `static` pode prejudicar o design orientado a objetos.

---

# Resumo

O modificador `static` permite criar membros que pertencem à classe em vez de objetos individuais. Isso possibilita compartilhar dados entre instâncias e executar comportamentos sem a necessidade de criar objetos. Apesar de ser uma ferramenta poderosa, seu uso deve ser criterioso para evitar problemas de manutenção, testabilidade e organização do código.