/*
 Escreva um programa que calcule a soma dos números de 1 a 15. 
*/

let acumulador = 0

for (let contador = 1; contador <= 15; contador++)
{
    acumulador += contador
}

document.write("A soma dos números de 1 à 15 é: " + acumulador)