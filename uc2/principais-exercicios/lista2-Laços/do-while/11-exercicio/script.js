let numero = parseInt(prompt("Digite um número"));

let contador = 2;
let somaPares = 0;

do
{
    if (contador % 2 == 0)
    {
        somaPares += contador;
    };
    contador++;
}
while(contador < numero);

alert(`A soma de todos os pares entre 1 e ${numero} é: ${somaPares}`);
