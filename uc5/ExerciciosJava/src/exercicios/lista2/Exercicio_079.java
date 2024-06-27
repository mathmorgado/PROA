package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_079 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        int fatorial = 1;
        do {
            fatorial *= num;
            num--;
        } while (num > 0);
        System.out.println("Fatorial: " + fatorial);

        input.close();
    }
}
