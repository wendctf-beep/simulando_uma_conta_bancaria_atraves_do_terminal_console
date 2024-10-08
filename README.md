# Conta Terminal

Este projeto simula o cadastro de uma conta bancária através do terminal. O usuário pode inserir informações como número da agência, número da conta, nome do cliente e saldo. Após a coleta dos dados, o sistema exibe uma mensagem de confirmação personalizada.

## Funcionalidades

- Solicita ao usuário que insira:
  - Número da agência
  - Número da conta
  - Nome do cliente
  - Saldo inicial

- Valida a entrada do saldo para garantir que um número decimal válido seja fornecido.

- Exibe uma mensagem de agradecimento personalizada com os dados fornecidos pelo usuário.

## Como Usar

1. **Pré-requisitos**:
   - Java Development Kit (JDK) deve estar instalado no seu sistema.
   - Um ambiente de desenvolvimento Java (como VS Code ou IntelliJ IDEA) é recomendado.

2. **Clone o repositório**:
   ```bash
   git clone https://github.com/wendctf-beep/ContaTerminal.git
   cd ContaTerminal

## Exemplo de uso

Compilar o código:
  javac ContaTerminal.java

Executar o programa:
  java ContaTerminal

Interaja com o programa:
  Por favor, digite o número da Agência:
    1021
  Por favor, digite o número da Conta:
    123456
  Por favor, digite o nome do Cliente:
    João Silva
  Por favor, digite o saldo:
    1000.50
  Olá João Silva, obrigado por criar uma conta em nosso banco, sua agência é 1021, conta 123456 e seu saldo 1000.5 já está disponível para saque.
