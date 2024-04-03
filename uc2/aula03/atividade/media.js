// função para obter as notas ao mesmo tempo em que 'valida' elas. Recebe como parâmentro a mensagem que será exibida no prompt durante o requerimento da nota!
function validarNota(msg)
{
    let nota = parseFloat(prompt(msg)) // variavel que vai armazenar a nota

    while (nota > 10 || nota < 0) // laço resposnsável por impedir a entrada de uma nota superior a 10 ou inferior a 0!
    {
        nota = parseFloat(prompt(msg))
    }

    return nota // retornar a nota inserida depois de todos os passos de validação
}

let nota1 = validarNota("Primeira nota: ");
let nota2 = validarNota("Segunda nota: ");
let nota3 = validarNota("Terceira nota: ");
let nota4 = validarNota("Quarta nota: ");

let mediaDasNotas = (nota1 + nota2 + nota3 + nota4) / 4;

document.write("A sua média é: " + mediaDasNotas.toFixed(2) + "<br>");

if (mediaDasNotas >= 6)
{
    document.write("Aprovado!");
}

else if(mediaDasNotas >= 5)
{
    document.write("Recuperação!");
}

else
{
    document.write("Reprovado!");
}