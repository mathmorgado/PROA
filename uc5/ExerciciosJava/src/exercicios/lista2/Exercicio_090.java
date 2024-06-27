package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_090 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];
        boolean temZero = false;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
            if (numeros[i] == 0) {
                temZero = true;
            }
        }
        if (temZero) {
            System.out.println("Algum numero é zero.");
        } else {
            System.out.println("Nenhum numero é zero.");
        }

        input.close();
    }
}
