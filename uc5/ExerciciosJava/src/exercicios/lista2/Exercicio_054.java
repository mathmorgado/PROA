package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_054 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um numero: ");
            int num = input.nextInt();
            soma += num;
        }

        double media = (double) soma / 5;
        System.out.println("Media: " + media);

        input.close();
    }
}
