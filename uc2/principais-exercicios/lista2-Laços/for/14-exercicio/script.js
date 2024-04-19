let numero = parseInt(prompt("Digite um número: "));
let fatorial = 1;


for (let contador = numero; contador > 1; contador -= 1)
{
    fatorial *= contador;
}

alert(`${numero}! = ${fatorial}`)