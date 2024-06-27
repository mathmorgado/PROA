package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_064 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        int fatorial = 1;
        for (int i = num; i > 0; i--) {
            fatorial *= i;
        }
        System.out.println("Fatorial: " + fatorial);

        input.close();
    }
}
