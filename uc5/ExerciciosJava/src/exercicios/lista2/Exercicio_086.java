package exercicios.lista2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_086 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
        }
        Arrays.sort(numeros);
        for (int num : numeros) {
            System.out.println(num);
        }
        input.close();
    }
}
