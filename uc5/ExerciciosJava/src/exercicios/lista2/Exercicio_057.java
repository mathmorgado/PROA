package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_057 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        boolean isPrimo = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrimo = false;
                break;
            }
        }
        if (isPrimo && num > 1) {
            System.out.println(num + " e primo");
        } else {
            System.out.println(num + " nao e primo");
        }
        input.close();
    }
}
