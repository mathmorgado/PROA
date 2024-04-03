/*
 Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
 Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês. 
*/

let nome = prompt("Nome: ")
let salario = parseFloat(prompt("Salário: "))
let vendasTotal = parseFloat(prompt("Valor total em vendas do mês: R$"))
let comissao = vendasTotal/100 * 15

let salarioFinal = salario + comissao

document.write("Seu nome é: " + nome)
document.write("<br>Seu salário é: R$  " + salario)
document.write("<br>Seu salário com comissão é: R$" + salarioFinal.toFixed(2))