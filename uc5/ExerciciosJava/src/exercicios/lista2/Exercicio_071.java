package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_071 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int num = input.nextInt();
        int i = 1;
        System.out.print("Divisores de " + num + ": ");
        do {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= num);
        System.out.println();
        input.close();
    }
}
