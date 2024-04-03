let n1 = parseInt(prompt("Primeiro número: "))
let n2 = parseInt(prompt("Segundo número: "))
let n3 = parseInt(prompt("Terceiro número: "))

// Se são todos iguais
if (n1 == n2 && n1 == n3)
{
    document.writeln("Todos são iguais!")
}
else
{
    // verifica se N1 é o maior
    if (n1 > n2 && n1 > n3)
    {
        document.writeln("O maior número é: " + n1) 
    }
    // Se N1 não for o maior, então N2 ou N3 será. Aqui estamos verificando se N2 é o maior
    else if (n2 > n3)
    {
        document.writeln("O maior número é: " + n2) 
    }
    // Se N1 e N2 não forem os maiores, N3 será!
    else
    {
        document.writeln("O maior número é: " + n3) 
    }
}