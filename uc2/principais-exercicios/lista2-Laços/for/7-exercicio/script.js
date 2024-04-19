/* Faça um programa que leia um número inteiro e exiba se ele é um número primo usando o loop "while". */

let num = parseInt(prompt("Digite um número: "))
let contador = parseInt(num / 2)
let isPrimo = true

while (contador > 1)
{
    if (num % contador == 0)
    {
        isPrimo = false
        document.write(num + " Não é primo!" )
        break
    }
    contador -= 1
}

if (isPrimo)
{
    document.write(num + " É primo!")
}
