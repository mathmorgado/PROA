package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_093 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
            if (numeros[i] >= 10 && numeros[i] <= 50) {
                count++;
            }
        }
        System.out.println("Quantidade no intervalo de 10 a 50: " + count);

        input.close();
    }
}
