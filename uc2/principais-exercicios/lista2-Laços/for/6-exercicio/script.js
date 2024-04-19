/* Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número usando o loop "while". */

let num = parseInt(prompt("Digite um número: "))

document.write("Divisores do número: " + num + "<br>")
for (let contador = parseInt(num / 2); contador > 1; contador -= 1)
{
    if (num % contador == 0)
    {
        document.write(contador +  "<br>")
    }
}

