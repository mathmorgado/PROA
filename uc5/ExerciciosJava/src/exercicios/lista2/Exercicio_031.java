package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_031 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do salario minimo: ");
        double salarioMinimo = input.nextDouble();

        System.out.print("Digite o salario do funcionario: ");
        double salarioFuncionario = input.nextDouble();

        double numSalariosMinimos = salarioFuncionario / salarioMinimo;

        System.out.printf("O funcionario recebe %.2f salarios iínimos.\n", numSalariosMinimos);

        input.close();
    }

}
