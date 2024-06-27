package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_106 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        boolean iguais = true;
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
                if (matriz1[i][j] != matriz2[i][j]) {
                    iguais = false;
                }
            }
        }
        if (iguais) {
            System.out.println("As matrizes sao iguais.");
        } else {
            System.out.println("As matrizes nao sao iguais.");
        }

        input.close();
    }
}
