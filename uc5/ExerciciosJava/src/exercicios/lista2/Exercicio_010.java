package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_010 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numeroTabuada = input.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada * i));
        }
        input.close();
    }
}
