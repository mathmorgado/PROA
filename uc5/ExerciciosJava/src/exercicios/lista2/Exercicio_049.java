package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        int fatorial = 1;
        int i = num;

        while (i > 0) {
            fatorial *= i;
            i--;
        }
        System.out.println("Fatorial: " + fatorial);
    }
}
