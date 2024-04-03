/*
Leia a idade de 20 pessoas e exiba a soma das idades
*/

let idade
let acumulador = 0

for (contador = 0; contador < 20; contador++)
{
    idade = parseInt(prompt("Digite sua idade: "))
    acumulador += idade
}

document.write("Soma total das idades: " + acumulador)