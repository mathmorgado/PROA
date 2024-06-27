package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_039 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;
        int soma = 0;

        while (i < 5) {
            System.out.print("Digite um numero: ");
            int num = input.nextInt();

            soma += num;
            i++;
        }

        double media = (double) soma / 5;
        System.out.println("Media: " + media);
        input.close();
    }
}
