package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();

        int i = 1;
        int soma = 0;

        while (i <= num) {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        }
        System.out.println("Soma dos pares: " + soma);
    }
}
