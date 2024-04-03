/*
A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. 
Faça um programa que receba um valor de uma compra e mostre o valor das prestações. 
*/

let valorCompra = parseFloat(prompt("Valor da compra: "))
let valorPrestacoes = valorCompra/5

document.write("Valor das 5x prestações: R$" + valorPrestacoes)