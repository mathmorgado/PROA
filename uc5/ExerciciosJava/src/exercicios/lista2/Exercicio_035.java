package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_035 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = input.nextInt();

        double media = (num1 + num2 + num3) / 3.0;

        String situacao = (media >= 7) ? "Aprovado" : "Reprovado";

        System.out.printf("Média: %.2f\nSituação: %s\n", media, situacao);
        input.close();
    }

}
