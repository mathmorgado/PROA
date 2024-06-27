package exercicios.lista2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_092 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
        }
        Arrays.sort(numeros);
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        input.close();
    }
}
