/*
Crie um programa que leia a idade de uma pessoa e informe a sua classe eleitoral: 

• não eleitor (abaixo de 16 anos); 
• eleitor obrigatório (entre a faixa de 18 e menor de 65 anos);
• eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive).

*/

let idade = parseInt(prompt("Qual sua idade: "))


if(idade < 16)
{
    document.write("Não eleitor!")
}
else if (idade >= 18 && idade <= 65)
{
    document.write("Eleitor obrigatório!")
}
else
{
    document.write("Eleitor facultativo")
}
