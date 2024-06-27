package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_030 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de maçãs compradas: ");
        int numMacas = input.nextInt();

        double valorMacas = (numMacas >= 12) ? 0.5 : 0.4;
        double valorTotal = valorMacas * numMacas;

        System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);

        input.close();
    }

}
