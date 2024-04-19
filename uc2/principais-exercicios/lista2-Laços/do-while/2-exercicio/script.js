/*
Escreva um programa que calcule a soma dos números de 1 a 100 usando o loop "while".
*/

let num = 1
let acumulador = 0

while (num <= 100)
{
    acumulador += num
    num++
}

document.write("Soma dos números de 0 a 100: " + acumulador)