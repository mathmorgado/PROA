// função que recebe como parâmetro 
function quadroIMC(imc)
{
    let quadro 
    
    if (imc <= 18.5)
    {
        quadro = "Você está abaixo do peso!"
    }
    else if (imc > 18.5 && imc < 24.9)
    {
        quadro = "Você está no peso ideal!"
    }
    else if (imc > 25 && imc < 29.9)
    {
        quadro = "Levemente acima do peso"
    }
    else if (imc > 30 && imc < 34.9)
    {
        quadro = "Obesidade de grau I"
    }
    else if (imc > 35 && imc < 39.9)
    {
        quadro = "Obesidade de grau II (severa)"
    }
    else if (imc > 40)
    {
        quadro = "Obesidade de grau III (mórbida)"
    }

    return quadro
}


const btn = document.querySelector("#enviar")
const resultadoIMC = document.querySelector("#imc")
const resultadoQuadroIMC = document.querySelector("#quadroIMC")

btn.addEventListener("click", function(e) {
    e.preventDefault()

    let peso = parseFloat(document.querySelector("#peso").value)
    let altura = parseFloat(document.querySelector("#altura").value)

    let imc = peso / altura**2

    let quadro = quadroIMC(imc)

    resultadoIMC.textContent = "Seu IMC é: " + imc.toFixed(2)
    resultadoQuadroIMC.textContent = quadro
})
