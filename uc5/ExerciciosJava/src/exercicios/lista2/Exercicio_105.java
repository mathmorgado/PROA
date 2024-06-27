package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_105 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int[] somaColunas = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = input.nextInt();
                somaColunas[j] += matriz[i][j];
            }
        }
        for (int j = 0; j < 4; j++) {
            System.out.println("Soma da coluna " + j + ": " + somaColunas[j]);
        }
        input.close();
    }
}
