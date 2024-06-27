package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_081 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        input.close();
    }
}
