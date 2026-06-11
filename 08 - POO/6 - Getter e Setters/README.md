# 08.6 - Getters e Setters

## Objetivo

Esta seção apresenta os métodos getters e setters em Java, mecanismos amplamente utilizados para acessar e modificar atributos de uma classe de forma controlada.

Getters e setters são uma das aplicações mais comuns do encapsulamento, permitindo proteger os dados internos de um objeto e controlar como eles podem ser lidos ou alterados.

---

# O que são Getters e Setters?

Getters e setters são métodos especiais utilizados para acessar e modificar atributos privados de uma classe.

Normalmente, os atributos são declarados como `private` e o acesso é realizado através desses métodos.

Exemplo:

```java
public class Funcionario {

    private String nome;
    private double salario;
}
```

Como os atributos são privados, outras classes não podem acessá-los diretamente.

Para permitir o acesso controlado, utilizamos getters e setters.

---

# Getter

Um getter é um método responsável por retornar o valor de um atributo.

Por convenção, seu nome segue o padrão:

```txt
getNomeDoAtributo()
```

## Exemplo

```java
public String getNome() {
    return nome;
}
```

Uso:

```java
Funcionario funcionario = new Funcionario();

String nome = funcionario.getNome();
```

---

# Setter

Um setter é um método responsável por alterar o valor de um atributo.

Por convenção, seu nome segue o padrão:

```txt
setNomeDoAtributo()
```

## Exemplo

```java
public void setNome(String nome) {
    this.nome = nome;
}
```

Uso:

```java
Funcionario funcionario = new Funcionario();

funcionario.setNome("João");
```

---

# Exemplo Completo

```java
public class Funcionario {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
```

Uso:

```java
Funcionario funcionario = new Funcionario();

funcionario.setNome("Maria");
funcionario.setSalario(3500.0);

System.out.println(funcionario.getNome());
System.out.println(funcionario.getSalario());
```

---

# Por que Utilizar Getters e Setters?

Eles permitem controlar o acesso aos atributos de uma classe.

Sem getters e setters:

```java
public String nome;
```

Qualquer parte do sistema pode alterar o valor livremente.

Com encapsulamento:

```java
private String nome;
```

O acesso passa a ser controlado pela própria classe.

---

# Validação com Setters

Uma das maiores vantagens dos setters é permitir validações antes de alterar um valor.

Exemplo:

```java
public void setIdade(int idade) {

    if (idade >= 0) {
        this.idade = idade;
    }
}
```

Uso:

```java
pessoa.setIdade(-10);
```

O valor não será atribuído porque a validação impede idades inválidas.

---

# Getter sem Setter

Nem todo atributo precisa possuir um setter.

Exemplo:

```java
private int codigo;
```

```java
public int getCodigo() {
    return codigo;
}
```

Nesse caso, o valor pode ser consultado, mas não alterado externamente.

Isso é útil para informações que não devem ser modificadas após a criação do objeto.

---

# Setter sem Getter

Em situações específicas, também é possível disponibilizar apenas o setter.

Exemplo:

```java
public void setSenha(String senha) {
    this.senha = senha;
}
```

Dessa forma, a senha pode ser alterada, mas não pode ser consultada diretamente.

---

# Convenção para Valores Booleanos

Para atributos booleanos, é comum utilizar o prefixo `is`.

Exemplo:

```java
private boolean ativo;
```

Getter:

```java
public boolean isAtivo() {
    return ativo;
}
```

Uso:

```java
if (usuario.isAtivo()) {
    System.out.println("Usuário ativo");
}
```

---

# Relação com Encapsulamento

O encapsulamento é um dos pilares da Programação Orientada a Objetos.

A ideia é ocultar os detalhes internos de uma classe e fornecer apenas os métodos necessários para interação.

Exemplo:

```java
private double saldo;
```

Em vez de permitir acesso direto:

```java
conta.saldo = -1000;
```

A classe controla a operação:

```java
conta.setSaldo(1000);
```

---

# Boas Práticas

- Declare atributos como `private` sempre que possível.
- Utilize getters e setters apenas quando fizer sentido.
- Realize validações nos setters quando necessário.
- Não exponha atributos diretamente sem necessidade.
- Utilize nomes seguindo o padrão JavaBeans.

Exemplos:

```java
getNome()
setNome()
getSalario()
setSalario()
isAtivo()
```

---

# Observações

- Getters retornam valores.
- Setters modificam valores.
- Eles ajudam a implementar o encapsulamento.
- Permitem validar informações antes de armazená-las.
- Nem todo atributo precisa possuir getter e setter.
- O uso excessivo de setters pode expor mais dados do que o necessário.

---

# Resumo

Getters e setters são métodos utilizados para acessar e modificar atributos de forma controlada. Eles ajudam a implementar o encapsulamento, aumentam a segurança dos dados e permitem que a própria classe controle como suas informações são utilizadas e alteradas.