package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_041 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int num = input.nextInt();

        int i = 1;
        System.out.print("Divisores de " + num + ": ");

        while (i <= num) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
}
