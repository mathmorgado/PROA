package exercicios.lista1;

import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salarioMinimo = 1212.00f;

        System.out.print("Salario: ");
        float salarioUsuario = input.nextFloat();

        float qtdSalarioMinimos = salarioUsuario / salarioMinimo;

        System.out.println("Você recebe " + qtdSalarioMinimos +" salarios minimos!");
    }
}
