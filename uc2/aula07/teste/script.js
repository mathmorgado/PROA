function teste() // Essa "função" não tem retorno, logo ela é um PROCEDIMENTO en ão uma FUNÇÃO
{
    var nome1 = "Alexandre " 
}


teste() // VAR não está tendo escopo global

for(let i = 0; i < 5; i++)
{
    var nome2 ="Andreia"
    let nome3 = "caio"
}

console.log(nome2) // VAR está tendo escopo global
// console.log(nome3) -> LET não tem escopo global