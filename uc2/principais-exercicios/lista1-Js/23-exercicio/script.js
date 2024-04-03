/*
Faça um programa que leia 20 números e, ao final, 
escreva quantos estão entre 0 e 100, 
quantos estão entre 101 e 200
quantos são maiores de 200.
*/

let num
let qtDezenas = 0
let entre100e200 = 0
let maiorQue200 = 0

for (contador = 0; contador <  20; contador++)
{
    num = parseInt(prompt("Digite um número: "))

    if (num > 0 && num < 100)
    {
        qtDezenas++
    }
    else if (num >= 100 && num <= 200)
    {
        entre100e200++
    }
    else if (num > 200)
    {
        maiorQue200++
    }
}

document.write("Quantidade de números entre 0 e 100: " + qtDezenas + "<br>Quantidade de números entre 100 e 200: " + entre100e200 + "<br>Quantidade de números maior que 200 " + maiorQue200)