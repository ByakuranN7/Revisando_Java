# 08.3 - Package (Pacotes em Java)

## Objetivo

Esta seção apresenta os packages, um mecanismo utilizado para organizar classes e interfaces em grupos lógicos.

Packages ajudam a estruturar projetos, evitar conflitos de nomes e facilitar a manutenção do código, especialmente em aplicações maiores.

---

# O que é um Package?

Um package (pacote) é um agrupamento de classes, interfaces, enums e outros elementos relacionados.

Ele funciona de maneira semelhante às pastas de um sistema operacional, permitindo organizar melhor os arquivos de um projeto.

---

# Declarando um Package

A declaração de package deve ser a primeira instrução do arquivo Java (desconsiderando comentários).

## Exemplo

```java
package com.exemplo;
```

Classe completa:

```java
package com.exemplo;

public class Pessoa {

}
```

---

# Estrutura de Diretórios

O nome do package normalmente corresponde à estrutura de pastas do projeto.

Exemplo:

```txt
src
└── com
    └── exemplo
        └── Pessoa.java
```

Arquivo:

```java
package com.exemplo;

public class Pessoa {

}
```

---

# Importando Classes

Para utilizar uma classe de outro package, utiliza-se a instrução `import`.

## Exemplo

Classe:

```java
package com.modelo;

public class Pessoa {

}
```

Uso:

```java
import com.modelo.Pessoa;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
    }
}
```

---

# Importando Múltiplas Classes

É possível importar todas as classes de um package utilizando `*`.

```java
import com.modelo.*;
```

Entretanto, em projetos reais normalmente é recomendado importar apenas as classes necessárias.

---

# Convenção de Nomes

Por convenção, nomes de packages são escritos em letras minúsculas.

## Exemplos

```java
package com.empresa;
package br.com.projeto;
package com.github.usuario;
```

Evita-se:

```java
package MinhaEmpresa;
package ProjetoJava;
```

---

# Hierarquia de Packages

Packages podem possuir subpackages.

Exemplo:

```txt
com
└── empresa
    ├── model
    ├── service
    ├── repository
    └── controller
```

Correspondendo a:

```java
package com.empresa.model;
package com.empresa.service;
package com.empresa.repository;
package com.empresa.controller;
```

---

# Packages da Biblioteca Java

A própria biblioteca padrão do Java é organizada em packages.

Alguns exemplos:

```java
java.lang
java.util
java.io
java.time
java.sql
java.net
```

Exemplo:

```java
import java.util.ArrayList;
import java.time.LocalDate;
```

---

# O Package java.lang

As classes do package `java.lang` são importadas automaticamente pelo compilador.

Por isso não é necessário escrever:

```java
import java.lang.String;
import java.lang.System;
import java.lang.Object;
```

Essas classes já estão disponíveis por padrão.

---

# Benefícios dos Packages

- Melhor organização do código.
- Evitam conflitos entre classes com o mesmo nome.
- Facilitam a manutenção do projeto.
- Tornam a estrutura do sistema mais clara.
- Permitem controle de acesso entre classes.

---

# Observações

- A declaração de package deve aparecer no início do arquivo.
- O nome do package normalmente acompanha a estrutura de diretórios.
- Packages são escritos em letras minúsculas por convenção.
- O uso de packages é essencial em projetos de médio e grande porte.
- Classes do package `java.lang` são importadas automaticamente.

---

# Resumo

Packages são mecanismos de organização que permitem agrupar classes e interfaces relacionadas em uma estrutura lógica. Eles ajudam a manter projetos organizados, evitam conflitos de nomes e facilitam a manutenção e evolução de aplicações Java.