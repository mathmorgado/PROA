/* Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo valor usando o loop "while". */

let numeroDaTabuada = parseInt(prompt("Digite o número da tabuada que deseja ver: "))
let contador = 1

while (contador <= 10)
{
    document.write("<br>" + numeroDaTabuada + " x " + contador + " = " + (numeroDaTabuada*contador))
    contador++
}