let nome;
let idade;
let media = 0;
let contador = 0;
let continuarLaco = true;

do
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
while(continuarLaco)

media /= contador;
alert(`A média das idades é ${media}`);