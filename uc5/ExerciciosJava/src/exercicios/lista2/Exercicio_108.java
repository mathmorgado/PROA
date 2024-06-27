package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            int maior = Integer.MIN_VALUE;
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = input.nextInt();
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            System.out.println("Maior valor da linha " + i + ": " + maior);
        }
        input.close();
    }
}
