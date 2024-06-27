package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_012 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Peso: ");
        float peso = input.nextFloat();

        System.out.print("Altura: ");
        float altura = input.nextFloat();

        float imc = peso / (altura*altura);
        System.out.println("Seu imc e: " + imc);

        input.close();
    }
}
