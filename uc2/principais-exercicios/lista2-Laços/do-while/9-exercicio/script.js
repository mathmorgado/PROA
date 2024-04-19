let idade;
let media;
let acumulador = 0;
let contador = 0;

do
{
    idade = parseInt(prompt("Qual sua idade: "));

    acumulador += idade;
    contador++
}
while(contador < 5)

media = acumulador / 5;
alert(`A média das idades é ${media}`);