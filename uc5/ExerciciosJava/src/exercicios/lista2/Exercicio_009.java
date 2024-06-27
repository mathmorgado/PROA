package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_009 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        // Solicita o valor do depósito mensal
        System.out.print("Digite o valor do deposito mensal: R$");
        double depositoMensal = input.nextDouble();

        // Solicita a taxa de juros mensal
        System.out.print("Digite a taxa de juros mensal (em %): ");
        double taxaJurosMensal = input.nextDouble() / 100;

        // Inicializa o montante
        double montante = 0;

        // Calcula o montante após 12 meses
        for (int i = 0; i < 12; i++) {
            montante = montante * (1 + taxaJurosMensal) + depositoMensal;
        }

        // Exibe o montante após 12 meses
        System.out.printf("O montante apos 12 meses e: %.2f\n", montante);
        input.close();
    }
}
