/*
PRATO        |  CALORIAS  |  SOBREMESA       |  CALORIAS  |  BEBIDA           |  CALORIAS
Vegetariano  | 180 cal    | Abacaxi          | 75 cal     | Chá               | 20  cal
Peixe        | 230 cal    | Sorvete diet     | 110cal     | Suco de laranja   | 70  cal
Frango       | 250 cal    | Mouse diet       | 170 cal    | Suco de melão     | 100 cal
Carne        | 350 cal    | Mouse chocolate  | 200 cal    | Refrigerante diet | 65  cal
*/

function getCalorias(produto, opcaoEscolhida)
{
    // swich que vai fazer a verificação de qual é o produto (Prato, Sobremesa ou Bebida)
    switch(produto)
    {
        case "prato":
            switch(opcaoEscolhida)
            {
                // Opções de pratos!
                case 1: // Vegetariano
                    return 180 // retornando o valor da caloria da opção do produto escolhido!
                case 2: // Peixe
                    return 230 // retornando o valor da caloria da opção do produto escolhido!
                case 3: // Frango
                    return 250 // retornando o valor da caloria da opção do produto escolhido!
                case 4: // Carne
                    return 350 // retornando o valor da caloria da opção do produto escolhido!
            }
        
        case "sobremesa":
            switch(opcaoEscolhida)
            {
                // Opções de sobremesa!
                case 1: // Abacaxi
                    return 75 // retornando o valor da caloria da opção do produto escolhido!
                case 2: // Sorvet diet
                    return 110 // retornando o valor da caloria da opção do produto escolhido!
                case 3: // Mouse diet
                    return 170 // retornando o valor da caloria da opção do produto escolhido!
                case 4: // Mouse chocolate
                    return 200 // retornando o valor da caloria da opção do produto escolhido!
            }
        
        case "bebida":
            switch(opcaoEscolhida)
            {
                // Opções de bebida!
                case 1: // Chá
                    return 20 // retornando o valor da caloria da opção do produto escolhido!
                case 2: // Suco de laranja
                    return 70 // retornando o valor da caloria da opção do produto escolhido!
                case 3: // Suco de melão
                    return 100 // retornando o valor da caloria da opção do produto escolhido!
                case 4: // Refrigerante diet
                    return 65 // retornando o valor da caloria da opção do produto escolhido!
            }
    }
}

// variavel que vai armazernar o número do prato escolhido pelo usuário (1 = Vegetariano, 2 = Peixe ...)
let prato = parseInt(prompt("PRATOS \n1- Vegetariano \n2- Peixe \n3- Frango \n4- Carne \n Digite o número do prato que deseja: "))
let sobremesa = parseInt(prompt("SOBREMESAS \n1- Abacaxi \n2- Sorvet diet \n3- Mouse diet \n4- Mouse chocolate \n Digite o número da sobremesa que deseja: "))
let bebida = parseInt(prompt("PRATOS \n1- Chá \n2- Suco de laranja \n3- Suco de melão \n4- Refrigerante diet \n Digite o número da bebida que deseja: "))

// Variáveis que vão armazenar o valor da caloria específica da opção (1, 2, 3 ou 4) do produto (prato, sobremesa, bebida) escolhido pelo usuário Ex: Sobremesa 1 -> Abacaxi = 75cal
let caloriasPrato = getCalorias("prato", prato)
let caloriasSobremesa = getCalorias("sobremesa", sobremesa)
let caloriasBebida = getCalorias("bebida", bebida)

// variavel que armazena a calorial total consumida no conjunto de opções escolhidas!
let caloriasTotais = caloriasPrato + caloriasSobremesa + caloriasBebida

document.write("Calorias do prato escolhido : " + caloriasPrato + "<br>Calorias da sobremesa escolhida: " + caloriasSobremesa + "<br>Calorias da bebida escolhida: " + caloriasBebida + "<br>Calorias totais: " + caloriasTotais)