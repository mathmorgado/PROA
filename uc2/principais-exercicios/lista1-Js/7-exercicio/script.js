/*
 Fazer um programa que imprima a média aritmética dos números 8,9 e 7. 
 A média dos números 4, 5 e 6. 
 A soma das duas médias. 
 A média das médias.
*/

let media897 = (8 + 9 + 7) / 3
let media456 = (4 + 5 + 6) / 3

let somaMedias = media897 + media456
let mediaDasMedias = (media897 + media456) / 2

document.write("Média [8, 9, 7] = " + media897)
document.write("<br>Média [4, 5, 6] = " + media456)
document.write("<br>Soma das médias = " + somaMedias)
document.write("<br>Média das médias [" + media897 + ", " + media456 + "] " + "= " + mediaDasMedias)
