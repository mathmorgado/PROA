package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_011 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero real: ");
        float numero1 = input.nextFloat();

        System.out.print("Digite outro numero real: ");
        float numero2 = input.nextFloat();

        System.out.print("Digite outro numero real: ");
        float numero3 = input.nextFloat();

        float media = (numero1 + numero2 + numero3)/3;

        System.out.print(media);
        input.close();
    }
}
