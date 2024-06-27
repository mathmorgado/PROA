package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_076 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        int soma = 0;
        int i = 1;
        do {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        } while (i <= num);
        System.out.println("Soma dos pares: " + soma);
        input.close();
    }
}
