/* Faça um programa que leia 5 números inteiros usando o loop "while" e exiba a média aritmética dos valores lidos. */

let num

let media = 0

for (let contador = 0; contador < 5; contador++)
{
    num = parseInt(prompt("Numero: "))
    media += num
}

media = parseFloat(media / 5)

document.write("A média aritmética dos 5 números selecionados é: " + media.toFixed(2))