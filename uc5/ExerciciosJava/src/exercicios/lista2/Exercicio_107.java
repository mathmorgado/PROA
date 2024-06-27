package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_107 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int produtoDiagonalSecundaria = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = input.nextInt();
                if (i + j == 2) {
                    produtoDiagonalSecundaria *= matriz[i][j];
                }
            }
        }
        System.out.println("Produto da diagonal secundaria: " + produtoDiagonalSecundaria);
        input.close();
    }
}
