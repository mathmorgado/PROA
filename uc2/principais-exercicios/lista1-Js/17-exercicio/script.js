/*
Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade. 
*/

let idade
let maiorDeIdade = 0

for (contador = 0; contador < 20; contador++)
{
    idade = parseInt(prompt("Digite sua idade: "))
    if (idade >= 18)
    {
        maiorDeIdade++
    }
}

document.write("Maiores de idade: " + maiorDeIdade)