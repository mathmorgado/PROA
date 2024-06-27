package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_017 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = input.nextInt();

        if (idade >= 65) {
            System.out.println("Idoso");
        }
        else if (idade > 18) {
            System.out.println("Adulto");
        }
        else if (idade > 12) {
            System.out.println("Adolescente");
        }
        else {
            System.out.println("Crianca");
        }
        input.close();
    }
}
