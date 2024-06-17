package exercicios.lista1;

import java.util.Scanner;

public class Exercicio_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Cotacao atual do dolar: ");
        double cotacaoDolar = input.nextDouble();

        System.out.print("Valor total disponivel em dolar: ");
        double qtdDolar = input.nextDouble();

        double conversaoDolarReal = qtdDolar / cotacaoDolar;
        System.out.println("\nConvertendo de Dolar para Real, você fica com: R$" + conversaoDolarReal);
    }
}
