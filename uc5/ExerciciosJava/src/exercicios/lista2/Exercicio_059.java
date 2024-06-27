package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_059 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome: ");
            String nome = input.next();
            System.out.print("Digite a idade: ");
            int idade = input.nextInt();
            soma += idade;
        }
        double media = (double) soma / 5;
        System.out.println("Media das idades: " + media);

        input.close();
    }
}
