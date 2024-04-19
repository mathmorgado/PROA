let idade;
let media;
let acumulador = 0;


for (let contador = 0; contador < 5; contador++)
{
    idade = parseInt(prompt("Qual sua idade: "));

    acumulador += idade;
   
}

media = acumulador / 5;
alert(`A média das idades é ${media}`);