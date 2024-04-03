/*
Escreva um programa que leia uma sequência de números do usuário e realize a soma desses números. 
Encerre a execução quando um número negativo for digitado.
*/

let num = 0
let acumulador = 0

while (num > 0)
{
    num = parseInt(prompt("Para encerrar o programa, digite um número negativo (menor que zero)<br>Digite um número: "))
    acumulador += num
}

document.write("Soma de todos os números positivos: " + acumulador)