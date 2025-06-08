
📝 Desafio de Programação: Calculadora Simples em Java
Objetivo
Desenvolver uma aplicação de linha de comando em Java que funcione como uma calculadora. O programa deve ser capaz de receber dois números e um operador matemático do usuário, realizar a operação correspondente e exibir o resultado.

Requisitos Essenciais
Entrada de Dados: O programa deve solicitar ao usuário que insira dois números e o operador.

Os números podem ser do tipo double para suportar valores com casas decimais.
O operador deve ser lido como um caractere (char) ou String.
Operações Suportadas: A calculadora deve obrigatoriamente suportar as quatro operações básicas:

+ (Adição)
- (Subtração)
* (Multiplicação)
/ (Divisão)
Processamento: Utilize a estrutura de controle switch para selecionar a operação matemática a ser executada com base no operador fornecido pelo usuário.

Saída de Dados: O resultado da operação deve ser exibido no console de forma clara, por exemplo: O resultado de 10.0 * 5.0 é: 50.0.

Tratamento de Erros: O programa deve lidar com duas condições de erro principais:

Divisão por zero: Se o usuário tentar realizar uma divisão onde o segundo número é zero, exiba a mensagem: "Erro: Divisão por zero não é permitida."
Operador inválido: Se o usuário inserir um operador diferente dos quatro suportados, exiba: "Erro: Operador inválido."

⭐ Desafios Adicionais (Opcional)
Para aprimorar o projeto, tente implementar as seguintes funcionalidades:

Cálculos Contínuos: Implemente um laço de repetição (while) para que, após cada cálculo, o programa pergunte ao usuário se ele deseja realizar outra operação ou sair.
Novas Operações: Adicione suporte para potenciação (^) e resto da divisão (%).
Validação de Entrada: Garanta que a entrada do usuário para os números seja de fato um número, tratando possíveis exceções (InputMismatchException).
Exemplo de Interação no Console
Bash

=== Calculadora Simples em Java ===
Digite o primeiro número: 25
Digite o operador (+, -, *, /): /
Digite o segundo número: 4

O resultado de 25.0 / 4.0 é: 6.25