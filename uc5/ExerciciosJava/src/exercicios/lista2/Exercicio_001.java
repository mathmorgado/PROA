package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int valor1 = input.nextInt();

        System.out.print("Digite outro numero: ");
        int valor2 = input.nextInt();

        int soma = valor1 + valor2;
        int subtracao = valor1 - valor2;
        int multiplicacao = valor1 * valor2;
        int divisao = valor1 / valor2;

        System.out.print("Soma: " + soma + "\nSubtracao: " + subtracao + "\nMultiplicacao: " + multiplicacao + "\nDivisao: " + divisao);
        input.close();
    }

}
