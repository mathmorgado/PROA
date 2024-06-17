package exercicios.lista1;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Porcentagem IPI: ");
        int porcentagemIPI = input.nextInt();

        // PEÇA 1
        System.out.print("\nCodigo da peca 1: ");
        int codigoPeca1 = input.nextInt();

        System.out.print("Valor da peca 1: ");
        int valorPeca1 = input.nextInt();

        System.out.print("Quantidade da peca 1: ");
        int quantidadePeca1 = input.nextInt();

        // PEÇA 2
        System.out.print("\nCodigo da peca 2: ");
        int codigoPeca2 = input.nextInt();

        System.out.print("Valor da peca 2: ");
        int valorPeca2 = input.nextInt();

        System.out.print("Quantidade da peca 2: ");
        int quantidadePeca2 = input.nextInt();

        int valorTotal = ((valorPeca1*quantidadePeca1)) + (valorPeca2*quantidadePeca2) * (porcentagemIPI/100 + 1);

        System.out.println("\nValor total = " + valorTotal);

    }
}
