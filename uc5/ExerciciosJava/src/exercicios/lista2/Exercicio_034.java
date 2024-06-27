package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_034 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = input.nextInt();

        if (idade >= 18 && idade <= 70) {
            System.out.println("O voto é obrigatório.");
        } else if (idade >= 16 || idade > 70) {
            System.out.println("O voto é facultativo.");
        } else {
            System.out.println("Não pode votar.");
        }

        input.close();
    }

}
