let nome;
let idade;
let media = 0;
let contador = 0;
let continuarLaco = true;

while(continuarLaco)
{
    nome = prompt("Qual seu nome: ");
    if (nome == "fim")
    {
        break
    }

    idade = parseInt(prompt("Qual sua idade: "));

    contador++
    media += idade;
}

media /= contador;
alert(`A média das idades é ${media}`);