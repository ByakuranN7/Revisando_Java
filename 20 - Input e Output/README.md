# 20 - Input e Output (I/O)

## Objetivo

Esta seção apresenta os conceitos de **Input e Output (I/O)** em Java, responsáveis pela leitura e escrita de dados.

Esses recursos permitem que programas interajam com:

- Arquivos
- Diretórios
- Console
- Fluxos de dados
- Recursos externos

---

## O que é I/O?

I/O significa:

- Input → Entrada de dados
- Output → Saída de dados

Exemplos:

- Ler um arquivo `.txt`
- Salvar informações em disco
- Receber dados digitados pelo usuário
- Gerar relatórios

---

## Principais APIs

Java possui duas APIs principais para trabalhar com arquivos.

### java.io

API tradicional presente desde as primeiras versões do Java.

Exemplos:

```java
File
FileReader
FileWriter
BufferedReader
BufferedWriter
```

---

### java.nio

Introduzida posteriormente para fornecer uma abordagem mais moderna e eficiente.

Exemplos:

```java
Path
Paths
Files
```

---

## Trabalhando com Arquivos

### Criando um arquivo

```java
File arquivo = new File("dados.txt");
arquivo.createNewFile();
```

---

## Escrevendo em Arquivos com FileWriter

```java
FileWriter writer = new FileWriter("dados.txt");

writer.write("Olá mundo");

writer.close();
```

---

## Importância do close()

Na API `java.io`, muitos objetos utilizam recursos do sistema operacional.

Por isso é necessário fechar o recurso após o uso.

```java
writer.close();
```

Caso contrário:

- dados podem não ser gravados corretamente
- recursos podem permanecer ocupados
- podem ocorrer vazamentos de recursos

---

## Try-With-Resources

Forma moderna de garantir o fechamento automático.

```java
try (FileWriter writer = new FileWriter("dados.txt")) {

    writer.write("Olá mundo");

}
```

Ao sair do bloco, o recurso é fechado automaticamente.

---

## Leitura com FileReader

```java
FileReader reader = new FileReader("dados.txt");

int caractere;

while ((caractere = reader.read()) != -1) {
    System.out.print((char) caractere);
}

reader.close();
```

---

## Unicode e Caracteres

Todo caractere possui um código numérico associado na tabela Unicode.

Exemplo:

```java
public class Saudacao {

    public static void main(String[] args) {

        int num1 = 79;
        int num2 = 108;
        int num3 = 225;

        char letra1 = (char) num1;
        char letra2 = (char) num2;
        char letra3 = (char) num3;

        System.out.println(
            "Saudação: " +
            letra1 +
            letra2 +
            letra3
        );
    }
}
```

Saída:

```text
Saudação: Olá
```

---

## Explicação

Os números:

| Valor | Caractere |
|---------|---------|
| 79 | O |
| 108 | l |
| 225 | á |

são convertidos para caracteres utilizando cast:

```java
(char) numero
```

Isso é possível porque caracteres são representados internamente por códigos Unicode.

---

## API NIO

A API NIO oferece recursos mais modernos para leitura e escrita.

Exemplo:

```java
Path caminho = Path.of("dados.txt");

Files.write(
    caminho,
    "Olá mundo".getBytes()
);
```

---

## Leitura com Files

```java
String conteudo =
        Files.readString(
            Path.of("dados.txt")
        );

System.out.println(conteudo);
```

---

## Diferença Entre IO e NIO

| Característica | java.io | java.nio |
|---------------|----------|----------|
| Mais moderna | Não | Sim |
| Menos recursos | Sim | Não |
| Trabalha com Path | Não | Sim |
| Facilita operações de arquivos | Não | Sim |
---

## Observação Sobre Bloqueio

Uma diferença importante observada na prática é que APIs tradicionais da família `java.io` normalmente exigem gerenciamento explícito dos recursos utilizados.

Já operações modernas com a API `java.nio`, como diversos métodos da classe `Files`, simplificam bastante o acesso aos arquivos e normalmente dispensam o fechamento manual realizado pelo desenvolvedor.

---

## Classes Importantes

```java
java.io.File
java.io.FileReader
java.io.FileWriter
java.io.BufferedReader
java.io.BufferedWriter
```

```java
java.nio.file.Path
java.nio.file.Paths
java.nio.file.Files
```

---

## Boas Práticas

- Utilize try-with-resources sempre que possível.
- Prefira NIO para novos projetos.
- Feche recursos da API IO corretamente.
- Utilize codificação UTF-8 ao trabalhar com texto.
- Trate exceções adequadamente.

---

## Próximos Tópicos

Na próxima seção será estudada a serialização de objetos:

- Serializable
- ObjectOutputStream
- ObjectInputStream

---

## Resumo

Input e Output permitem que programas Java leiam e escrevam dados em arquivos, diretórios e outros recursos.

As APIs `java.io` e `java.nio` fornecem diferentes formas de realizar essas operações, sendo a NIO a abordagem mais moderna e geralmente recomendada para novos projetos.