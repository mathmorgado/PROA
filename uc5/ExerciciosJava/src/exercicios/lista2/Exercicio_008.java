package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_008 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor para A: ");
        int a = input.nextInt();

        System.out.print("Digite um valor para B: ");
        int b = input.nextInt();

        System.out.println("Valores");
        System.out.println("A = " + a + "\nB = " + b);

        // invertendo os valores
        int c = a;
        a = b;
        b = c;

        System.out.println("Valores invertidos");
        System.out.println("A = " + a + "\nB = " + b);
        input.close();
    }
}
