package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_024 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        int valor1 = input.nextInt();

        System.out.print("Segundo numero: ");
        int valor2 = input.nextInt();

        System.out.print("Terceiro numero: ");
        int valor3 = input.nextInt();

        if (valor1 < valor2 && valor1 < valor3) {
            System.out.println(valor1);
            if (valor2 < valor3) {
                System.out.println(valor2);
            }
            else {
                System.out.println(valor3);
            }
        }
        else {
            if (valor2 < valor3) {
                System.out.println(valor2);
                System.out.println(valor3);
            }
            else {
                System.out.println(valor3);
                System.out.println(valor2);
            }
        }

        input.close();
    }
}
