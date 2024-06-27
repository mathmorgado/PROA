package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_058 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        int a = 0, b = 1;
        for (int i = 0; a <= num; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
        input.close();
    }
}
