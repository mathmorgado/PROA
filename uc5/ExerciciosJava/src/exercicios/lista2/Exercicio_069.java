package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_069 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0;
        int i = 0;
        do {
            System.out.print("Digite um numero: ");
            int num = input.nextInt();
            soma += num;
            i++;
        } while (i < 5);
        double media = (double) soma / 5;
        System.out.println("Media: " + media);

        input.close();
    }
}
