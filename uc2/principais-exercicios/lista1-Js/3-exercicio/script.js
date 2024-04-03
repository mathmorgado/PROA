/*
A CEF concederá um crédito especial com juros de 2% aos seus clientes de acordo com o saldo médio no último ano. 
Fazer um programa em Js que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela a seguir. 

Saldo médio  | Percentual
  0 a 500    | Nenhum crédito
 501 a 1000  | 30% do valor do saldo médio
 1001 3000   | 40% do valor do saldo médio
   3001+     | 50% do valor do saldo médio

Imprimir uma mensagem informando o saldo médio e o valor de crédito.
*/

let saldoMedio = parseInt(prompt("Digite seu saldo médio: "))

if (saldoMedio < 501) 
{
    document.write("Nenhum crédito");
} 
else if (saldoMedio > 501 && saldoMedio < 1001) 
{
    document.write("30% de crédito");
} 
else if (saldoMedio > 1000 && saldoMedio < 3001) 
{
    document.write("40% de crédito");
} 
else if (saldoMedio > 3001) 
{
    document.write("50% de crédito");
} 
else {
    document.write("Número inválido");
}