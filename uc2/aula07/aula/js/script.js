/*
Sem o array, seria necessário criar 3 "gavetas" para armazenar apenas 1 "cueca" em cada uma

let carro01 = "Saab";
let carro02 = "Volvo";
let carro03 = "BMW";

Com array, você pode colocar as 3 cuecas em uma única gaveta!

document.getElementById("demo").innerHTML = carro01, carro02, carro03;
*/

const cars = ["Saab ", "Volvo ", "BMW"];
document.getElementById("demo").innerHTML = cars; // inner = trocar | Logo estou trocando o valor do elemento selecionado pelo valor contido dentro do array vetorial cars