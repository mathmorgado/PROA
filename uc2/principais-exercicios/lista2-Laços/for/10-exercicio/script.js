let fib1 = 0;
let fib2 = 1;
let intermediador;

for (let contador = 0; contador < 20; contador++)
{
    document.write(`${fib1}, `);

    intermediador = fib1
    fib1 = fib2;
    fib2 = intermediador + fib2;
}