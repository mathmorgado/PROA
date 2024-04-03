/*
Escrever um programa que leia:
Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário, 
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado. 
(Salário mínimo = R$1.212,00).

*/

let salarioMinimo = parseFloat(prompt("Salário mínimo: R$"))
let salarioUsuario = parseFloat(prompt("Seu salário: R$"))

let qtdSalariosMinimos = (salarioUsuario / salarioMinimo).toFixed(1)

document.write("Você recebe " + qtdSalariosMinimos + "x salários mínimos!")