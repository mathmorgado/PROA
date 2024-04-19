function sequenciaFibonacciRecursiva(num, fib1 = 0, fib2 = 1)
{
    // CASO BASE -> Final do Recursivo
    if (fib1 > num)
    {
        return // Retorno vazio, somente para encerrar as funções.
    }

    document.write(fib1 + " ") // Objetivo (imprimir os números da sequência)
    //                          num  fib1       fib2 
    sequenciaFibonacciRecursiva(num, fib2, (fib1 + fib2)) // chamada recursiva! Estamos passando o numero do usuário e os valores das variaveis fib1 e fib2
}

sequenciaFibonacciRecursiva(150)