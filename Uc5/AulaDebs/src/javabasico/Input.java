package javabasico;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = input.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = input.nextInt();

        System.out.println("\nO primeiro número é: " + num1 + "\nO Segundo número é: " + num2);
    }
}
