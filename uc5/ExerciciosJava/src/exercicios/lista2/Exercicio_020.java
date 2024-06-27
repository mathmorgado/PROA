package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_020 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " e par!");
        }
        else {
            System.out.println(numero + " e impar!");
        }

        input.close();
    }
}
