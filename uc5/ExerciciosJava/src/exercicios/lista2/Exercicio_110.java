package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] subtracaoMatrizes = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite um numero para a primeira matriz: ");
                matriz1[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite um numero para a segunda matriz: ");
                matriz2[i][j] = input.nextInt();
                subtracaoMatrizes[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(subtracaoMatrizes[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
