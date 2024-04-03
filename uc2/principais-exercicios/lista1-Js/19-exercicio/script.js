/*
Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). 
O programa deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário. 
*/

let cotacaoDolar = parseFloat(prompt("Cotação do dolar: U$"))
let quantidadeDolar = parseFloat(prompt("Quantidade de dólar disponível: "))

let valorReal = quantidadeDolar * cotacaoDolar

document.write("Quantidade em real: R$" + valorReal)