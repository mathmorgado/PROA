/* Faça um programa que leia um número inteiro e exiba se ele é um número primo usando o loop "while". */

let num = parseInt(prompt("Digite um número: "))
let isPrimo = true

for (let contador = parseInt(num / 2); contador > 1; contador -= 1)
{
    if (num % contador == 0)
    {
        isPrimo = false
        document.write(num + " Não é primo!" )
        break
    }
}

if (isPrimo)
{
    document.write(num + " É primo!")
}
