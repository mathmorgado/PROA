package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_094 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
        }
        System.out.println("Numeros pares: ");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        input.close();
    }
}
