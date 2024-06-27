package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_040 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");

        int num = input.nextInt();
        int i = 1;

        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
        input.close();
    }
}
