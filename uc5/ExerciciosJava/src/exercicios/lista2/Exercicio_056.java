package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_056 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int num = input.nextInt();
        System.out.print("Divisores de " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        input.close();
    }
}
