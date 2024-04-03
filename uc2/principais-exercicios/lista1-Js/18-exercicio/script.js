/*
Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova. 
*/

// Setando idade para 999 para poder fazer a validação de idade da 1º pessoa
let idadeNova = 999
let nomeDaPessoaMaisNova

for (contador = 0; contador < 10; contador++)
{
    nomeUsuario = prompt("Digite seu nome:")
    idadeUsuario = parseInt(prompt("Digite sua idade: "))

    if (idadeUsuario < idadeNova)
    {
        idadeNova = idadeUsuario
        nomeDaPessoaMaisNova = nomeUsuario 
    }
}

document.write("Pessoa mais nova: " + nomeDaPessoaMaisNova)