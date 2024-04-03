/*
Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.
*/

let num
let acumulador = 0

for (contador = 0; contador < 10; contador++)
{
    num = parseInt(prompt("Digite um número inteiro: "))
    acumulador += num
}

document.write("Soma total: " + acumulador)