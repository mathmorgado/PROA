/*
Informar um saldo e imprimir o saldo com reajuste de 1.5%.
*/

let saldo = 500
document.write("Seu saldo: R$" + saldo)

saldo = saldo + (saldo/100 * 1.5)
document.write("<br><br>Seu saldo foi reajustado em 1.5%. <br>Novo saldo: R$" + saldo)