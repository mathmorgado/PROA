package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_097 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[2][2];
        int soma = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = input.nextInt();
                soma += matriz[i][j];
            }
        }
        System.out.println("Soma: " + soma);

        input.close();
    }
}
