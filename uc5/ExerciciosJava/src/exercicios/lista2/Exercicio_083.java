package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_083 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[7];
        int soma = 0;
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
            soma += numeros[i];
        }
        double media = (double) soma / 7;
        System.out.println("Media: " + media);
        input.close();
    }
}
