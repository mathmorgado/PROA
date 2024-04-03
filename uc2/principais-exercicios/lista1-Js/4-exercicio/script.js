/*
Faça um programa que receba três valores A, B e C e que 
imprima os valores de forma descendente (do maior para o menor).
*/

let a = parseInt(prompt("Digite o valor de A: "))
let b = parseInt(prompt("Digite o valor de B: "))
let c = parseInt(prompt("Digite o valor de C: "))

if(a > b)
{
    if(a > c)
    {
        if(b > c)
        {
            document.write("A: " + a + "<br>B: " + b + "<br>C: " + c)
        }
        else
        {
            document.write("A: " + a + "<br>C: " + c + "<br>B: " + b)
        }
    }
    else
    {
        document.write("C: " + c + "<br>A: " + a + "<br>B: " + b)
    }
}
else if (a < c)
{
    if(b > c)
    {
        document.write("B: " + b + "<br>C: " + c + "<br>A: " + a)
    }
    else
    {
        document.write("C: " + c + "<br>B: " + b + "<br>A: " + a)
    }
}
else
{
    document.write("B: " + b + "<br>A: " + a + "<br>C: " + c)
}
