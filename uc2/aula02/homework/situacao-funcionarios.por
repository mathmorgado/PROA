programa
{
	
	funcao inicio()
	{
		inteiro idade, NumeroDeFilhos, TempoDeEmpresa
		real salario

		escreva("Idade: ")
		leia(idade)

		escreva("Número de filhos: ")
		leia(NumeroDeFilhos)

		escreva("Tempo de empresa (em anos): ")
		leia(TempoDeEmpresa)

		escreva("Salário: ")
		leia(salario)
		
		// IDADE DO FUNCIONÁRIO
		se (idade > 60)
		{
			escreva("Apresentar plano de aposentadoria para funcionário")
		}
		senao
		{
			escreva("SEM plano de aposentadoria para funcionário")
		}

		// QUANTIDADE DE FILHOS
		se (NumeroDeFilhos == 0)
		{
			escreva("Funcionário sem direita ao Auxílio Família")
		}
		senao
		{
			escreva("Funcionário com direito ao Auxílio Família")
		}

		// TEMPO DE EMPRESA
		se (TempoDeEmpresa > 5)
		{
			escreva("Funcionário com direito ao Abono Salarial")
		}
		senao
		{
			escreva("Funcionário sem direito ao Abono Salarial")
		}

		// SALÁRIO
		se (salario > 4.300)
		{
			escreva("Funcionário COM direito ao Seguro de Vida e Seguro Saúde")
		}
		senao
		{
			escreva("Funcionário SEM direito ao Seguro de Vida e Seguro Saúde")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1025; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */