let numero = parseInt(prompt("Digite um número: "));
let fatorial = 1;
let contador = numero;

while(contador > 1)
{
    fatorial *= contador;
    contador -= 1;
}

alert(`${numero}! = ${fatorial}`)