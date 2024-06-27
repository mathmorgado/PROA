package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_015 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Salario: ");
        double salario = input.nextDouble();
        double salarioComAumento = salario + (salario * 0.15);

        System.out.println("Salario com 15% de aumento: R$" + salarioComAumento);

        input.close();
    }
}
