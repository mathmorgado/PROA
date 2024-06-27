package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_005 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Preco: R$");
        float preco = input.nextFloat();

        System.out.print("Quantidade: ");
        float quantidade = input.nextFloat();

        float valorTotal = quantidade * preco;
        if (quantidade > 10) {
            valorTotal -= (valorTotal * 0.1);
            System.out.println("O valor total da sua compra, com 10% de desconta, e: R$" + valorTotal);
        }
        else {
            System.out.println("O valor total da sua compra e: R$" + valorTotal);
        }
        input.close();
    }
}
