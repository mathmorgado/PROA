package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_087 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        int positivos = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
            if (numeros[i] > 0) {
                positivos++;
            }
        }
        System.out.println("Quantidade de positivos: " + positivos);
        input.close();
    }
}
