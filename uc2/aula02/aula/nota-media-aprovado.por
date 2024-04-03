programa
{
	
	funcao inicio()
	{
		real nota1, nota2, nota3, nota4, media

		escreva("Nota do primeiro bimestre: ")
		leia(nota1)

		escreva("\nNota do Segundo bimestre: ")
		leia(nota2)

		escreva("\nNota do terceiro bimestre: ")
		leia(nota3)

		escreva("\nNota do quarto bimestre: ")
		leia(nota4)

		media = (nota1 + nota2 + nota3 + nota4) / 4.0

		escreva("Média: " + media)

		se (media >= 6)
		{
			escreva("APROVADO!!!")
		}

		senao
		{
			se (media >= 5)
			{
				escreva("Você está de recuperação!")
			}
			senao
			{
				escreva("Reprovado.")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 576; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */