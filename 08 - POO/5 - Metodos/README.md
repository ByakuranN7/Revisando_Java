# 08.5 - Métodos

## Objetivo

Esta seção apresenta os métodos em Java, estruturas responsáveis por definir os comportamentos de uma classe.

Métodos permitem organizar o código em blocos reutilizáveis, facilitando a manutenção, a leitura e o desenvolvimento de aplicações.

---

# O que é um Método?

Um método é um bloco de código que executa uma determinada tarefa.

Ele pode:

- Executar ações.
- Receber informações (parâmetros).
- Retornar resultados.
- Ser reutilizado diversas vezes.

Em Programação Orientada a Objetos, os métodos representam os comportamentos dos objetos.

---

# Estrutura de um Método

Sintaxe básica:

```java
modificador retorno nomeMetodo(parametros) {

}
```

Exemplo:

```java
public void exibirMensagem() {
    System.out.println("Olá, mundo!");
}
```

---

# Chamando um Método

Após ser declarado, o método pode ser executado através de uma chamada.

Exemplo:

```java
public class Pessoa {

    public void apresentar() {
        System.out.println("Olá!");
    }
}
```

Uso:

```java
Pessoa pessoa = new Pessoa();

pessoa.apresentar();
```

---

# Métodos Sem Retorno

Métodos que apenas executam ações utilizam o tipo `void`.

Exemplo:

```java
public void saudar() {
    System.out.println("Bem-vindo!");
}
```

Neste caso, o método não retorna nenhum valor.

---

# Métodos com Retorno

Métodos podem retornar valores utilizando a palavra-chave `return`.

Exemplo:

```java
public int somar() {
    return 10 + 5;
}
```

Uso:

```java
int resultado = somar();
```

---

# Métodos com Parâmetros

Parâmetros permitem que informações sejam enviadas para o método.

Exemplo:

```java
public void exibirNome(String nome) {
    System.out.println(nome);
}
```

Uso:

```java
exibirNome("Maria");
```

---

# Métodos com Parâmetros e Retorno

Exemplo:

```java
public int somar(int numero1, int numero2) {
    return numero1 + numero2;
}
```

Uso:

```java
int resultado = somar(10, 20);
```

---

# Palavra-chave RETURN

A instrução `return` encerra a execução do método e devolve um valor ao código que realizou a chamada.

Exemplo:

```java
public boolean maiorDeIdade(int idade) {

    if (idade >= 18) {
        return true;
    }

    return false;
}
```

---

# Sobrecarga de Métodos (Overload)

Uma classe pode possuir vários métodos com o mesmo nome, desde que a lista de parâmetros seja diferente.

Exemplo:

```java
public int somar(int a, int b) {
    return a + b;
}

public double somar(double a, double b) {
    return a + b;
}
```

Uso:

```java
somar(10, 20);
somar(10.5, 20.5);
```

O compilador identifica automaticamente qual método deve ser utilizado.

---

# Assinatura de Método

A assinatura de um método é composta por:

- Nome do método.
- Quantidade de parâmetros.
- Tipos dos parâmetros.
- Ordem dos parâmetros.

Exemplo:

```java
public void exibir(String nome)
```

Assinatura:

```txt
exibir(String)
```

O tipo de retorno não faz parte da assinatura.

---

# Exemplo Completo

```java
public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }
}
```

Uso:

```java
Calculadora calculadora = new Calculadora();

System.out.println(calculadora.somar(5, 3));
System.out.println(calculadora.multiplicar(5, 3));
```

---

# Boas Práticas

- Utilize nomes claros e descritivos.
- Métodos devem possuir uma única responsabilidade.
- Evite métodos excessivamente longos.
- Prefira reutilizar métodos em vez de duplicar código.
- Utilize parâmetros para tornar métodos mais flexíveis.

Exemplo de nome adequado:

```java
calcularMedia()
```

Evite:

```java
fazerCoisa()
```

---

# Observações

- Métodos representam comportamentos de uma classe.
- Podem receber parâmetros.
- Podem retornar valores.
- Podem ser sobrecarregados.
- O tipo `void` indica ausência de retorno.
- O retorno de um método deve ser compatível com o tipo declarado.

---

# Resumo

Métodos são blocos de código responsáveis por executar ações e implementar comportamentos em Java. Eles promovem reutilização de código, organização da lógica da aplicação e são um dos elementos centrais da Programação Orientada a Objetos.