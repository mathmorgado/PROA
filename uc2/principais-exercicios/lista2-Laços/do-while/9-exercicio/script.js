let idade;
let media;
let acumulador = 0;
let contador = 0;

while(contador < 5)
{
    idade = parseInt(prompt("Qual sua idade: "));

    acumulador += idade;
    contador++
}

media = acumulador / 5;
alert(`A média das idades é ${media}`);