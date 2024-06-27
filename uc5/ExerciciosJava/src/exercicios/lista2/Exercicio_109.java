package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        boolean identidade = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = input.nextInt();
                if (i == j && matriz[i][j] != 1) {
                    identidade = false;
                } else if (i != j && matriz[i][j] != 0) {
                    identidade = false;
                }
            }
        }
        if (identidade) {
            System.out.println("A matriz e identidade.");
        } else {
            System.out.println("A matriz nao e identidade.");
        }

        input.close();
    }
}
