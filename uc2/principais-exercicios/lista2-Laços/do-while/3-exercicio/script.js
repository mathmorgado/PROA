/*Crie um programa que exiba os números pares de 1 a 50 usando o loop "while".*/

let num = 0

do
{
    if (num % 2 == 0)
    {
        document.write("<br>" + num)
    }
    num++
}
while (num <= 50)