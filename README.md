
# DIO | Desafio da Conta Bancária 

Esse foi um desafio proposto pelo professor [Gleyson Sampaio](https://github.com/glysns) da [Digital Innovation One](https://www.dio.me).


### 🏹 Objetivo 

O objetivo desse desafio é para testar o nosso java básico, as noções de GIT e GITHUB e também a configuração e utilização da IDE. 


### 💻 Tecnologia e Ferramentas utilizadas

- `java`
- `git`
- `IDE (Visual Studio Code)`


##  Desafio 

### Sintaxe - Desafio 

Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:

Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.

Revise sobre regras de declaração de variáveis

|  Atributo	   | Tipo	    | Exemplo       |
| -----------:  | :------:  | :---------:   |
| Número        | Inteiro   | 102 1         |
| Agencia       | Texto     | 067-8         |
| Nome Cliente  | Texto	    | MARIO ANDRADE |
| Saldo         | Decimal   | 237.48        |



Revise sobre terminal, main args e a classe Scanner

Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

Programa: ` "Por favor, digite o número da Agência !" `

Usuário: ` 1021 ` (depois ENTER para o próximo campo)


Revise sobre concatenação e classe String com método concat
Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

`"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".`

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.
