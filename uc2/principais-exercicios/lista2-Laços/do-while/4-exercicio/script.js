/* Faça um programa que leia 5 números inteiros usando o loop "while" e exiba a média aritmética dos valores lidos. */

let num
let contador = 0
let media = 0

do
{
    num = parseInt(prompt("Numero: "))
    media += num
    contador++
}
while (contador < 5)

media = parseFloat(media / 5)

document.write("A média aritmética dos 5 números selecionados é: " + media.toFixed(2))