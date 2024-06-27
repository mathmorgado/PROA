package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_026 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        double[] precos = {10.0, 20.0, 30.0, 40.0, 50.0};

        System.out.print("Digite o codigo do produto (1-5): ");
        int codigo = input.nextInt();
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = input.nextInt();

        double valorTotal = precos[codigo - 1] * quantidade;

        System.out.printf("Valor total a ser pago: R$", valorTotal);

        input.close();
    }
}
