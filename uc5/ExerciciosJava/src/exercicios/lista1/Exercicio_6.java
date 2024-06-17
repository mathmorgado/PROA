package exercicios.lista1;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        System.out.println("\nAntecessor: " + (numero-1));
        System.out.println("Sucecessor: " + (numero+1));
    }
}
