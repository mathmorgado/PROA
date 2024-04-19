/*
Escreva um programa que calcule a soma dos números de 1 a 100 usando o loop "while".
*/


let acumulador = 0

for (let num = 1; num <= 100; num++)
{
    acumulador += num
}

document.write("Soma dos números de 0 a 100: " + acumulador)