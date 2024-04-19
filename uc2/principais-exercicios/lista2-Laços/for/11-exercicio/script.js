let numero = parseInt(prompt("Digite um número"));

let somaPares = 0;

for (let contador = 2; contador < numero; contador++)
{
    if (contador % 2 == 0)
    {
        somaPares += contador;
    };
};

alert(`A soma de todos os pares entre 1 e ${numero} é: ${somaPares}`);
