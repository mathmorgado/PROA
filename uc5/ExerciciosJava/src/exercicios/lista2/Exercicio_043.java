package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();

        int a = 0;
        int b = 1;

        while (a <= num) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }

        System.out.println();
    }
}
