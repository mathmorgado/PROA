package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        System.out.print("Dígitos: ");
        while (num > 0) {
            int digito = num % 10;
            System.out.print(digito + " ");
            num /= 10;
        }
        System.out.println();
    }
}
