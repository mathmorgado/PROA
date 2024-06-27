package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_078 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        System.out.print("Digitos: ");
        do {
            int digito = num % 10;
            System.out.print(digito + " ");
            num /= 10;
        } while (num > 0);
        System.out.println();
        input.close();
    }
}
