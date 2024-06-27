package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_003 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Base do triangulo: ");
        int base = input.nextInt();

        System.out.print("Altura do triangulo: ");
        int altura = input.nextInt();

        int area = base * altura / 2;

        System.out.println("Area = " + area);

        input.close();
    }
}
