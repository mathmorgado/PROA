package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_007 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Salario base: R$");
        double salario = input.nextFloat();

        double salarioLiquido = salario + (salario * 0.05);

        System.out.println("Salario Liquido (5% de comissao): R$" + salarioLiquido);

        input.close();
    }
}
