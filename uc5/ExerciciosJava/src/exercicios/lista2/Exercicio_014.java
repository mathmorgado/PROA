package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_014 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nos informe sua idade em anos, meses e dias");

        System.out.print("Anos: ");
        int anos = input.nextInt();

        System.out.print("meses: ");
        int meses = input.nextInt();

        System.out.print("dias: ");
        int dias = input.nextInt();

        int qtdDias = dias + (meses * 30) + (anos * 364);
        System.out.println("Voce viveu " + qtdDias + " dias!");

        input.close();
    }
}
