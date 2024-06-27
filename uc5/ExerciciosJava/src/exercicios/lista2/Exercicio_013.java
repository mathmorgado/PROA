package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_013 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Numero: ");
        int valor1 = input.nextInt();

        System.out.print("Outro numero: ");
        int valor2 = input.nextInt();

        if (valor2 % valor1 == 0) {
            System.out.println(valor1 + " e multiplo de " + valor2);
        }
        else {
            System.out.println(valor1 + " nao e multiplo de " + valor2);
        }

        input.close();
    }
}
