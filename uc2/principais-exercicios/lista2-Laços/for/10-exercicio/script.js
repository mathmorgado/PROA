let fib1 = 0;
let fib2 = 1;
let contador = 0;
let intermediador;

while(contador < 20)
{
    document.write(`${fib1}, `);

    intermediador = fib1
    fib1 = fib2;
    fib2 = intermediador + fib2;

    contador++;
}