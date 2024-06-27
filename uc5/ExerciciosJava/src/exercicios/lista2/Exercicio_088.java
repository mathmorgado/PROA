package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_088 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];
        int somaPares = 0, somaImpares = 0, contPares = 0, contImpares = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
                contPares++;
            } else {
                somaImpares += numeros[i];
                contImpares++;
            }
        }
        double mediaPares = contPares > 0 ? (double) somaPares / contPares : 0;
        double mediaImpares = contImpares > 0 ? (double) somaImpares / contImpares : 0;
        System.out.println("Media dos pares: " + mediaPares);
        System.out.println("Media dos impares: " + mediaImpares);

        input.close();
    }
}
