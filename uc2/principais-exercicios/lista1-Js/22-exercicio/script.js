/*
Faça um programa que leia 20 números e, ao final, escreva quantos estão entre 0 e 100. 
*/

let num
let qtDezenas = 0

for (contador = 0; contador <  20; contador++)
{
    num = parseInt(prompt("Digite um número: "))

    if (num > 0 && num < 100)
    {
        qtDezenas++
    }
}

document.write("Quantidade de números entre 0 e 100: " + qtDezenas)