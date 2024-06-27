package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_085 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
        }
        int maior = numeros[0], menor = numeros[0];
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        input.close();
    }
}
