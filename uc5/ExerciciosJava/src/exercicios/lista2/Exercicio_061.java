package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_061 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        int soma = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println("Soma dos pares: " + soma);

        input.close();
    }
}
