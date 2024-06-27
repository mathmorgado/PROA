package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_104 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        boolean simetrica = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }
        if (simetrica) {
            System.out.println("A matriz e simetrica.");
        } else {
            System.out.println("A matriz nao e simetrica.");
        }

        input.close();
    }
}
