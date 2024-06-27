package exercicios.lista2;

import java.util.Scanner;

public class Exercicio_050 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int somaIdades = 0;
        int contador = 0;

        while (true) {
            System.out.print("Digite o nome: ");
            String nome = input.next();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a idade: ");
            int idade = input.nextInt();
            somaIdades += idade;
            contador++;
        }

        if (contador > 0) {
            double media = (double) somaIdades / contador;
            System.out.println("Media das idades: " + media);
        }
        else {
            System.out.println("Nenhuma idade foi inserida.");
        }

        input.close();
    }
}
