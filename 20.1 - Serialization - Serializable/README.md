# 20.1 - Serialization - Serializable

## Objetivo

Esta seção apresenta o conceito de **Serialização** em Java, um mecanismo que permite converter o estado de um objeto em uma sequência de bytes para que ele possa ser armazenado ou transmitido e posteriormente reconstruído.

A serialização é amplamente utilizada para salvar o estado de objetos em arquivos, enviar dados pela rede e persistir informações entre execuções da aplicação.

------------------------------------------------------------------------

## O que é Serialização?

Serializar um objeto significa transformar seu estado em bytes. Apenas os campos serializáveis do objeto são gravados. Campos marcados como transient e campos static não fazem parte da serialização.

Esses bytes podem ser utilizados para:

-   Salvar objetos em arquivos;
-   Enviar objetos pela rede;
-   Compartilhar informações entre aplicações;
-   Armazenar o estado de um programa.

O processo inverso é chamado de **Desserialização (Deserialization)**.

------------------------------------------------------------------------

## A Interface `Serializable`

Para que um objeto possa ser serializado, sua classe deve implementar a
interface de marcação (`marker interface`) `Serializable`. 

``` java
import java.io.Serializable;

public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
    	this.nome = nome;
    	this.idade = idade;
    }
}
```

A interface 'Serializable' não possui métodos nem constantes obrigatórias. Ela apenas informa ao mecanismo de serialização da JVM que aquela classe pode ser serializada.

------------------------------------------------------------------------

## Gravando um Objeto

``` java
try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("pessoa.dat"))) {

    Pessoa pessoa = new Pessoa("Ana", 25);

    out.writeObject(pessoa);
}
```

------------------------------------------------------------------------

## Lendo um Objeto

``` java
try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("pessoa.dat"))) {

    Pessoa pessoa = (Pessoa) in.readObject();

    System.out.println(pessoa);
}
```

------------------------------------------------------------------------

## Fluxo da Serialização

``` text
Objeto Java
      ↓
Serializable
      ↓
ObjectOutputStream
      ↓
Arquivo (.dat)
      ↓
ObjectInputStream
      ↓
Objeto Java
```

------------------------------------------------------------------------

## O Arquivo `.dat`

Nos exemplos foi utilizado um arquivo chamado `pessoa.dat`:

```java
ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("pessoa.dat"));
```

A extensão `.dat` significa **data** e é apenas uma convenção para indicar que o arquivo contém dados binários.

Entretanto, a serialização em Java **não exige** essa extensão. O mecanismo de serialização grava uma sequência de bytes em um arquivo, independentemente do seu nome ou da sua extensão.

Por exemplo, todos os arquivos abaixo podem ser utilizados para armazenar um objeto serializado:

* `pessoa.dat`
* `pessoa.ser`
* `pessoa.bin`

A diferença está apenas no nome do arquivo. O conteúdo continua sendo uma sequência de bytes produzida por `ObjectOutputStream` e lida posteriormente por `ObjectInputStream`.

É comum encontrar diferentes convenções em exemplos, livros e documentações:

* **`.ser`** (*serialized*): indica que o arquivo contém um objeto serializado.
* **`.dat`** (*data*): utilizado para arquivos de dados em geral.
* **`.bin`** (*binary*): indica que o arquivo armazena dados em formato binário.

Todas essas extensões funcionam da mesma forma. O Java não faz distinção entre elas durante a serialização; a escolha da extensão serve apenas para facilitar a organização e a identificação dos arquivos pelo desenvolvedor.

------------------------------------------------------------------------

## `serialVersionUID`

É recomendado declarar:

``` java
private static final long serialVersionUID = 1L;
```

Esse identificador auxilia na compatibilidade entre diferentes versões
da classe. Ele é utilizado durante a desserialização para verificar se a versão da classe é compatível com a versão utilizada quando o objeto foi serializado.

------------------------------------------------------------------------

## Campos `transient`

Campos marcados com `transient` não são serializados. Quando o objeto é desserializado, os campos transient recebem seus valores padrão (null, 0, false, etc.), a menos que sejam inicializados de outra forma.

``` java
private transient String senha;
```

------------------------------------------------------------------------

## Exceção Comum

Caso a classe não implemente `Serializable`, ocorre:

``` text
java.io.NotSerializableException
```

------------------------------------------------------------------------

## Relação com Input e Output

A serialização utiliza as APIs estudadas anteriormente, principalmente:

-   `FileInputStream`
-   `FileOutputStream`
-   `ObjectInputStream`
-   `ObjectOutputStream`

------------------------------------------------------------------------

## Boas Práticas

-   Utilize `try-with-resources`.
-   Declare `serialVersionUID`.
-   Use `transient` para dados sensíveis.
-   Serialize apenas o necessário.

------------------------------------------------------------------------

## Resumo

A serialização transforma objetos Java em bytes para armazenamento ou transmissão. A desserialização reconstrói esses objetos posteriormente. Esse recurso depende da interface `Serializable` e das classes `ObjectOutputStream` e `ObjectInputStream`, sendo muito utilizado em persistência de dados e comunicação entre aplicações.
