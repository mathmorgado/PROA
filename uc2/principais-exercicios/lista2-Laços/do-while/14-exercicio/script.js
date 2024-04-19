let numero = parseInt(prompt("Digite um número: "));
let fatorial = 1;
let contador = numero;

do
{
    fatorial *= contador;
    contador -= 1;
}
while(contador > 1)

alert(`${numero}! = ${fatorial}`)