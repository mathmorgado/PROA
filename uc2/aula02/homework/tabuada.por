programa
{
	
	funcao inicio()
	{
		inteiro NumeroDaTabuada, ResultadoMultiplicacao
		inteiro contador = 1

		escreva("De qual número você deseja ver a tabuada? ")
		leia(NumeroDaTabuada)

		enquanto (contador < 11)
		{
			ResultadoMultiplicacao = NumeroDaTabuada * contador

			escreva(NumeroDaTabuada + " x " + contador + " = " + ResultadoMultiplicacao, "\n")

			contador = contador + 1
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 404; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */