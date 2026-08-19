# Death Note OO

Exercicio em Java para praticar conceitos de orientacao a objetos usando classes, atributos, metodos, encapsulamento e, como desafio extra, heranca.

## Objetivo

Modelar uma pequena simulacao inspirada no Death Note, onde um usuario pode visualizar informacoes de uma vitima usando os Olhos de Shinigami e escrever o nome dela no Death Note.

## Requisitos obrigatorios

### 1. Classe `Victim`

Crie uma classe `Victim` com os seguintes atributos:

```java
name
alive
```

O atributo `name` representa o nome da vitima.
O atributo `alive` indica se a vitima esta viva ou morta.

### 2. Classe `DeathNoteUser`

Crie uma classe `DeathNoteUser` com os seguintes atributos:

```java
hasShinigamiEyes
name
remainingLifespan
alive
```

Onde:

- `hasShinigamiEyes` indica se o usuario possui os Olhos de Shinigami.
- `name` representa o nome do usuario.
- `remainingLifespan` representa o tempo de vida restante do usuario.
- `alive` indica se o usuario esta vivo ou morto.

### 3. Metodo `useShinigamiEyes`

Crie um metodo `useShinigamiEyes` que permita visualizar as informacoes da vitima.

Regras:

- Se o usuario estiver morto, ele nao podera usar os Olhos de Shinigami.
- Se o usuario nao possuir os Olhos de Shinigami, ele nao podera visualizar as informacoes da vitima.
- Se o usuario estiver vivo e possuir os Olhos de Shinigami, exiba as informacoes da vitima.

### 4. Metodo `writeInDeathNote`

Crie um metodo `writeInDeathNote` que permita escrever:

- O nome da vitima.
- A causa da morte.
- O tempo, em segundos, ate que ela morra.

Use `TimeUnit.SECONDS.sleep()` com o tempo especificado antes de exibir a mensagem da morte.

A mensagem final deve conter:

- O nome da vitima.
- A causa de sua morte.

Exemplo de mensagem:

```text
Light Yagami morreu por ataque cardiaco.
```

## Desafio extra

Se quiser expandir o exercicio, pense nos atributos que sao compartilhados entre a vitima e o usuario do Death Note.

Como ambos possuem `name` e `alive`, crie uma classe base para representar uma pessoa e utilize heranca.

Sugestao:

```java
Person
Victim extends Person
DeathNoteUser extends Person
```

## Desafio extra: ativar Olhos de Shinigami

Crie um metodo para ativar os Olhos de Shinigami.

Esse metodo deve:

- Ativar `hasShinigamiEyes`.
- Reduzir o `remainingLifespan` do usuario.
- Matar o usuario caso o tempo de vida restante chegue a zero ou fique negativo.

## Criterios de pratica

Ao finalizar, tente demonstrar no `Main`:

- Criacao de uma vitima.
- Criacao de um usuario do Death Note.
- Tentativa de usar os Olhos de Shinigami sem possuir os olhos.
- Ativacao dos Olhos de Shinigami.
- Uso dos Olhos de Shinigami para visualizar a vitima.
- Escrita do nome da vitima no Death Note.
- Alteracao do estado da vitima para morta.
