/*
Escrever um programa que leia:
- a porcentagem do IPI a ser acrescido no valor das peças 
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1 
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2 
O programa deve calcular o valor total a ser pago e apresentar o resultado. 
Cálculo : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

*/

let porcentagemIPI = parseInt(prompt("Porcentagem do IPI a ser acrescido no valor da peças: "))

let codigoPeca1 = parseInt(prompt("Código da peça 1:"))
let valorPeca1 = parseInt(prompt("Valor da peça 1:"))
let quantidadePeca1 = parseInt(prompt("Quantidade da peça 1:"))

let codigoPeca2 = parseInt(prompt("Código da peça 2:"))
let valorPeca2 = parseInt(prompt("Valor da peça 2:"))
let quantidadePeca2 = parseInt(prompt("Quantidade da peça 2:"))

let valorTotal = (valorPeca1*quantidadePeca1 + valorPeca2*quantidadePeca2) * (porcentagemIPI/100 + 1)

document.write("O valor total a se pagar é: " + valorTotal.toFixed(2))
