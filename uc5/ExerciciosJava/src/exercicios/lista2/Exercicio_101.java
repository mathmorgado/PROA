package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int soma = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = input.nextInt();
                soma += matriz[i][j];
            }
        }
        double media = (double) soma / 16;
        System.out.println("Media: " + media);
        input.close();
    }
}
