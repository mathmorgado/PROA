package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_022 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Salario base: R$");
        double salario = input.nextFloat();
        double bonus;

        if (salario > 2000) {
            bonus = salario * 0.10;
        }
        else {
            bonus = salario * 0.05;
        }

        System.out.println("Seu bonus salarial e: R$" + bonus);
        input.close();
    }
}
