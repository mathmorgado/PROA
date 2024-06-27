package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_063 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        System.out.print("Digitos: ");
        for (int i = num; i > 0; i /= 10) {
            int digito = i % 10;
            System.out.print(digito + " ");
        }
        System.out.println();

        input.close();
    }
}
