package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_044 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;
        int soma = 0;

        while (i < 5) {
            System.out.print("Digite o nome: ");
            String nome = input.next();

            System.out.print("Digite a idade: ");
            int idade = input.nextInt();

            soma += idade;
            i++;
        }
        double media = (double) soma / 5;
        System.out.println("Media das idades: " + media);
        input.close();
    }
}
