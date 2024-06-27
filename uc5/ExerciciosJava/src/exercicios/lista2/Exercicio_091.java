package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_091 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        int somaPositivos = 0, somaNegativos = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
            if (numeros[i] > 0) {
                somaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                somaNegativos += numeros[i];
            }
        }
        System.out.println("Soma dos positivos: " + somaPositivos);
        System.out.println("Soma dos negativos: " + somaNegativos);
        input.close();
    }
}
