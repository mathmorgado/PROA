/* Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número usando o loop "while". */

let num = parseInt(prompt("Digite um número: "))
let contador = parseInt(num / 2)

document.write("Divisores do número: " + num + "<br>")
while (contador > 1)
{
    if (num % contador == 0)
    {
        document.write(contador +  "<br>")
    }
    contador -= 1
}

