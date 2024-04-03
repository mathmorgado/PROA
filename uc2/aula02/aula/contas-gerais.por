programa
{
	
	funcao inicio()
	{
		inteiro num1, num2, soma, subtracao, multiplicacao, divisao

		escreva("Digite um número: ")
		leia(num1)

		se (num1 == 0)
		{
			escreva("Número não pode ser igual a 0! \nDigite um número: ")
			leia(num1)
		}

		escreva("Digite outro número: ")
		leia(num2)

		se (num2 == 0)
		{
			escreva("Número não pode ser igual a 0! \nDigite outro número: ")
			leia(num1)
		}
		

		soma = num1 + num2
		subtracao = num1 - num2
		multiplicacao = num1 * num2
		divisao = num1 / num2

		escreva(num1 + " + " + num2 + " = " + soma, "\n")
		escreva(num1 + " - " + num2 + " = " + subtracao, "\n")
		escreva(num1 + " x " + num2 + " = " + multiplicacao, "\n")
		escreva(num1 + " / " + num2 + " = " + divisao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 741; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */