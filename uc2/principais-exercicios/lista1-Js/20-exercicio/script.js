/*
Escreva um programa que leia 20 números do usuário e exiba quantos números são maiores do que 8. 
*/

let num
let maiorQue8 = 0

for (contador = 0; contador < 10; contador++)
{
    num = parseInt(prompt("Digite um número: "))

    if (num > 8)
    {
        maiorQue8++
    }
}

document.write("Quantidade de números maior que 'Oito': " + maiorQue8)