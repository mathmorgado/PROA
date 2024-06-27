package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();

        int i = 2;
        boolean isPrimo = true;

        while (i <= num / 2) {
            if (num % i == 0) {
                isPrimo = false;
                break;
            }
            i++;
        }

        if (isPrimo && num > 1) {
            System.out.println(num + " e primo");
        }
        else {
            System.out.println(num + " nao e primo");
        }
    }
}
