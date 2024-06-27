package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_018 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Numero: ");
        int valor1 = input.nextInt();

        System.out.print("Outro numero: ");
        int valor2 = input.nextInt();

        if (valor1 > valor2) {
            System.out.println(valor1 + " e maior");
        }
        else {
            System.out.println(valor2 + " e maior");
        }

        input.close();
    }
}
