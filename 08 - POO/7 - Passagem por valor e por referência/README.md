# 08.7 - Passagem por Valor e por Referência

## Objetivo

Esta seção apresenta como os dados são passados para métodos em Java, abordando a diferença entre tipos primitivos e objetos durante chamadas de métodos.

Compreender esse conceito é fundamental para entender como alterações realizadas dentro de um método afetam (ou não afetam) as variáveis utilizadas fora dele.

---

# Como Funciona a Passagem de Parâmetros em Java?

Em Java, todos os parâmetros são passados por valor (*pass-by-value*).

Isso significa que o método recebe uma cópia do valor fornecido na chamada.

Entretanto, o comportamento observado é diferente quando trabalhamos com:

- Tipos primitivos.
- Objetos.

Por esse motivo, muitas pessoas acreditam que Java possui passagem por referência, mas isso não é verdade.

---

# Passagem por Valor com Tipos Primitivos

Quando um valor primitivo é enviado para um método, uma cópia desse valor é criada.

Alterações realizadas dentro do método não afetam a variável original.

## Exemplo

```java
public class Exemplo {

    public static void alterarValor(int numero) {
        numero = 100;
    }

    public static void main(String[] args) {

        int numero = 10;

        alterarValor(numero);

        System.out.println(numero);
    }
}
```

Saída:

```txt
10
```

O valor original permanece inalterado porque o método recebeu apenas uma cópia do valor armazenado em `numero`.

---

# O Que Acontece na Memória?

```txt
numero = 10
```

Ao chamar:

```java
alterarValor(numero);
```

É como se o Java fizesse:

```java
int copia = numero;
```

O método trabalha apenas com essa cópia.

---

# Objetos e Referências

Objetos são armazenados na memória e as variáveis guardam referências para eles.

Exemplo:

```java
Funcionario funcionario = new Funcionario();
```

A variável `funcionario` não contém o objeto em si.

Ela contém uma referência para o objeto criado na memória.

---

# Passando Objetos para Métodos

Quando um objeto é enviado para um método, o Java cria uma cópia da referência.

Exemplo:

```java
public class Funcionario {

    String nome;
}
```

```java
public static void alterarNome(Funcionario funcionario) {
    funcionario.nome = "Maria";
}
```

```java
Funcionario funcionario = new Funcionario();

funcionario.nome = "João";

alterarNome(funcionario);

System.out.println(funcionario.nome);
```

Saída:

```txt
Maria
```

---

# Por Que o Valor Foi Alterado?

O método recebeu uma cópia da referência.

Mesmo sendo uma cópia, ela continua apontando para o mesmo objeto.

Representação simplificada:

```txt
funcionario ----------+
                       |
                       v
                 [ nome = João ]
```

Após a chamada:

```java
alterarNome(funcionario);
```

Temos:

```txt
funcionario ----------+
                       |
                       v
                 [ nome = Maria ]
```

O objeto foi alterado porque tanto a referência original quanto a cópia apontam para o mesmo local da memória.

---

# Tentando Trocar a Referência

Agora observe:

```java
public static void trocarFuncionario(Funcionario funcionario) {

    funcionario = new Funcionario();

    funcionario.nome = "Carlos";
}
```

Uso:

```java
Funcionario funcionario = new Funcionario();

funcionario.nome = "João";

trocarFuncionario(funcionario);

System.out.println(funcionario.nome);
```

Saída:

```txt
João
```

---

# O Que Aconteceu?

Dentro do método foi criada uma nova referência:

```java
funcionario = new Funcionario();
```

Apenas a cópia local da referência foi alterada.

A variável original continua apontando para o objeto antigo.

Por isso o objeto externo permanece inalterado.

---

# O Mito da Passagem por Referência

É comum ouvir:

> "Objetos são passados por referência."

Tecnicamente isso não está correto.

Java sempre utiliza passagem por valor.

A diferença é que:

- Para tipos primitivos, o valor copiado é o próprio dado.
- Para objetos, o valor copiado é a referência para o objeto.

Por isso alterações no objeto podem ser percebidas fora do método.

---

# Comparação

## Tipos Primitivos

```java
int numero = 10;

alterarValor(numero);
```

Resultado:

```txt
A variável original não é alterada.
```

---

## Objetos

```java
Funcionario funcionario = new Funcionario();

alterarNome(funcionario);
```

Resultado:

```txt
O objeto pode ser alterado.
```

---

## Troca de Referência

```java
funcionario = new Funcionario();
```

Resultado:

```txt
A referência original não é alterada.
```

---

# Boas Práticas

- Lembre-se de que Java sempre utiliza passagem por valor.
- Tenha cuidado ao modificar objetos recebidos como parâmetro.
- Evite alterar objetos inesperadamente dentro dos métodos.
- Quando necessário, retorne um novo objeto em vez de modificar o existente.
- Entenda a diferença entre alterar um objeto e alterar uma referência.

---

# Observações

- Tipos primitivos são copiados durante a chamada do método.
- Objetos também são passados por valor, mas o valor copiado é a referência.
- Alterar atributos de um objeto afeta o objeto original.
- Alterar a referência local não afeta a referência original.
- Java não possui passagem por referência no sentido tradicional encontrado em algumas outras linguagens.

---

# Resumo

Em Java, todos os parâmetros são passados por valor. Para tipos primitivos, isso significa que uma cópia do valor é enviada ao método. Para objetos, uma cópia da referência é enviada. Como ambas as referências apontam para o mesmo objeto, alterações em seus atributos podem ser refletidas fora do método, embora a referência original nunca seja substituída automaticamente.