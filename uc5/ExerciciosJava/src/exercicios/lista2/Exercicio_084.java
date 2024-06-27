package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_084 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];
        int pares = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }
        System.out.println("Quantidade de pares: " + pares);
        input.close();
    }
}
