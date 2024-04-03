/*
Escreva um programa em Js que leia um número e informe se ele é divisível por 10, por 5 ou por 2 ou se não é divisível por nenhum deles.
*/

let num = parseInt(prompt("Digite um número inteiro: "))


if (num % 10 == 0 || num % 5 == 0 ||  num % 2 == 0)
{
    if(num % 10 == 0)
    {
        document.write("Divisível por 10! <br>")
    }

    if(num % 5 == 0)
    {
        document.write("Divisível por 5! <br>")
    }

    if(num % 2 == 0)
    {
        document.write("Divisível por 2! <br>")
    }
}
else
{
    document.write("Seu número não é divisível por 10, por 5 e nem por 2! <br>")
}
