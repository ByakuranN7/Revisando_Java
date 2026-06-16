# 18 - Exceptions

## Objetivo

Esta seção apresenta o mecanismo de **Exceptions** em Java, utilizado para detectar, propagar e tratar erros que podem ocorrer durante a execução de um programa.

---

## O que são Exceptions?

Exceptions são eventos que interrompem o fluxo normal de execução de um programa.

Elas permitem que erros sejam tratados de forma controlada, evitando encerramentos inesperados da aplicação.

---

## Por que utilizar Exceptions?

- Separar a lógica principal do tratamento de erros
- Tornar o código mais seguro
- Facilitar manutenção e depuração
- Permitir recuperação de falhas em tempo de execução

---

## try e catch

O bloco `try` contém o código que pode gerar uma exceção.

O bloco `catch` captura e trata a exceção.

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Não é possível dividir por zero.");
}
```

---

## Capturando informações da Exception

A variável declarada no `catch` contém informações sobre o erro ocorrido.

```java
try {
    int resultado = 10 / 0;
} catch (Exception e) {
    System.out.println(e.getMessage());
}
```

Métodos comuns:

| Método | Descrição |
|----------|----------|
| getMessage() | Retorna a mensagem da exceção |
| printStackTrace() | Exibe a pilha de execução |
| getClass() | Retorna o tipo da exceção |

---

## finally

O bloco `finally` é executado independentemente de ocorrer erro ou não.

```java
try {
    System.out.println("Executando");
} finally {
    System.out.println("Finalizado");
}
```

É muito utilizado para liberar recursos como arquivos, conexões e streams.

---

## throw

A palavra-chave `throw` permite lançar exceções manualmente.

```java
if (idade < 0) {
    throw new IllegalArgumentException("Idade inválida");
}
```

Outro exemplo:

```java
if (idade < 18) {
    throw new RuntimeException("Idade deve ser 18 ou maior.");
}
```

---

## throws

A palavra-chave `throws` informa que um método pode lançar uma exceção.

```java
public void lerArquivo() throws IOException {

}
```

Quem chamar esse método deverá tratar ou propagar a exceção.

---

## Hierarquia das Exceptions

```text
Throwable
 ├── Error
 └── Exception
      ├── RuntimeException
      └── Checked Exceptions
```

Toda exceção deriva de `Throwable`.

---

## Checked Exceptions

São exceções que o compilador exige que sejam tratadas ou declaradas com `throws`.

Exemplos:

```java
IOException
SQLException
```

---

## Unchecked Exceptions

São subclasses de `RuntimeException`.

O compilador não exige tratamento obrigatório.

Exemplos:

```java
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException
IllegalArgumentException
```

---

## Exception vs Error

### Exception

Problemas que podem ser tratados pelo programa.

### Error

Problemas graves da JVM normalmente fora do controle da aplicação.

Exemplos:

```java
OutOfMemoryError
StackOverflowError
```

---

## Exemplo Completo

```java
try {
    int[] numeros = {1, 2, 3};

    System.out.println(numeros[10]);

} catch (ArrayIndexOutOfBoundsException e) {

    System.out.println("Índice inválido.");
}
```

---

## Variáveis sem nome (Java 22)

A partir do Java 22 é possível utilizar `_` quando o objeto da exceção não será utilizado.

Antes:

```java
catch (ArithmeticException ae) {
    System.out.println("Problema: Divisão por zero!");
}
```

Depois:

```java
catch (ArithmeticException _) {
    System.out.println("Problema: Divisão por zero!");
}
```

Utilize esse recurso apenas quando a exceção capturada não precisar ser acessada.

---

## Relação com Herança

Assim como visto na seção de Herança, exceções também formam uma hierarquia de classes.

Isso permite capturar exceções específicas:

```java
catch (IOException e)
```

ou mais genéricas:

```java
catch (Exception e)
```

---

## Boas Práticas

- Capture exceções específicas sempre que possível
- Não utilize `catch (Exception)` sem necessidade
- Utilize mensagens claras
- Não ignore exceções silenciosamente
- Use `finally` para liberar recursos

---

## Resumo

Exceptions são o mecanismo de tratamento de erros do Java. Elas permitem detectar falhas, interromper o fluxo quando necessário e recuperar a execução de forma segura.

Compreender `try`, `catch`, `finally`, `throw` e `throws` é fundamental para desenvolver aplicações robustas e confiáveis.