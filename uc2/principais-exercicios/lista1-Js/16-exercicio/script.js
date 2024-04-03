/*
Leia a idade de 20 pessoas e exiba a média das idades. 
*/

let idade
let acumulador = 0

for (contador = 0; contador < 20; contador++)
{
    idade = parseInt(prompt("Digite sua idade: "))
    acumulador += idade
}

let mediaIdades = acumulador / 20

document.write("Média total das idades: " + mediaIdades)